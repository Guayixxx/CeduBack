package com.cedu.security.crud.model.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Intereses {
    @Id
    @Column
    private String interes;

}
