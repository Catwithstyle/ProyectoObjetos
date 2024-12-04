package es.makigas.ModeracionAula.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;

@Entity @Getter @Setter
public class Edificio extends Identifiable {

    private String nombreEdificio;

}
