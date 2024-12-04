package DTO;

import java.sql.Date;

public class TesisDTO {
    private String Autor;
    private String Carrera;
    private String Asesor;
    private int AnioPublicacion;

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getAsesor() {
        return Asesor;
    }

    public void setAsesor(String asesor) {
        Asesor = asesor;
    }

    public int getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }
}
