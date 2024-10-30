package com.rancho_smart;

import java.time.LocalDateTime;

public class ProduccionCarneDTO {
    private Long idProduccionCarne;
    private Long idAnimal;
    private Float pesoRegistrado;
    private LocalDateTime fecha;
    private Long idLote;
    private Long idFinca;
    
    public ProduccionCarneDTO() {
    }

    public ProduccionCarneDTO(Long idAnimal, Float pesoRegistrado, LocalDateTime fecha, Long idLote, Long idFinca) {
        this.idAnimal = idAnimal;
        this.pesoRegistrado = pesoRegistrado;
        this.fecha = fecha;
        this.idLote = idLote;
        this.idFinca = idFinca;
    }

    public Long getIdProduccionCarne() {
        return idProduccionCarne;
    }

    public void setIdProduccionCarne(Long idProduccionCarne) {
        this.idProduccionCarne = idProduccionCarne;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Float getPesoRegistrado() {
        return pesoRegistrado;
    }

    public void setPesoRegistrado(Float pesoRegistrado) {
        this.pesoRegistrado = pesoRegistrado;
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
