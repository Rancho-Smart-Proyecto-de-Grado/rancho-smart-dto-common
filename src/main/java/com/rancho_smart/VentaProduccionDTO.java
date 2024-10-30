package com.rancho_smart;

import java.time.LocalDateTime;

public class VentaProduccionDTO {
    private Long idVentaProduccion;
    private Long idUsuario;
    private Long idFinca;
    private Float cantidadVendida;
    private String tipoProduccion;
    private Float precioTotal;
    private LocalDateTime fecha;
    private String comprador;
    
    public VentaProduccionDTO() {
    }

    public VentaProduccionDTO(Long idUsuario, Long idFinca, Float cantidadVendida, String tipoProduccion,
            Float precioTotal, LocalDateTime fecha, String comprador) {
        this.idUsuario = idUsuario;
        this.idFinca = idFinca;
        this.cantidadVendida = cantidadVendida;
        this.tipoProduccion = tipoProduccion;
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.comprador = comprador;
    }

    public Long getIdVentaProduccion() {
        return idVentaProduccion;
    }

    public void setIdVentaProduccion(Long idVentaProduccion) {
        this.idVentaProduccion = idVentaProduccion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public Float getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Float cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getTipoProduccion() {
        return tipoProduccion;
    }

    public void setTipoProduccion(String tipoProduccion) {
        this.tipoProduccion = tipoProduccion;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }   
}
