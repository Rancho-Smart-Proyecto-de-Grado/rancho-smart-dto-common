package com.rancho_smart;

import java.time.LocalDateTime;

public class PartosDTO {
    private Long idParto;
    private Long idAnimal;
    private LocalDateTime fecha;
    private Long idMadre;
    private String observaciones;
    private byte[] foto;
    
    public PartosDTO() {
    }

    public PartosDTO(Long idAnimal, LocalDateTime fecha, Long idMadre, String observaciones, byte[] foto) {
        this.idAnimal = idAnimal;
        this.fecha = fecha;
        this.idMadre = idMadre;
        this.observaciones = observaciones;
        this.foto = foto;
    }

    public Long getIdParto() {
        return idParto;
    }

    public void setIdParto(Long idParto) {
        this.idParto = idParto;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
}
