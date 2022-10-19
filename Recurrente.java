
public class Recurrente{

    public static int cantidadLineas(int n){
        int res=0;
        if(n==1){
            res=4;
        }else{
            res=cantidadLineas(n-1)*2+(int)Math.pow(4,(n-1));
        }
        return res;
    }

}

