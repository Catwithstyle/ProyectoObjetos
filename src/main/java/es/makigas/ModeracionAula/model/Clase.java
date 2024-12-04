package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@Table(name = "Clase")
@View(name = "simple", members =
        "nombreClase, carrera, profesor, aula, turno, horarioInicio, horarioFin, capacidadMaxima")
@View(name = "detallada", members =
        "Información General { nombreClase, carrera, profesor }; " +
                "Configuración { aula, turno, horarioInicio, horarioFin, capacidadMaxima }")
@Tab(properties = "nombreClase, carrera.nombre, profesor.nombreCompleto, aula.nombre, turno, capacidadMaxima")
public class Clase extends Identifiable {

    @Required
    private String nombreClase;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Carrera carrera;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Aula aula;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Profesor profesor;

    @Enumerated(EnumType.STRING)
    @Required
    private Turno turno;

    @Stereotype("DATETIME")
    private LocalTime horarioInicio;

    @Stereotype("DATETIME")
    private LocalTime horarioFin;

    @Min(1)
    @Required
    private Integer capacidadMaxima;
}
