package ar.ed.utn.frba.ddsi.Climalert.models.repositories;

import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryClimaRepository implements ClimaRepository{
  private final GeneradorIdSecuencial generadorId = new GeneradorIdSecuencial();
  private final List<Clima> climas = new ArrayList<>();

  @Override
  public void save(Clima clima) {
    if(clima.getId() == null)
      clima.setId(generadorId.siguiente());
    climas.add(clima);
  }

  @Override
  public Clima findLatest() {
    if (this.climas.isEmpty()) {
      return null;
    }
    return this.climas.get(this.climas.size() - 1);
  }
}
