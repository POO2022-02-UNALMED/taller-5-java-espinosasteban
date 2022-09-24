package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static int totalAnimales = 0;
    private static ArrayList<Mamifero> listado;

    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    public Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Mamifero> listado, boolean pelaje, int patas) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        Mamifero.listado = listado;
        this.pelaje = pelaje;
        this.patas = patas;
        totalAnimales++;
    }

    public Mamifero(){
        totalAnimales++;

    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        totalAnimales++;
    }


    public static int cantidadMamiferos(){
        return totalAnimales;

    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        totalAnimales++;
        return new Mamifero(Animal.getTotalAnimales(), nombre, edad, "pradera",genero, Animal.getZona(), listado, true,4);



    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        totalAnimales++;
        return new Mamifero(Animal.getTotalAnimales(), nombre, edad, "selva",genero, Animal.getZona(), listado, true,4);

    }

    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
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
