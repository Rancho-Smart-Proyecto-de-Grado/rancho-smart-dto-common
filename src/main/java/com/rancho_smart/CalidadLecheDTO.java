package com.rancho_smart;

public class CalidadLecheDTO {
    private Long idCalidadLeche;
    private Long idProduccionLeche;
    private double nivelGrasa;
    private double nivelProteina;
    private double nivelPH;
    private double temperaturaAlmacenamiento;
    private double pureza;
    private boolean presenciaBacterias;
    private double nivelLactosa;
    private double densidad;
    private String observaciones;
    private String resultadoFinal;
    
    public CalidadLecheDTO() {
    }

    public CalidadLecheDTO(Long idProduccionLeche, double nivelGrasa, double nivelProteina, double nivelPH,
            double temperaturaAlmacenamiento, double pureza, boolean presenciaBacterias, double nivelLactosa,
            double densidad, String observaciones, String resultadoFinal) {
        this.idProduccionLeche = idProduccionLeche;
        this.nivelGrasa = nivelGrasa;
        this.nivelProteina = nivelProteina;
        this.nivelPH = nivelPH;
        this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
        this.pureza = pureza;
        this.presenciaBacterias = presenciaBacterias;
        this.nivelLactosa = nivelLactosa;
        this.densidad = densidad;
        this.observaciones = observaciones;
        this.resultadoFinal = resultadoFinal;
    }

    public Long getIdCalidadLeche() {
        return idCalidadLeche;
    }

    public void setIdCalidadLeche(Long idCalidadLeche) {
        this.idCalidadLeche = idCalidadLeche;
    }

    public Long getIdProduccionLeche() {
        return idProduccionLeche;
    }

    public void setIdProduccionLeche(Long idProduccionLeche) {
        this.idProduccionLeche = idProduccionLeche;
    }

    public double getNivelGrasa() {
        return nivelGrasa;
    }

    public void setNivelGrasa(double nivelGrasa) {
        this.nivelGrasa = nivelGrasa;
    }

    public double getNivelProteina() {
        return nivelProteina;
    }

    public void setNivelProteina(double nivelProteina) {
        this.nivelProteina = nivelProteina;
    }

    public double getNivelPH() {
        return nivelPH;
    }

    public void setNivelPH(double nivelPH) {
        this.nivelPH = nivelPH;
    }

    public double getTemperaturaAlmacenamiento() {
        return temperaturaAlmacenamiento;
    }

    public void setTemperaturaAlmacenamiento(double temperaturaAlmacenamiento) {
        this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
    }

    public double getPureza() {
        return pureza;
    }

    public void setPureza(double pureza) {
        this.pureza = pureza;
    }

    public boolean isPresenciaBacterias() {
        return presenciaBacterias;
    }

    public void setPresenciaBacterias(boolean presenciaBacterias) {
        this.presenciaBacterias = presenciaBacterias;
    }

    public double getNivelLactosa() {
        return nivelLactosa;
    }

    public void setNivelLactosa(double nivelLactosa) {
        this.nivelLactosa = nivelLactosa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    
}
