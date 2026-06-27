package ar.ed.utn.frba.ddsi.Climalert.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentClientDTO {

  @JsonProperty("humidity")
  private Integer humedad;

  @JsonProperty("temp_c")
  private Double temperatura;
}
