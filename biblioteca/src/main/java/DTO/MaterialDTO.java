package DTO;
import java.util.Date;

public class MaterialDTO {
        private String codigoId;
        private String titulo;
        private String tipo;
        private CdDTO cd;
        private LibroDTO libro;
        private RevistaDTO revista;
        private TesisDTO tesis;


    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public CdDTO getCd() {
        return cd;
    }

    public void setCd(CdDTO cd) {
        this.cd = cd;
    }

    public LibroDTO getLibro() {
        return libro;
    }

    public void setLibro(LibroDTO libro) {
        this.libro = libro;
    }

    public RevistaDTO getRevista() {
        return revista;
    }

    public void setRevista(RevistaDTO revista) {
        this.revista = revista;
    }

    public TesisDTO getTesis() {
        return tesis;
    }

    public void setTesis(TesisDTO tesis) {
        this.tesis = tesis;
    }
}


