/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador.hotel;

import edu.sena.modelo.hotel.Habitacion;
import edu.sena.modelo.hotel.Hotel;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "gestionHabitacionView")
@ViewScoped
public class GestionHabitacionView implements Serializable{

    @Inject
    GestionHotelView gestionHotelView;
    private Habitacion habitacionNueva = new Habitacion();
    private ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    private int posHotel;
    
    public GestionHabitacionView() {
    }
    
    public void adicionarHabitacion(){
        Hotel hotelHabitacion = gestionHotelView.getListaHoteles().get(posHotel);
        habitacionNueva.setHotel(hotelHabitacion);
        listaHabitaciones.add(habitacionNueva);
        habitacionNueva = new Habitacion();
    }
    
    public void removerHabitacion(int pos){
        listaHabitaciones.remove(pos);
    }

    public Habitacion getHabitacionNueva() {
        return habitacionNueva;
    }

    public void setHabitacionNueva(Habitacion habitacionNueva) {
        this.habitacionNueva = habitacionNueva;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public int getPosHotel() {
        return posHotel;
    }

    public void setPosHotel(int posHotel) {
        this.posHotel = posHotel;
    }
}
