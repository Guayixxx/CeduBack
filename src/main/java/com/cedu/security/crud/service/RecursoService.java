package com.cedu.security.crud.service;


import com.cedu.security.crud.model.Recurso;

public interface RecursoService {
    Recurso newRecurso(Recurso newRecurso);
    Iterable<Recurso> getAll();
    Recurso modifyRecurso(Recurso recurso);
    Boolean deletRecurso(String tipoRecurso);
}
