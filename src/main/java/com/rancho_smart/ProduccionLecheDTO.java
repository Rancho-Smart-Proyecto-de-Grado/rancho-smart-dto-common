package com.rancho_smart;

import java.time.LocalDateTime;

public class ProduccionLecheDTO {
    private Long idProduccionLeche;
    private Long idAnimal;
    private Float cantidadRegistrada;
    private LocalDateTime fecha;
    private Long idLote;
    private Long idFinca;
    
    public ProduccionLecheDTO() {
    }

    public ProduccionLecheDTO(Long idAnimal, Float cantidadRegistrada, LocalDateTime fecha, Long idLote, Long idFinca) {
        this.idAnimal = idAnimal;
        this.cantidadRegistrada = cantidadRegistrada;
        this.fecha = fecha;
        this.idLote = idLote;
        this.idFinca = idFinca;
    }

    public Long getIdProduccionLeche() {
        return idProduccionLeche;
    }

    public void setIdProduccionLeche(Long idProduccionLeche) {
        this.idProduccionLeche = idProduccionLeche;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Float getCantidadRegistrada() {
        return cantidadRegistrada;
    }

    public void setCantidadRegistrada(Float cantidadRegistrada) {
        this.cantidadRegistrada = cantidadRegistrada;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    
}
