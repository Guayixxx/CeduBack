package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.Experiencias;


public interface ExperienciasService {
    Experiencias newExperiencias(Experiencias newExperiencias);
    Iterable<Experiencias> getAll();
    Experiencias modifyExperiencias(Experiencias experiencias);
    Boolean deletExperiencias(String titulo);
}
