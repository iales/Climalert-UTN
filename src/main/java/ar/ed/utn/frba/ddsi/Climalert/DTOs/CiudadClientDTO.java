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
public class CiudadClientDTO {

  @JsonProperty("country")
  private String pais;

  @JsonProperty("region")
  private String region;

  @JsonProperty("localtime")
  private String fechaHora;
}
