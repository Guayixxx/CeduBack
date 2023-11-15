package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.Intereses;


public interface InteresesService {
    Intereses newIntereses(Intereses newIntereses);
    Iterable<Intereses> getAll();
}
