package com.rancho_smart;

import java.time.LocalDateTime;
import java.util.List;

public class VentaDTO {
    private Long idVenta;
    private LocalDateTime fecha;
    private double precio;
    private String tipoTransaccion;
    private Long idUsuario;
    private Long idCliente;
    private String condicionesEntrega;
    private String observaciones;
    private List<Long> idAnimalesEnVenta;
    private String estadoPago;
    private Long idFinca;
    
    public VentaDTO() {
    }

    public VentaDTO(LocalDateTime fecha, double precio, String tipoTransaccion, Long idUsuario, Long idCliente,
            String condicionesEntrega, String observaciones, List<Long> idAnimalesEnVenta, String estadoPago,
            Long idFinca) {
        this.fecha = fecha;
        this.precio = precio;
        this.tipoTransaccion = tipoTransaccion;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.condicionesEntrega = condicionesEntrega;
        this.observaciones = observaciones;
        this.idAnimalesEnVenta = idAnimalesEnVenta;
        this.estadoPago = estadoPago;
        this.idFinca = idFinca;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCondicionesEntrega() {
        return condicionesEntrega;
    }

    public void setCondicionesEntrega(String condicionesEntrega) {
        this.condicionesEntrega = condicionesEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<Long> getIdAnimalesEnVenta() {
        return idAnimalesEnVenta;
    }

    public void setIdAnimalesEnVenta(List<Long> idAnimalesEnVenta) {
        this.idAnimalesEnVenta = idAnimalesEnVenta;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    
}
