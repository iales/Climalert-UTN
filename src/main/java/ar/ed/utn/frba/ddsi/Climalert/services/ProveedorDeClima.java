package ar.ed.utn.frba.ddsi.Climalert.services;

import ar.ed.utn.frba.ddsi.Climalert.DTOs.ClimaClientDTO;

public interface ProveedorDeClima {
  ClimaClientDTO obtenerDatosActuales();
}
