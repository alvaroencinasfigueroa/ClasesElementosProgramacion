import java.util.*;

public class ExamenPPEj_1{

    public ArrayList<Integer> listaDeSalida(int numero){
        ArrayList<Integer> lista = new ArrayList<>();
        if(esPolidivisible(numero)){
            lista.add(numero);
        }
        return lista;
    }

    public boolean esPolidivisible(int n){
        int cantidadDeDigitosDeN = cantidadDigitos(n);
        return esPolidivisible(n, cantidadDeDigitosDeN);
    }

    private boolean esPolidivisible(int n, int k){
        boolean res = true;
        if(n >= 1 && n <10 && k == 1){
            res = true;
        }else{
            //  n=14  k=1
            if(n % k == 0){
                res &= esPolidivisible(n/10, k-1);
            }else{
                res = false;
            }
        }
        return res;
    }

    private int cantidadDigitos(int n){
        int res = 0;
        if(n < 10){
            res = 1;
        }else{
            res = 1 + cantidadDigitos(n/10);
        }
        return res;
    }
}