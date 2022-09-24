package zooAnimales;


import gestion.Zona;

import java.util.ArrayList;


public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    private static int totalAnimales = 0;
    public static int ranas;

    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Anfibio> listado, String colorPiel, boolean venenoso) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        Anfibio.listado = listado;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnimales++;

    }

    public Anfibio(){
        totalAnimales++;

    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnimales++;



    }

    public static int cantidadAnfibios(){
        return totalAnimales;

    }
    @Override
    public String movimiento(){
        return "saltar";

    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        totalAnimales++;
        return new Anfibio(Animal.getTotalAnimales(), nombre, edad, "selva",genero, Animal.getZona(), listado,"rojo",true);

    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        totalAnimales++;
        return new Anfibio(Animal.getTotalAnimales(), nombre, edad, "selva",genero, Animal.getZona(), listado,"negro y amarillo",false);

    }

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString(){
        return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat +" y mi genero es "+ genero;
    }
}
