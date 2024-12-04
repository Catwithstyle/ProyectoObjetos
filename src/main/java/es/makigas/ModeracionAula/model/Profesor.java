package es.makigas.ModeracionAula.model;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;


@Entity @Getter @Setter
public class Profesor extends Identifiable {
	
	private String nombre1;

	private String nombre2;

	private String apellido;

	private String apellido2;

	private String cif;

	private TipoDocente TipoDocente;

}
