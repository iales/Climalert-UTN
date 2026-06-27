package ar.ed.utn.frba.ddsi.Climalert.services;

import ar.ed.utn.frba.ddsi.Climalert.models.entitys.Clima;

public interface NotificadorEmail {
  void enviarAlerta(Clima clima);
}
