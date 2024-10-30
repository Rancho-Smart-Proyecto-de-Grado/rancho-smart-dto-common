package com.rancho_smart;

public class GenealogiaDTO {
    private Long idGenealogia;    
    private Long idAnimal;
    private Long idPadre;
    private Long idMadre;
    private String padre;
    
    public GenealogiaDTO() {
    }

    public GenealogiaDTO(Long idAnimal, Long idPadre, Long idMadre, String padre) {
        this.idAnimal = idAnimal;
        this.idPadre = idPadre;
        this.idMadre = idMadre;
        this.padre = padre;
    }

    public Long getIdGenealogia() {
        return idGenealogia;
    }

    public void setIdGenealogia(Long idGenealogia) {
        this.idGenealogia = idGenealogia;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    
}
