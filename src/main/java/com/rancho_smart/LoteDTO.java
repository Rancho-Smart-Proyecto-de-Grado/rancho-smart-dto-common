package com.rancho_smart;

public class LoteDTO {
    private Long idLote;
    private Long idFinca;
    private String proposito;
    private Long area;
    private int cobertura;
    private byte[] foto;
    
    public LoteDTO() {
    }

    public LoteDTO(Long idFinca, String proposito, Long area, int cobertura, byte[] foto) {
        this.idFinca = idFinca;
        this.proposito = proposito;
        this.area = area;
        this.cobertura = cobertura;
        this.foto = foto;
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public int getCobertura() {
        return cobertura;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
}
