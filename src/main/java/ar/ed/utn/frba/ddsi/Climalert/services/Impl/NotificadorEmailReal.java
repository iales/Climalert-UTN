package ar.ed.utn.frba.ddsi.Climalert.services.Impl;

import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;
import ar.ed.utn.frba.ddsi.Climalert.services.NotificadorEmail;
import java.util.List;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class NotificadorEmailReal implements NotificadorEmail {
  private final JavaMailSender mailSender;
  private final List<String> destinatarios = List.of("admin@clima.com", "emergencias@clima.com", "meteorologia@clima.com");

  public NotificadorEmailReal(JavaMailSender mailSender) {
    this.mailSender = mailSender;
  }

  @Override
  public void enviarAlerta(Clima clima) {
    SimpleMailMessage mensaje = new SimpleMailMessage();

    String cuerpoDelMensaje =
        "ATENCIÓN: Se han detectado condiciones climáticas peligrosas\n" +
            "Con una Temperatura de " + clima.getTemperatura() + "°C" +
            " y Humedad de "+ clima.getHumedad() + "%\n" +
            "Por favor, tomar las precauciones necesarias.\n";



    for(String destinatario : destinatarios){

      mensaje.setTo(destinatario);
      mensaje.setSubject("ALERTA METEOROLÓGICA");
      mensaje.setText(cuerpoDelMensaje);

      try {
        mailSender.send(mensaje);
        System.out.println("ALERTA ENVIADA EXITOSAMENTE A: " + String.join(", ", destinatarios));

      } catch (Exception e) {
        System.err.println("ERROR AL ENVIAR EL CORREO"); // crearia un excepcion personalizada
      }
    }
  }
}


/*
Esta clase se hizo con el objetivo de mostrar como armaria el verdadero envío del email,
Para esto debería instalarse las dependencias de oficiales para hacer el envío "spring-boot-starter-mail"
y también agregar application.yaml las configuraciones necesarias
*/

