import java.util.*;
public class UST{
    //Ejercicio 10 A
    public int serieA(int n){
        int c = 1;
        int ac = 1;

        while(c<=n){
            System.out.println(ac);
            ac = ac * 3;
            c++;
        }

        return ac;
    }

    //Ejercicio 24
    public int multiplicacionPorSumasSuc(int a, int b){
        int res = 0;
        int c = 0;

        while(c < b){
            if(a >= 0){
                if(b >= 0){
                    res = res + a;
                }
            }
            c++;
        }
        return res;
    }

    public int numeroCrearPorDerecha(int n){
        int res = 1;
        return res = n * 10 + n;
    }

    public int crearNumeroPorIzquierda(int n, int m){
        int res = 1;
        int f;
        f = (n*10); //n=3  f=30
        int s = f/10;//f=30   s = 3
        int k = m * 10; //m=7 * 10 == 70  => k 70
        return res = k+s; // k+s = 70+3=73
    }

    public int limites(int l, int s){
        return s-l;
    }

    public void tablaDivision(int num){
        int c = 0;
        int s = 1;
        for(int k = 1; k < 11; k++){
            s = k * num;
            c = s / num;
            System.out.println(s + " / " + num + " = " + c);
        }
    }

    public void tablaDivisionB(int n){
        int c = 0;
        for(int k = n; k < n*11; k += n){
            c = k / n;
            System.out.println(k + " / " + n + " = " + c);
        }
    }

    public void tablaResta(int numero){
        int resto = 0;
        for(int k = numero; k < 11 + numero; k++){
            resto = k - numero;
            System.out.println(k + " - " + numero + " = " + resto);
        }
    }

    public int leerEnteroPQ(int p, int q){
        int bb = 0;
        while(bb == 0){
            System.out.println("Digite un número entre 1 y 10...");
            Scanner ent  = new Scanner(System.in);
            int numero = ent.nextInt();
            if(numero >= p && numero <= q ){
                bb = 1;
            }
        }
        return bb;
    }

    public int encontrarFibonacciMayorX(int x){
        int p = 0; int u = 1; int bb = 0;
        int n = p+u;
        while(bb == 0){
            n = u + p;
            p = u;
            u = n;
            if(n >= x){
                bb = 1;
            }
        }
        return n;
    }

    public void fibonacci(){
        int p = 0; int u = 1;
        int n = p + u;
        System.out.println(p);
        System.out.println(u);
        for(int i = 3; i < 13; i++){
            n = u + p;
            System.out.println(n);
            p = u;
            u = n;
        }
    }

    public long [] mostrarSerie11B()
    {
        long [] nuevo = new long[11];
        long p = 0;
        nuevo[0] = p;
        long u = 1;
        nuevo[1] = u;
        for (int c = 2; c < 11; c++)
        {
            nuevo[c] = p + u;
            long n = nuevo[c];
            p = u;
            u = n;
        }
        return nuevo;
    }

    public void perfectos(int x){
        int s = 0;
        for(int i = 1; i <= x-1; i++){
            if( x % i == 0){
                s = s + i;
            }
        }
        if(s == x){
            System.out.println("Es Perfecto...!!!! ");
        }else{
            System.out.println(" NO Es Perfecto...!!!! ");
        }
    }

    public void primo2(int numero){
        int c = 0;
        for(int k = 1; k <= numero; k++){
            if(numero % k == 0){
                c = c+1;
            }
        }
        if(c == 2){
            System.out.println("Es Primo...!!!! ");
        }else{
            System.out.println("NO Es Primo...!!!! ");
        }
    }

    public int primo1(int numero){
        int c = 0; int res = 0;
        for(int k = 1; k <= numero; k++){
            if(numero % k == 0){
                c = c+1;
            }
        }
        if(c == 2){
            res = 1;
        }else{
            res = 0;
        }
        return res;
    }

    public void esEspejo(int numero){
        int aux = numero;
        int cifra;
        int inverso = 0;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if(numero == inverso){
            System.out.println("Es Espejo");
        }else{
            System.out.println("No es Espejo");
        }
    }

}