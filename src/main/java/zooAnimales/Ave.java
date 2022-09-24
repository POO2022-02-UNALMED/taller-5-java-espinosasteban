package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static int totalAnimales = 0;
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Ave> listado, String colorPlumas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        Ave.listado = listado;
        this.colorPlumas = colorPlumas;
        totalAnimales++;
    }

    public Ave(){
        totalAnimales++;


    }
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPlumas = colorPlumas;
        totalAnimales++;
    }

    public static int cantidadAves(){
        return totalAnimales;

    }

    @Override
    public String movimiento(){
        return "volar";

    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        totalAnimales++;
        return new Ave(Animal.getTotalAnimales(), nombre, edad, "montanas",genero, Animal.getZona(), listado,"cafe glorioso");

    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        totalAnimales++;
        return new Ave(Animal.getTotalAnimales(), nombre, edad, "montanas",genero, Animal.getZona(), listado,"blanco y amarillo");

    }

    public ArrayList<Ave> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Ave> listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Mi nombre es " + nombre +", tengo una edad de " + edad + ", habito en " + habitat +" y mi genero es "+ genero;
    }
}
