package com.rancho_smart;

import java.util.List;

public class RegistroAlimentacionDTO {
    private Long idRegistroAlimentacion;
    private List<Long> idAnimal;
    private Long idAlimento;
    private Long idLote;
    private Long idFinca;
    private String observaciones;
    
    public RegistroAlimentacionDTO() {
    }

    public RegistroAlimentacionDTO(List<Long> idAnimal, Long idAlimento, Long idLote, Long idFinca,
            String observaciones) {
        this.idAnimal = idAnimal;
        this.idAlimento = idAlimento;
        this.idLote = idLote;
        this.idFinca = idFinca;
        this.observaciones = observaciones;
    }

    public Long getIdRegistroAlimentacion() {
        return idRegistroAlimentacion;
    }

    public void setIdRegistroAlimentacion(Long idRegistroAlimentacion) {
        this.idRegistroAlimentacion = idRegistroAlimentacion;
    }

    public List<Long> getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(List<Long> idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
