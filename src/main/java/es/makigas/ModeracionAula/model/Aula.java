package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@Table(name = "Aula")
@View(name = "simple", members = "nombre, edificio")
@Tab(properties = "nombre, edificio.nombreEdificio, capacidad")
public class Aula extends Identifiable {

    @Required
    private String nombre;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Edificio edificio;

    @Min(1)
    private Integer capacidad;
}
