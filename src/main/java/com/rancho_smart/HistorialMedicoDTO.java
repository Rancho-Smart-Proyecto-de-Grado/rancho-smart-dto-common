package com.rancho_smart;

import java.util.List;

public class HistorialMedicoDTO {
    private Long idHistorialMedico;
    private String descripcion;
    private Long idAnimal;
    private String diagnostico;
    private boolean enfermedadesCronicas;
    private List<String> observaciones;
    
    public HistorialMedicoDTO() {
    }

    public HistorialMedicoDTO(String descripcion, Long idAnimal, String diagnostico, boolean enfermedadesCronicas,
            List<String> observaciones) {
        this.descripcion = descripcion;
        this.idAnimal = idAnimal;
        this.diagnostico = diagnostico;
        this.enfermedadesCronicas = enfermedadesCronicas;
        this.observaciones = observaciones;
    }

    public Long getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(Long idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isEnfermedadesCronicas() {
        return enfermedadesCronicas;
    }

    public void setEnfermedadesCronicas(boolean enfermedadesCronicas) {
        this.enfermedadesCronicas = enfermedadesCronicas;
    }

    public List<String> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(List<String> observaciones) {
        this.observaciones = observaciones;
    }
}
