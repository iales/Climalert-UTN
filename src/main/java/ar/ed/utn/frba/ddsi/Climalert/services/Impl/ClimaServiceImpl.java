package ar.ed.utn.frba.ddsi.Climalert.services.Impl;

import ar.ed.utn.frba.ddsi.Climalert.DTOs.ClimaClientDTO;
import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Ciudad;
import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;
import ar.ed.utn.frba.ddsi.Climalert.models.repositories.ClimaRepository;
import ar.ed.utn.frba.ddsi.Climalert.services.ClimaService;
import ar.ed.utn.frba.ddsi.Climalert.services.NotificadorEmail;
import ar.ed.utn.frba.ddsi.Climalert.services.ProveedorDeClima;
import org.springframework.stereotype.Service;

@Service
public class ClimaServiceImpl implements ClimaService {
  private final ProveedorDeClima proveedorDeClima;
  private final ClimaRepository climaRepository;
  private final NotificadorEmail notificadorEmail;

  public ClimaServiceImpl(ProveedorDeClima proveedorDeClima, ClimaRepository climaRepository, NotificadorEmail notificadorEmail) {
    this.proveedorDeClima = proveedorDeClima;
    this.climaRepository = climaRepository;
    this.notificadorEmail = notificadorEmail;
  }

  @Override
  public void registrarClimaActual() {

    ClimaClientDTO datosClimaApi = proveedorDeClima.obtenerDatosActuales();
    Ciudad ciudad = new Ciudad(
        datosClimaApi.getCiudadClientDTO().getPais(),
        datosClimaApi.getCiudadClientDTO().getRegion(),
        datosClimaApi.getCiudadClientDTO().getFechaHora()
        );
    Clima clima = new Clima(ciudad,datosClimaApi.getClima().getHumedad(), datosClimaApi.getClima().getTemperatura());
    climaRepository.save(clima);
  }

  @Override
  public void evaluarAlertasCriticas() {
    Clima ultimoClima = climaRepository.findLatest();
    if(ultimoClima == null) return;

    if (ultimoClima.getTemperatura() + 35  > 35 && ultimoClima.getHumedad() + 60 > 60) {
      notificadorEmail.enviarAlerta(ultimoClima);
    }
  }
}

