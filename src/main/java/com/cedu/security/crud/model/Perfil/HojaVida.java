package com.cedu.security.crud.model.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class HojaVida {
    @Id
    @Column
    private Long cedula;
    @Column
    private String nombre;
    @Column
    private String correo;
}
