package edu.sena.controlador.hotel;

import edu.sena.modelo.hotel.Habitacion;
import edu.sena.modelo.hotel.Huesped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;


@Named(value = "gestionHuespedView")
@ViewScoped
public class GestionHuespedView implements Serializable{
    
    @Inject
    GestionHabitacionView gestionHabitacionView;
    private Huesped huespedNuevo = new Huesped();
    private ArrayList <Huesped> listaHuespedes = new ArrayList<>();
    private int posHabitacion;
    
    public GestionHuespedView() {
    }
    
    public void adicionarHuesped(){
        Habitacion habitacionHuesped = gestionHabitacionView.getListaHabitaciones().get(posHabitacion);
        huespedNuevo.setHabitacion(habitacionHuesped);
        listaHuespedes.add(huespedNuevo);
        huespedNuevo = new Huesped();
    }
    
    public void removerHuesped(int pos){
        listaHuespedes.remove(pos);
    }

    public Huesped getHuespedNuevo() {
        return huespedNuevo;
    }

    public void setHuespedNuevo(Huesped huespedNuevo) {
        this.huespedNuevo = huespedNuevo;
    }

    public ArrayList <Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList <Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public int getPosHabitacion() {
        return posHabitacion;
    }

    public void setPosHabitacion(int posHabitacion) {
        this.posHabitacion = posHabitacion;
    }
    
}
