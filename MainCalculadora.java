import java.util.*;
public class MainCalculadora{
    public static void main(String [] a){
        ArrayList<OperacionMatematica> operaciones = new ArrayList<>();

        System.out.println("Mostrando los resultados usando el polimorfismo...");
        System.out.println("Estamos sumando...");
        int op1; int op2;
        Scanner ent1 = new Scanner(System.in);
        op1 = ent1.nextInt();
        Scanner ent2 = new Scanner(System.in);
        op2 = ent2.nextInt();
        Suma s = new Suma(op1,op2);
        operaciones.add(s);

        System.out.println("Estamos restando...");
        int op3; int op4;
        Scanner ent3 = new Scanner(System.in);
        op3 = ent3.nextInt();
        Scanner ent4 = new Scanner(System.in);
        op4 = ent4.nextInt();
        Resta r = new Resta(op3,op4);
        operaciones.add(r);

        for(int i = 0; i<operaciones.size(); i++){
            operaciones.get(i).mostrarResultado();
        }
    }
}
