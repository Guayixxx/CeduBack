package com.cedu.security.crud.controller.Perfil;

import com.cedu.security.crud.model.Perfil.Estudios;
import com.cedu.security.crud.service.Perfil.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/estudios")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8080"})
public class EstudiosController {

    @Autowired
        private EstudiosService estudiosService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevoEstudios")
    public Estudios newEstudios(@RequestBody Estudios newEstudios){
        return this.estudiosService.newEstudios(newEstudios);
    }

    @GetMapping("/mostrarEstudios")
    public Iterable<Estudios> getAll(){
        return estudiosService.getAll();
    }

    @PostMapping("/modificarEstudios")
    public Estudios updateEstudios(@RequestBody Estudios estudios){
        return this.estudiosService.modifyEstudios(estudios);
    }

    @PostMapping(value = "/borrarEstudios/{nivelEducacion}")
    public Boolean deleteEstudios(@PathVariable(value="nivelEducacion") String nivelEducacion){
        return this.estudiosService.deletEstudios(nivelEducacion);
    }
}
