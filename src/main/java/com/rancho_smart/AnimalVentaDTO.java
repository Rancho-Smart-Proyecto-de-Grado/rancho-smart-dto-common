package com.rancho_smart;

public class AnimalVentaDTO {
    private Long idAnimalVenta;
    private Long idAnimal;
    private String descripcion;
    private Float precio;
    private String moneda;
    
    public AnimalVentaDTO() {
    }

    public AnimalVentaDTO(Long idAnimal, String descripcion, Float precio, String moneda) {
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;
        this.precio = precio;
        this.moneda = moneda;
    }

    public Long getIdAnimalVenta() {
        return idAnimalVenta;
    }

    public void setIdAnimalVenta(Long idAnimalVenta) {
        this.idAnimalVenta = idAnimalVenta;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    
}
