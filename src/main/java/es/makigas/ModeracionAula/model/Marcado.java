package es.makigas.ModeracionAula.model;
import org.openxava.annotations.*;
import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;
import javax.persistence.*;




import java.time.LocalTime;  // Cambiado de java.util.Date a LocalTime

@Entity
@Getter
@Setter
@Table(name = "Marcado")
public class Marcado extends Identifiable {

    @ManyToOne(optional = false)
    @DescriptionsList
    private Aula aula;

    @ManyToOne(optional = false)
    @DescriptionsList(descriptionProperties = "nombreCompleto")
    private Profesor profesor;

    @Column(nullable = false)
    private boolean asistencia;

    @ManyToOne(optional = false)
    @DescriptionsList(descriptionProperties = "nombreClase")
    private Clase clase;

    @Column(nullable = false)
    private LocalTime horaInicio;  // Tipo cambiado a LocalTime

    @Column(nullable = true)
    private LocalTime horaFinal;   // Tipo cambiado a LocalTime

    @Enumerated(EnumType.STRING)
    @Required
    private Turno turno;
}
