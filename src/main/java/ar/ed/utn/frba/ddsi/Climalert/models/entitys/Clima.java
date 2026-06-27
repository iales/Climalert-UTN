package ar.ed.utn.frba.ddsi.Climalert.models.entitys;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Clima {
  private Long Id;

  private final Ciudad ciudad;

  private final Integer humedad;

  private final Double temperatura;

  public Clima(Ciudad ciudad, Integer humedad, Double temperatura) {
    this.ciudad = ciudad;
    this.humedad = humedad;
    this.temperatura = temperatura;
  }
}
