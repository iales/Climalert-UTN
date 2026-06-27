package ar.ed.utn.frba.ddsi.Climalert.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "climalert")
@Data
public class RestWeatherProperties {
  private String baseUrl;
  private String apiKey;

}
