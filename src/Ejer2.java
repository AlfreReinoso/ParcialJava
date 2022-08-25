import java.util.ArrayList;

public class Ejer2 {
    public static int cantLargas(ArrayList<String> listaNombres, int tamanio){
        int cantPalabras = 0 ;
        for(String nombre: listaNombres){
            if(nombre.length() > tamanio){
                cantPalabras++;
            }
        }
        return cantPalabras;
    }
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("alfredo");
        nombres.add("mailen");
        nombres.add("pepito");
        nombres.add("Joel");
        System.out.println(nombres);
        System.out.println(cantLargas(nombres,5));
    }
}