package com.rancho_smart;

import java.time.LocalDate;
import java.util.List;

public class TratamientoDTO {
    private Long idTratamiento;
    private Long idHistorialMedico;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<MedicamentoDTO> listadoMedicamentos;
    
    public TratamientoDTO() {
    }

    public TratamientoDTO(Long idHistorialMedico, String titulo, String descripcion, LocalDate fechaInicio,
            LocalDate fechaFin, List<MedicamentoDTO> listadoMedicamentos) {
        this.idHistorialMedico = idHistorialMedico;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.listadoMedicamentos = listadoMedicamentos;
    }

    public Long getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(Long idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Long getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(Long idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<MedicamentoDTO> getListadoMedicamentos() {
        return listadoMedicamentos;
    }

    public void setListadoMedicamentos(List<MedicamentoDTO> listadoMedicamentos) {
        this.listadoMedicamentos = listadoMedicamentos;
    }


    
}
