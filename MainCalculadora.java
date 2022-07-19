import java.util.*;

public class MainCalculadora{
    public static void main(String [] a){
        ArrayList<OperacionMatematica> operaciones = new ArrayList<>();
        //int j;

        System.out.println("Mostrando los resultados usando el Polimorfismo!!!! ");
        System.out.println("Ahora empezamos a sumar... ");
        int op1; int op2; 
        Scanner ent = new Scanner(System.in);
        op1 = ent.nextInt();
        Scanner ent1 = new Scanner(System.in);
        op2 = ent1.nextInt();
        Suma s = new Suma(op1,op2);
        operaciones.add(s);
        //resta
        System.out.println("Ahora empezamos a restar... ");
        int op3; int op4; 
        Scanner ent3 = new Scanner(System.in);
        op3 = ent3.nextInt();
        Scanner ent4 = new Scanner(System.in);
        op4 = ent4.nextInt();
        Resta r = new Resta(op3,op4);
        operaciones.add(r);
        //multiplicacion
        System.out.println("Ahora empezamos a multiplicar... ");
        int op5; int op6; 
        Scanner ent5 = new Scanner(System.in);
        op5 = ent5.nextInt();
        Scanner ent6 = new Scanner(System.in);
        op6 = ent6.nextInt();
        Multiplicacion m = new Multiplicacion(op5,op6);
        operaciones.add(m);
        //division
        System.out.println("Ahora empezamos a dividir... ");
        int op7; int op8; 
        Scanner ent7 = new Scanner(System.in);
        op7 = ent7.nextInt();
        Scanner ent8 = new Scanner(System.in);
        op8 = ent8.nextInt();
        Division d = new Division(op7,op8);
        operaciones.add(r);

        for(int i = 0; i<operaciones.size(); i++){
            operaciones.get(i).mostrarResultado();
        }
    }
}