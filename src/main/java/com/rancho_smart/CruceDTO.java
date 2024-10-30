package com.rancho_smart;

import java.time.LocalDateTime;

public class CruceDTO {
    private Long idCruce;
    private Long idMadre;
    private Long idPadre;
    private String padre;
    private LocalDateTime fecha;
    private boolean exito;
    private boolean ejecutado;
    private int calificacion;
    
    public CruceDTO() {
    }

    public CruceDTO(Long idMadre, Long idPadre, String padre, LocalDateTime fecha, boolean exito, boolean ejecutado,
            int calificacion) {
        this.idMadre = idMadre;
        this.idPadre = idPadre;
        this.padre = padre;
        this.fecha = fecha;
        this.exito = exito;
        this.ejecutado = ejecutado;
        this.calificacion = calificacion;
    }

    public Long getIdCruce() {
        return idCruce;
    }

    public void setIdCruce(Long idCruce) {
        this.idCruce = idCruce;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public boolean isEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(boolean ejecutado) {
        this.ejecutado = ejecutado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
}
