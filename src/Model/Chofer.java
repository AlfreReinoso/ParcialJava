package Model;

import java.util.ArrayList;
import java.util.Date;

public class Chofer extends Empleado{
    private String carnet;
    private Date proximoVencimiento;
    private double cantViajesPremio;
    private double premio;

    private ArrayList<Viaje> viajes = new ArrayList<Viaje>();


    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Date getProximoVencimiento() {
        return proximoVencimiento;
    }

    public void setProximoVencimiento(Date proximoVencimiento) {
        this.proximoVencimiento = proximoVencimiento;
    }

    public double getCantViajesPremio() {
        return cantViajesPremio;
    }

    public void setCantViajesPremio(double cantViajesPremio) {
        this.cantViajesPremio = cantViajesPremio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public ArrayList<Viaje> getViajesDelMes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    @Override
    public double getSueldo() {
        int cantViajesMes = 0;
        double sueldo = 0;
        for(Viaje viaje: getViajesDelMes()){
            cantViajesMes++;
        }
        if (cantViajesMes>this.getCantViajesPremio()){
            sueldo = this.getSueldoBase()+this.getPremio();
        }else {
            sueldo = getSueldoBase();
        }
        return sueldo;
    }
}
