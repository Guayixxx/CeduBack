package com.cedu.security.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Recurso {
    @Id
    @Column
    private String descripcion;
    @Column
    private String tipoArchivo;
    @Column
    private String urlImagen;


}
