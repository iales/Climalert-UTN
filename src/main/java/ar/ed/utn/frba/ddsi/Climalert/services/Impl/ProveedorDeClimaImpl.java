package ar.ed.utn.frba.ddsi.Climalert.services.Impl;

import ar.ed.utn.frba.ddsi.Climalert.DTOs.ClimaClientDTO;
import ar.ed.utn.frba.ddsi.Climalert.config.RestWeatherProperties;
import ar.ed.utn.frba.ddsi.Climalert.services.ProveedorDeClima;
import java.net.URI;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ProveedorDeClimaImpl implements ProveedorDeClima {
  private final RestTemplate restTemplate;
  private final RestWeatherProperties properties;

  public ProveedorDeClimaImpl(RestTemplate restTemplate, RestWeatherProperties properties) {
    this.restTemplate = restTemplate;
    this.properties = properties;
  }

  @Override
  public ClimaClientDTO obtenerDatosActuales() {
    URI uri = UriComponentsBuilder.fromUriString(properties.getBaseUrl())
        .path("/current.json")
        .queryParam("key", properties.getApiKey())
        .queryParam("q", "Buenos Aires")
        .build()
        .toUri();
    return restTemplate.getForObject(uri, ClimaClientDTO.class);
  }
}