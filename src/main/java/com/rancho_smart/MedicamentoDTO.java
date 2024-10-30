package com.rancho_smart;

import java.time.LocalDate;

public class MedicamentoDTO {
    private Long idMedicamento;
    private String nombre;
    private String descripcion;
    private String fabricante;
    private LocalDate fechaFabricacion;
    private LocalDate fechaExpiracion;
    private double dosisRecomendada;
    private String frecuencia;
    private String viaAdministracion;
    private String observaciones;
    
    public MedicamentoDTO() {
    }

    public MedicamentoDTO(String nombre, String descripcion, String fabricante, LocalDate fechaFabricacion,
            LocalDate fechaExpiracion, double dosisRecomendada, String frecuencia, String viaAdministracion,
            String observaciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaExpiracion = fechaExpiracion;
        this.dosisRecomendada = dosisRecomendada;
        this.frecuencia = frecuencia;
        this.viaAdministracion = viaAdministracion;
        this.observaciones = observaciones;
    }

    public Long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public double getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(double dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
