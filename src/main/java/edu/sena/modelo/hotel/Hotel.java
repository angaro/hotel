package edu.sena.modelo.hotel;

public class Hotel {
    private String nombreHotel;
    private String direccionH;
    private String ciudadH;
    private String barrioH;
    private String telefonoH;
    private int posicionH;

    public Hotel() {
    }

    public Hotel(String nombreHotel, String direccionH, String ciudadH, String barrioH, String telefonoH) {
        this.nombreHotel = nombreHotel;
        this.direccionH = direccionH;
        this.ciudadH = ciudadH;
        this.barrioH = barrioH;
        this.telefonoH = telefonoH;
    }
    
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionH() {
        return direccionH;
    }

    public void setDireccionH(String direccionH) {
        this.direccionH = direccionH;
    }

    public String getCiudadH() {
        return ciudadH;
    }

    public void setCiudadH(String ciudadH) {
        this.ciudadH = ciudadH;
    }

    public String getBarrioH() {
        return barrioH;
    }

    public void setBarrioH(String barrioH) {
        this.barrioH = barrioH;
    }

    public String getTelefonoH() {
        return telefonoH;
    }

    public void setTelefonoH(String telefonoH) {
        this.telefonoH = telefonoH;
    }

    public int getPosicionH() {
        return posicionH;
    }

    public void setPosicionH(int posicionH) {
        this.posicionH = posicionH;
    }
}
