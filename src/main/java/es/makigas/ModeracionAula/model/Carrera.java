package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Carrera")
@View(name = "simple", members = "nombre, facultad")
@Tab(properties = "nombre, facultad.nombre") // Usamos 'facultad.nombre' para mostrar en la tabla
public class Carrera extends Identifiable {

    @Required
    private String nombre; // Nombre de la carrera

    @ManyToOne(optional = false)
    @DescriptionsList(descriptionProperties = "nombre") // Especificamos que use 'nombre' de Facultad
    private Facultad facultad; // Relación con Facultad
}
