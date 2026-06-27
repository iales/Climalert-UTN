package ar.ed.utn.frba.ddsi.Climalert.models.repositories;
import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;

public interface ClimaRepository {

  void save(Clima datos);

  Clima findLatest();
}
