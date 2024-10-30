package com.rancho_smart;

public class ProcedimientoMedicoDTO {
    private Long idProcedimientoMedico;
    private Long idHistorialMedico;
    private Long idTratamiento;
    private String titulo;
    private String descripcion;
    
    public ProcedimientoMedicoDTO() {
    }

    public ProcedimientoMedicoDTO(Long idHistorialMedico, Long idTratamiento, String titulo, String descripcion) {
        this.idHistorialMedico = idHistorialMedico;
        this.idTratamiento = idTratamiento;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Long getIdProcedimientoMedico() {
        return idProcedimientoMedico;
    }

    public void setIdProcedimientoMedico(Long idProcedimientoMedico) {
        this.idProcedimientoMedico = idProcedimientoMedico;
    }

    public Long getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(Long idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }

    public Long getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Long idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
