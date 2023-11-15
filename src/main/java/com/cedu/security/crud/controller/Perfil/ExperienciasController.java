package com.cedu.security.crud.controller.Perfil;

import com.cedu.security.crud.model.Perfil.Experiencias;
import com.cedu.security.crud.service.Perfil.ExperienciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/experiencias")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8080"})
public class ExperienciasController {

    @Autowired
        private ExperienciasService experienciasService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevoExperiencias")
    public Experiencias newExperiencias(@RequestBody Experiencias newExperiencias){
        return this.experienciasService.newExperiencias(newExperiencias);
    }

    @GetMapping("/mostrarExperiencias")
    public Iterable<Experiencias> getAll(){
        return experienciasService.getAll();
    }

    @PostMapping("/modificarExperiencias")
    public Experiencias updateExperiencias(@RequestBody Experiencias experiencias){
        return this.experienciasService.modifyExperiencias(experiencias);
    }

    @PostMapping(value = "/borrarExperiencias/{titulo}")
    public Boolean deleteExperiencias(@PathVariable(value="titulo") String titulo){
        return this.experienciasService.deletExperiencias(titulo);
    }
}
