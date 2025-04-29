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
@View(name = "simple", members = "nombreEdificio")
@Tab(properties = "nombreEdificio") // Configuración de las columnas en la tabla
public class Edificio extends Identifiable {

    @Required // Campo obligatorio
    private String nombreEdificio; // Propiedad principal del edificio

}
