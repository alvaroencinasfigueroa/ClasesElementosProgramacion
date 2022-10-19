
public class Ejercicio1LP2_2022{
    public int contarIguales(int num1, int num2){
        int res = 0;
        if(num1 < 10 && num2 < 10){
            if(num1 == num2){
                res = 1;
            }else{
                res = 0;
            }
        }else{
            int digito1 = num1%10;
            int digito2 = num2%10;
            if(digito1 == digito2){
                res = 1+contarIguales(num1/10, num2/10);
            }else{
                res = contarIguales(num1/10, num2/10);
            }
        }
        return res;
    }
}
