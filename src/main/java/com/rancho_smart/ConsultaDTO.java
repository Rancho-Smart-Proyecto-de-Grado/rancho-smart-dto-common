package com.rancho_smart;

import java.time.LocalDate;

public class ConsultaDTO {
    private Long id;
    private Long idHistorialMedico;
    private Long idTratamiento;
    private String diagnostico;
    private LocalDate fechaConsulta;
    private String comentarios;
    
    public ConsultaDTO() {
    }

    public ConsultaDTO(Long idHistorialMedico, Long idTratamiento, String diagnostico, LocalDate fechaConsulta,
            String comentarios) {
        this.idHistorialMedico = idHistorialMedico;
        this.idTratamiento = idTratamiento;
        this.diagnostico = diagnostico;
        this.fechaConsulta = fechaConsulta;
        this.comentarios = comentarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    
}
