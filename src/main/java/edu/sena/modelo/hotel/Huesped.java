package edu.sena.modelo.hotel;

public class Huesped {
    private Habitacion habitacion;
    private String nombre;
    private String direccion;
    private String profesion;
    private String eCivil;
    private String reservaTel;
    private String fechaIngreso;
    private String fechaSalida;
    private String alarma;
    private String desayuno;
    private String bebidaFav;

    public Huesped() {
    }

    public Huesped(Habitacion habitacion, String nombre, String direccion, String profesion, String eCivil, String reservaTel, String fechaIngreso, String fechaSalida, String alarma, String desayuno, String bebidaFav) {
        this.habitacion = habitacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
        this.eCivil = eCivil;
        this.reservaTel = reservaTel;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.alarma = alarma;
        this.desayuno = desayuno;
        this.bebidaFav = bebidaFav;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String geteCivil() {
        return eCivil;
    }

    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }
    
    public String desayunoSeleccionado(){
        return "El huesped " + this.nombre + " ha seleccionado como desayuno: " + this.desayuno;
    }
    
    public String bebidaSeleccionada(){
        return "El huesped " + this.nombre + " ha seleccionado como bebida: " + this.bebidaFav;
    }
    
    public String alarmaSeleccionada(){
        return "El huesped " + this.nombre + " de la habitacion " + this.habitacion.getNumeroHabit()+ " solicita ser despertado a las: " + this.alarma;
    }

    public String getReservaTel() {
        return reservaTel;
    }

    public void setReservaTel(String reservaTel) {
        this.reservaTel = reservaTel;
    }

    public String getBebidaFav() {
        return bebidaFav;
    }

    public void setBebidaFav(String bebidaFav) {
        this.bebidaFav = bebidaFav;
    }

}