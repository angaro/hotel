package edu.sena.modelo.hotel;

public class Habitacion {
    private Hotel hotel;
    private String tipoHabit;
    private String numeroHabit;
    private String banioHabit;
    private String telefonoHabit;
    private String calefaccionHabit;
    private int posicionHabit;

    public Habitacion() {
    }
    
    public Habitacion(Hotel hotel, String tipoHabit, String numeroHabit, String banioHabit, String telefonoHabit, String calefaccionHabit){
        this.hotel = hotel;
        this.tipoHabit = tipoHabit;
        this.numeroHabit = numeroHabit;
        this.banioHabit = banioHabit;
        this.telefonoHabit = telefonoHabit;
        this.calefaccionHabit = calefaccionHabit;
    }

    public String getTipoHabit() {
        return tipoHabit;
    }

    public void setTipoHabit(String tipoHabit) {
        this.tipoHabit = tipoHabit;
    }

    public String getNumeroHabit() {
        return numeroHabit;
    }

    public void setNumeroHabit(String numeroHabit) {
        this.numeroHabit = numeroHabit;
    }

    public String getBanioHabit() {
        return banioHabit;
    }

    public void setBanioHabit(String banioHabit) {
        this.banioHabit = banioHabit;
    }

    public String getTelefonoHabit() {
        return telefonoHabit;
    }

    public void setTelefonoHabit(String telefonoHabit) {
        this.telefonoHabit = telefonoHabit;
    }

    public String getCalefaccionHabit() {
        return calefaccionHabit;
    }

    public void setCalefaccionHabit(String calefaccionHabit) {
        this.calefaccionHabit = calefaccionHabit;
    }

    public int getPosicionHabit() {
        return posicionHabit;
    }

    public void setPosicionHabit(int posicionHabit) {
        this.posicionHabit = posicionHabit;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String detalleHabitacion(){
        return "La habitación " + this.numeroHabit + " pertenece al hotel " + this.hotel.getNombreHotel();
    }
    
}
