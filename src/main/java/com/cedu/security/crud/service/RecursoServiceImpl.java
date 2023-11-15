package com.cedu.security.crud.service;

import com.cedu.security.crud.model.Recurso;
import com.cedu.security.crud.repository.RecursoRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RecursoServiceImpl implements RecursoService{
    @Autowired
    private RecursoRepsoitory recursoRepsoitory;
    @Override
    public Recurso newRecurso(Recurso newRecurso) {
        return recursoRepsoitory.save(newRecurso);
    }

    @Override
    public Iterable<Recurso> getAll() {
        return this.recursoRepsoitory.findAll();
    }

    @Override
    public Recurso modifyRecurso(Recurso recurso) {
        Optional<Recurso> recursoEncontrado=this.recursoRepsoitory.findById(recurso.getDescripcion());
        if(recursoEncontrado.get() != null){
            recursoEncontrado.get().setUrlImagen(recurso.getUrlImagen());
            recursoEncontrado.get().setTipoArchivo(recurso.getTipoArchivo());
            this.newRecurso(recursoEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletRecurso(String descripcion) {
        this.recursoRepsoitory.deleteById(descripcion);
        return true;
    }

}
