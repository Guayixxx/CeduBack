package com.cedu.security.crud.controller.Perfil;


import com.cedu.security.crud.model.Perfil.HojaVida;
import com.cedu.security.crud.service.Perfil.HojaVidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/hojaVida")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8080"})
public class HojaVidaController {

    @Autowired
    private HojaVidaService hojaVidaService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevoHojaVida")
    public HojaVida newHojaVida(@RequestBody HojaVida newHojaVida){
        return this.hojaVidaService.newHojaVida(newHojaVida);
    }

    @GetMapping("/mostrarHojaVida")
    public Iterable<HojaVida> getAll(){
        return hojaVidaService.getAll();
    }


    @PostMapping("/modificarHojaVida")
    public HojaVida updateHojaVida(@RequestBody HojaVida hojaVida){
        return this.hojaVidaService.modifyHojaVida(hojaVida);
    }

    @PostMapping(value = "/borrarHojaVida/{id}")
    public Boolean deleteHojaVida(@PathVariable(value="id") Long id){
        return this.hojaVidaService.deletHojaVida(id);
    }
}
