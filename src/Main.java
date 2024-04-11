import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static ArrayList<String>colores;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Hello world!");
        arrayColores();
        anyadeNegro3Posicion(colores);
        borraPrimerBlanco(colores);
        anyadeBlancoPos4(colores);
        rastreaBlancoYBorra(colores);
    }

    public static ArrayList arrayColores(){
        colores=new ArrayList<>();
        String color;
        do{
            System.out.println("Introduzca el color deseado:");
            color=sc.nextLine();
            if(!color.equalsIgnoreCase("salir")){
                colores.add(color);
            }

        }while (!color.equalsIgnoreCase("salir"));
        System.out.println(colores);
        return colores;
    }

    public static void anyadeNegro3Posicion(ArrayList<String>coloresConNegro){
        colores.add(2,"negro");
        System.out.println(coloresConNegro);
    }

    public static void borraPrimerBlanco(ArrayList<String>borraBlanco){
        ArrayList<Integer>posicionBlancos=new ArrayList<>();
        for(int i=0; i< borraBlanco.size(); i++){
            if(borraBlanco.get(i).equalsIgnoreCase("blanco")){
                posicionBlancos.add(i);
            }
        }
        if(!borraBlanco.isEmpty()){
            int posicion=posicionBlancos.get(0);
            borraBlanco.remove(posicion);
        }

        System.out.println(borraBlanco);
    }

    public static void anyadeBlancoPos4(ArrayList<String>anyadeBlanco){
        colores.add(3,"blanco");
        System.out.println(anyadeBlanco);
    }

    public static void rastreaBlancoYBorra(ArrayList<String>rastreaBlanco){
        ArrayList<Integer>posicionBorrar=new ArrayList<>();
        for(int i=0; i< rastreaBlanco.size(); i++){
            if(rastreaBlanco.get(i).equalsIgnoreCase("blanco")){
                posicionBorrar.add(i);
            }
        }
        if(!posicionBorrar.isEmpty()){
            int posicion=posicionBorrar.get(0);
            rastreaBlanco.remove(posicion);
        }
        /*Esto estaría mal seguiría añadiendo al arrayList de posición borrar tendría que hacer otro nuevo
        for(int i=0; i< rastreaBlanco.size(); i++){
            if(rastreaBlanco.get(i).equalsIgnoreCase("blanco")){
                posicionBorrar.add(i);
            }
        }
        if(!posicionBorrar.isEmpty()){
            System.out.println("En la lista todavía hay blancos.");
            for(int i=0; i)
        }*/

    }





}