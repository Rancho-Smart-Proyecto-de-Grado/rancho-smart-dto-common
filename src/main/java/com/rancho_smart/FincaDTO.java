package com.rancho_smart;

import java.time.LocalDateTime;

public class FincaDTO {
    private Long idFinca;
    private Long idUsuario;
    private String nombre;
    private String direccion;
    private double areaTotal;
    private LocalDateTime fechaRegistro;
    private String descripcionFinca;
    private String observaciones;
    private byte[] foto;
    
    public FincaDTO() {
    }

    public FincaDTO(Long idUsuario, String nombre, String direccion, double areaTotal, LocalDateTime fechaRegistro,
            String descripcionFinca, String observaciones, byte[] foto) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.areaTotal = areaTotal;
        this.fechaRegistro = fechaRegistro;
        this.descripcionFinca = descripcionFinca;
        this.observaciones = observaciones;
        this.foto = foto;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDescripcionFinca() {
        return descripcionFinca;
    }

    public void setDescripcionFinca(String descripcionFinca) {
        this.descripcionFinca = descripcionFinca;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
}
