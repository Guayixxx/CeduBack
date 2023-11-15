package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.Estudios;


public interface EstudiosService {
    Estudios newEstudios(Estudios newEstudios);
    Iterable<Estudios> getAll();
    Estudios modifyEstudios(Estudios estudios);
    Boolean deletEstudios(String nivelEducacion);
}
