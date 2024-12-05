package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Facultad")
@View(name = "simple", members = "nombre") // Actualizamos para que se muestre 'nombre'
@Tab(properties = "nombre") // Usamos 'nombre' para mostrar en la tabla
public class Facultad extends Identifiable {

    @Required
    private String nombre; // Cambiado de 'facultad' a 'nombre'
}
