
/**
 * Write a description of class VectorREc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorRec{

    public void mostrarVec(int vec[]){
        mostrarVec(vec,0);
    }

    private void mostrarVec(int vec [], int pos){
        if(pos == vec.length-1){
            System.out.println(vec[pos]);
        }else{
            //System.out.println(vec[pos]);
            mostrarVec(vec, pos+1);
        }
    }

    public void mostrarLista(String v []){
        for(int i = 0; i < v.length; i++){
            System.out.println(" " + v[i]);
        }
    }

    private static int [] llenarLista(int vec[]){
        return llenarLista(vec,0);
    }

    private static int[] llenarLista(int vec[], int c){
        if(c <= vec.length-1){
            vec[c] = generarNumeros(1000);
            return llenarLista(vec, c+1);
        }
        return vec;
    }

    public static int generarNumeros(int n){
        int res = 0;
        if(n==100){
            System.out.print(n);
            res = n;
        }else {
            System.out.println(n+",");
            res = 1+generarNumeros(n-1);
        }
        return res;
    }

    public int [] llenarLista(int numero){
        int vec [] = new int [100];
        return llenarLista(vec,0,numero);
    }

    private int[] llenarLista(int vec[], int c, int numero){
        if(esPolidivisible(numero)){
            if(c <= vec.length-1){
                vec[c] = numero;
                return llenarLista(vec, c+1, numero);
            }
        }
        return vec;
    }

    public boolean esPolidivisible(int n){
        return true;
    }
}
