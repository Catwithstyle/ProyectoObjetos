package es.makigas.ModeracionAula.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;

@Entity @Getter @Setter
public class Aula extends Identifiable {

    private String numeroAula;

    private Edificio edificio;

    private String capacidad;




}
