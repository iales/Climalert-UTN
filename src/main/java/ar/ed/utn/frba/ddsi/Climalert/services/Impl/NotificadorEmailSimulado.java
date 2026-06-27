package ar.ed.utn.frba.ddsi.Climalert.services.Impl;
import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;
import ar.ed.utn.frba.ddsi.Climalert.services.NotificadorEmail;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmailSimulado implements NotificadorEmail {
  private final List<String> destinatarios = List.of(
      "admin@clima.com",
      "emergencias@clima.com",
      "meteorologia@clima.com"
  );

  @Override
  public void enviarAlerta(Clima clima) {
    for(String destinatario : destinatarios){
      System.out.println("Asunto: ALERTA METEOROLÓGICA ");
      System.out.println(" - Temperatura Actual: " + clima.getTemperatura() + "°C (Límite: >35°C)");
      System.out.println(" - Humedad Actual: " + clima.getHumedad() + "% (Límite: >60%)");
    }
  }
}
