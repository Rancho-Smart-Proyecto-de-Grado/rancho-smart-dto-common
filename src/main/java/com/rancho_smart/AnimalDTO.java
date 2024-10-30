package com.rancho_smart;

import java.time.LocalDateTime;

public class AnimalDTO {
    private Long idAnimal;
    private String nombre;
    private char genero;
    private String raza;
    private LocalDateTime fechaNacimiento;
    private String etapa;
    private Long idUsuario;
    private Long idFinca;
    private Long idLote;
    private byte[] foto;
    
    public AnimalDTO() {
    }

    public AnimalDTO(String nombre, char genero, String raza, LocalDateTime fechaNacimiento, String etapa,
            Long idUsuario, Long idFinca, Long idLote, byte[] foto) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.etapa = etapa;
        this.idUsuario = idUsuario;
        this.idFinca = idFinca;
        this.idLote = idLote;
        this.foto = foto;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
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

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
}