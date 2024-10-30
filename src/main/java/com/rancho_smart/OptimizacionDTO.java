package com.rancho_smart;

public class OptimizacionDTO {
    private Long idOptimizacion;
    private Long idPadre;
    private String padre;
    private Long idMadre;
    private Float potencialGenetico;
    
    public OptimizacionDTO() {
    }

    public OptimizacionDTO(Long idPadre, String padre, Long idMadre, Float potencialGenetico) {
        this.idPadre = idPadre;
        this.padre = padre;
        this.idMadre = idMadre;
        this.potencialGenetico = potencialGenetico;
    }

    public Long getIdOptimizacion() {
        return idOptimizacion;
    }

    public void setIdOptimizacion(Long idOptimizacion) {
        this.idOptimizacion = idOptimizacion;
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

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public Float getPotencialGenetico() {
        return potencialGenetico;
    }

    public void setPotencialGenetico(Float potencialGenetico) {
        this.potencialGenetico = potencialGenetico;
    }

    
}
