package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Marcado") // Define el nombre de la tabla en la base de datos.
public class Marcado extends Identifiable {

    @ManyToOne(optional = false)
    @DescriptionsList
    private Aula aula;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Profesor profesor;

    @Column(nullable = false)
    private boolean asistencia;

    @ManyToOne(optional = false)
    @DescriptionsList
    private Clase clase;

    @Column(nullable = false)
    @Stereotype("DATETIME") // Define que este campo será de tipo fecha y hora en OpenXava.
    private LocalDateTime horaInicio;

    @Column(nullable = true)
    @Stereotype("DATETIME")
    private LocalDateTime horaFinal;

    @Enumerated(EnumType.STRING) // Almacena el valor del enum Turno como texto en la base de datos.
    @Required // Indica que este campo es obligatorio.
    private Turno turno;
}
