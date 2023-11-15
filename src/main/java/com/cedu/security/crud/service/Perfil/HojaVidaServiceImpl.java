package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.HojaVida;
import com.cedu.security.crud.repository.Perfil.HojaVidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HojaVidaServiceImpl implements HojaVidaService{
    @Autowired
    private HojaVidaRepository hojaVidaRepsoitory;
    @Override
    public HojaVida newHojaVida(HojaVida newHojaVida) {
        return hojaVidaRepsoitory.save(newHojaVida);
    }

    @Override
    public Iterable<HojaVida> getAll() {
        return this.hojaVidaRepsoitory.findAll();
    }

    @Override
    public HojaVida modifyHojaVida(HojaVida hojaVida) {
        Optional<HojaVida> hojaVidaEncontrado=this.hojaVidaRepsoitory.findById(hojaVida.getCedula());
        if(hojaVidaEncontrado.get() != null){
            hojaVidaEncontrado.get().setNombre(hojaVida.getNombre());
            hojaVidaEncontrado.get().setCorreo(hojaVida.getCorreo());
            this.newHojaVida(hojaVidaEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletHojaVida(Long idHojaVida) {
        this.hojaVidaRepsoitory.deleteById(idHojaVida);
        return true;
    }

}
