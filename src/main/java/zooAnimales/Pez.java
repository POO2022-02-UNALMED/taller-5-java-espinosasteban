package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static int totalAnimales = 0;
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Pez> listado, String colorEscamas, int cantidadAletas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        Pez.listado = listado;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalAnimales++;
    }

    public Pez(){
        totalAnimales++;

    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalAnimales++;

    }

    public static int cantidadPeces(){
        return totalAnimales;

    }
    @Override
    public String movimiento(){
        return "nadar";

    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        totalAnimales++;
        return new Pez(Animal.getTotalAnimales(), nombre, edad, "oceano",genero, Animal.getZona(), listado,"rojo",6);

    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        totalAnimales++;
        return new Pez(Animal.getTotalAnimales(), nombre, edad, "oceano",genero, Animal.getZona(), listado,"gris",6);

    }

    public ArrayList<Pez> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
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
