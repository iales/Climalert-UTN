package ar.ed.utn.frba.ddsi.Climalert.models.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ciudad {
  private String pais;

  private String region;

  private String fechaHora;
}
