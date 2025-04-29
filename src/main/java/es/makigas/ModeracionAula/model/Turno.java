package es.makigas.ModeracionAula.model;

import javax.persistence.*;

@Table(name = "Turno")
public enum Turno {
    MAÑANA("Mañana"),
    TARDE("Tarde"),
    NOCHE("Noche");

    private final String descripcion;

    Turno(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
