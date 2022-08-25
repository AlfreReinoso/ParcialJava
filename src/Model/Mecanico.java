package Model;

import java.util.ArrayList;

public class Mecanico extends Empleado {
    private double valorKm;

    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public double getSueldo() {
        double sueldo = getSueldoBase();
        double cantKms = 0;
        for(Vehiculo vehiculo : getVehiculos()){
            int i;
            for(i=0; i < vehiculo.getViajesDelMes().size(); i++){
                cantKms = cantKms + vehiculo.getViajesDelMes().get(i).getKms();
            }
        }
        sueldo = sueldo + cantKms * this.getValorKm();
        return sueldo;
    }
}
