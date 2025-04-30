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
@View(name = "simple", members = "nombre")
@Tab(properties = "nombre")
public class Facultad extends Identifiable {

    @Required
    @Column(length = 100)
    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }
}
