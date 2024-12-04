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
@View(name = "simple", members = "facultad")
@Tab(properties = "facultad")
public class Facultad extends Identifiable {

    @Required
    private String facultad;
}
