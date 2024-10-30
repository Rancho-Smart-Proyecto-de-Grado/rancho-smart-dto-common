package com.rancho_smart;

import java.time.LocalDate;

public class VacunaDTO {
    private Long idVacuna;
    private Long idHistorialMedico;
    private Long idTratamiento;
    private String nombre;
    private int cantidadDosis;
    private boolean vacunacionCompletada;
    private LocalDate fechaAdministracion;
    private LocalDate fechaProximaDosis;
    
    public VacunaDTO() {
    }

    public VacunaDTO(Long idHistorialMedico, Long idTratamiento, String nombre, int cantidadDosis,
            boolean vacunacionCompletada, LocalDate fechaAdministracion, LocalDate fechaProximaDosis) {
        this.idHistorialMedico = idHistorialMedico;
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.cantidadDosis = cantidadDosis;
        this.vacunacionCompletada = vacunacionCompletada;
        this.fechaAdministracion = fechaAdministracion;
        this.fechaProximaDosis = fechaProximaDosis;
    }

    public Long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Long idVacuna) {
        this.idVacuna = idVacuna;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    public boolean isVacunacionCompletada() {
        return vacunacionCompletada;
    }

    public void setVacunacionCompletada(boolean vacunacionCompletada) {
        this.vacunacionCompletada = vacunacionCompletada;
    }

    public LocalDate getFechaAdministracion() {
        return fechaAdministracion;
    }

    public void setFechaAdministracion(LocalDate fechaAdministracion) {
        this.fechaAdministracion = fechaAdministracion;
    }

    public LocalDate getFechaProximaDosis() {
        return fechaProximaDosis;
    }

    public void setFechaProximaDosis(LocalDate fechaProximaDosis) {
        this.fechaProximaDosis = fechaProximaDosis;
    }

    
}
