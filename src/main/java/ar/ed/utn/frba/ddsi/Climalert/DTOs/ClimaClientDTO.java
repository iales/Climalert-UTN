package ar.ed.utn.frba.ddsi.Climalert.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClimaClientDTO {

  @JsonProperty("location")
  private CiudadClientDTO ciudadClientDTO;

  @JsonProperty("current")
  private CurrentClientDTO clima;
}
