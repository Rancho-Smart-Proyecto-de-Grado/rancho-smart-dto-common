package com.rancho_smart;

public class CalidadCarneDTO {
    private Long idCalidadCarne;
    private Long idAnimal;
    private String observaciones;
    private String resultadoFinal;
    private Long idLote;
    private Long idFinca;
    
    public CalidadCarneDTO() {
    }

    public CalidadCarneDTO(Long idAnimal, String observaciones, String resultadoFinal, Long idLote, Long idFinca) {
        this.idAnimal = idAnimal;
        this.observaciones = observaciones;
        this.resultadoFinal = resultadoFinal;
        this.idLote = idLote;
        this.idFinca = idFinca;
    }

    public Long getIdCalidadCarne() {
        return idCalidadCarne;
    }

    public void setIdCalidadCarne(Long idCalidadCarne) {
        this.idCalidadCarne = idCalidadCarne;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
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
