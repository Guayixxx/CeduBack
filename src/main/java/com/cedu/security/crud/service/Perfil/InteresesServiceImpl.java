package com.cedu.security.crud.service.Perfil;


import com.cedu.security.crud.model.Perfil.Intereses;
import com.cedu.security.crud.repository.Perfil.InteresesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InteresesServiceImpl implements InteresesService{
    @Autowired
    private InteresesRepository interesesRepsoitory;
    @Override
    public Intereses newIntereses(Intereses newIntereses) {
        return interesesRepsoitory.save(newIntereses);
    }

    @Override
    public Iterable<Intereses> getAll() {
        return this.interesesRepsoitory.findAll();
    }



}
