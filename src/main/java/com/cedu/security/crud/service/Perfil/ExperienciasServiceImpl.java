package com.cedu.security.crud.service.Perfil;

import com.cedu.security.crud.model.Perfil.Experiencias;
import com.cedu.security.crud.repository.Perfil.ExperienciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienciasServiceImpl implements ExperienciasService{
    @Autowired
    private ExperienciasRepository experienciasRepsoitory;
    @Override
    public Experiencias newExperiencias(Experiencias newExperiencias) {
        return experienciasRepsoitory.save(newExperiencias);
    }

    @Override
    public Iterable<Experiencias> getAll() {
        return this.experienciasRepsoitory.findAll();
    }

    @Override
    public Experiencias modifyExperiencias(Experiencias experiencias) {
        Optional<Experiencias> experienciasEncontrado=this.experienciasRepsoitory.findById(experiencias.getTitulo());
        if(experienciasEncontrado.get() != null){
            experienciasEncontrado.get().setTitulo(experiencias.getTitulo());
            experienciasEncontrado.get().setEmpresa(experiencias.getEmpresa());
            experienciasEncontrado.get().setCargo(experiencias.getCargo());
            experienciasEncontrado.get().setDuracion(experiencias.getDuracion());
            this.newExperiencias(experienciasEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletExperiencias(String titulo) {
        this.experienciasRepsoitory.deleteById(titulo);
        return true;
    }

}
