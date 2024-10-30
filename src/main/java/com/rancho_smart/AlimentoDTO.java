package com.rancho_smart;

import java.time.LocalDate;
import java.util.List;

public class AlimentoDTO {
    private Long idAlimento;
    private Long idUsuario;
    private String nombre;
    private String tipo;
    private String composicionNutricional;
    private LocalDate fechaDeCaducidad;
    private int cantidadDisponible;
    private double precioPorUnidad;
    private List<String> proveedores;
    private byte[] foto;
    
    public AlimentoDTO() {
    }

    public AlimentoDTO(Long idUsuario, String nombre, String tipo, String composicionNutricional,
            LocalDate fechaDeCaducidad, int cantidadDisponible, double precioPorUnidad, List<String> proveedores,
            byte[] foto) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipo = tipo;
        this.composicionNutricional = composicionNutricional;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.cantidadDisponible = cantidadDisponible;
        this.precioPorUnidad = precioPorUnidad;
        this.proveedores = proveedores;
        this.foto = foto;
    }

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComposicionNutricional() {
        return composicionNutricional;
    }

    public void setComposicionNutricional(String composicionNutricional) {
        this.composicionNutricional = composicionNutricional;
    }

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public List<String> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<String> proveedores) {
        this.proveedores = proveedores;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
}
