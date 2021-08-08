package edu.sena.controlador.hotel;

import edu.sena.modelo.hotel.Hotel;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "gestionHotelView")
@ViewScoped
public class GestionHotelView implements Serializable{

    private Hotel hotelNuevo = new Hotel();
    private ArrayList<Hotel> listaHoteles = new ArrayList<>();
       
    public GestionHotelView() {
    }
    
    public void adicionarHotel(){
        hotelNuevo.setPosicionH(listaHoteles.size());
        listaHoteles.add(hotelNuevo);
        hotelNuevo = new Hotel();
    }
    
    public void removerHotel(int pos){
        listaHoteles.remove(pos);
    }

    public Hotel getHotelNuevo() {
        return hotelNuevo;
    }

    public void setHotelNuevo(Hotel hotelNuevo) {
        this.hotelNuevo = hotelNuevo;
    }

    public ArrayList<Hotel> getListaHoteles() {
        return listaHoteles;
    }

    public void setListaHoteles(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }
}
