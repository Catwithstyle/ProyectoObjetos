package es.makigas.ModeracionAula.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Profesor")
@View(name = "simple", members = "nombreCompleto, tipoDocente, cif")
@Tab(properties = "nombre1, nombre2, apellido, apellido2, tipoDocente, cif")
public class Profesor extends Identifiable {

	private String nombre1;

	private String nombre2;

	private String apellido;

	private String apellido2;

	@Column(unique = true, nullable = false)
	private String cif;

	@Enumerated(EnumType.STRING)
	private TipoDocente tipoDocente;

	@ReadOnly
	public String getNombreCompleto() {
		return nombre1 + " " + (nombre2 != null ? nombre2 + " " : "") + apellido + " " + apellido2;
	}
}
