package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.HojaVida;


public interface HojaVidaService {
    HojaVida newHojaVida(HojaVida newHojaVida);
    Iterable<HojaVida> getAll();
    HojaVida modifyHojaVida(HojaVida hojaVida);
    Boolean deletHojaVida(Long idHojaVida);
}
