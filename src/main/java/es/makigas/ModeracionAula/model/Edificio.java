package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Edificio")
@View(name = "simple", members = "nombreEdificio, capacidadTotal")
@Tab(properties = "nombreEdificio, capacidadTotal")
public class Edificio extends Identifiable {

    @Required
    private String nombreEdificio;

    private Integer capacidadTotal;
}
