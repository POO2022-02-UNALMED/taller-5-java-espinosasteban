package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static int totalAnimales = 0;
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;

    public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona, ArrayList<Reptil> listado, String colorEscamas, int largoCola) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        Reptil.listado = listado;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalAnimales++;
    }

    public Reptil(){
        totalAnimales++;

    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalAnimales++;

    }

    public static int cantidadReptiles(){
        return totalAnimales;

    }

    @Override
    public String movimiento(){
        return "reptar";

    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        totalAnimales++;
        return new Reptil(Animal.getTotalAnimales(), nombre, edad, "humedal",genero, Animal.getZona(), listado,"verde",3);

    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        totalAnimales++;
        return new Reptil(Animal.getTotalAnimales(), nombre, edad, "jungla",genero, Animal.getZona(), listado,"blanco",1);

    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
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
