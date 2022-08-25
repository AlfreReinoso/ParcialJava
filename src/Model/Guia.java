package Model;

import java.util.ArrayList;

public class Guia extends Empleado{
    private String disponibilidad;
    private double valorHora;
    private ArrayList<Idioma> idiomas = new ArrayList<Idioma>();

    private ArrayList<Viaje> viajes = new ArrayList<Viaje>();


    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public ArrayList<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
    }
    public ArrayList<Viaje> getViajesDelMes() {
        return viajes;
    }

    @Override
    public double getSueldo() {
        double sueldo = getSueldoBase();
        int cantIdiomas = 0 ;
        for(Viaje viaje : getViajesDelMes()){
            sueldo = sueldo + viaje.getDuracionHs()*this.getValorHora();
        }
        for(Idioma idioma : getIdiomas()){
            cantIdiomas++;
            sueldo = sueldo + cantIdiomas * idioma.getAdicionalActual();
        }
        return sueldo;
    }
}
