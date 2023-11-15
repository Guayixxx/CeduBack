package com.cedu.security.crud.controller.Perfil;



import com.cedu.security.crud.model.Perfil.Intereses;
import com.cedu.security.crud.service.Perfil.InteresesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/intereses")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8080"})
public class InteresesController {

    @Autowired
    private InteresesService interesesService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevoIntereses")
    public Intereses newIntereses(@RequestBody Intereses newIntereses){
        return this.interesesService.newIntereses(newIntereses);
    }

    @GetMapping("/mostrarIntereses")
    public Iterable<Intereses> getAll(){
        return interesesService.getAll();
    }

}
