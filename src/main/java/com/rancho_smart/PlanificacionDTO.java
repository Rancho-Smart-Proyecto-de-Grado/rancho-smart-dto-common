package com.rancho_smart;

import java.time.LocalDateTime;

public class PlanificacionDTO {
    private Long idPlanificacion;
    private Long idCruce;
    private LocalDateTime fecha;
    private Long idUsuario;
    
    public PlanificacionDTO() {
    }

    public PlanificacionDTO(Long idCruce, LocalDateTime fecha, Long idUsuario) {
        this.idCruce = idCruce;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
    }

    public Long getIdPlanificacion() {
        return idPlanificacion;
    }

    public void setIdPlanificacion(Long idPlanificacion) {
        this.idPlanificacion = idPlanificacion;
    }

    public Long getIdCruce() {
        return idCruce;
    }

    public void setIdCruce(Long idCruce) {
        this.idCruce = idCruce;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    
}
