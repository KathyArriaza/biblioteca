package DTO;

import java.sql.Date;

public class RevistaDTO {

        private String Editorial;
        private Date FechaPublicacion;
        private String Periodicidad;

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public String getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        Periodicidad = periodicidad;
    }
}
