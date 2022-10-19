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

    public int numeroCrear(int n){
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

}