package ar.ed.utn.frba.ddsi.Climalert.schedulers;
import ar.ed.utn.frba.ddsi.Climalert.services.ClimaService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClimaScheduler {
  private final ClimaService climaService;

  public ClimaScheduler(ClimaService climaService) {
    this.climaService = climaService;
  }

  @Scheduled(fixedRate = 300000)
  public void obtenerDatosClima(){
     this.climaService.registrarClimaActual();
  }
  //Empieza 15 segundos después para tener consistencia
  @Scheduled(fixedRate = 60000, initialDelay = 15000)
  public void evaluarAlertas() {
    climaService.evaluarAlertasCriticas();
  }
}
