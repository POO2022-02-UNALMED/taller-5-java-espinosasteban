package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> Zona = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){

    }

    public void agregarZonas(Zona zona){
        Zona.add(zona);


    }

    public int cantidadTotalAnimales(){
        int cantidad = 0;
        for(Zona zona: Zona){
            cantidad += zona.cantidadAnimales();
        }
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return Zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        Zona = zona;
    }
}


