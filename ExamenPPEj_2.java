
public class ExamenPPEj_2{
    /*2. (25 pts.) Mirar una estrella en su plenitud es hermoso, si se pudiera ver a detalle tendriamos estrellas
    estrelladas, pues bien, el trabajo es determinar la cantidad de lineas rectas que se necesitan para dibujar
    una estrella estrellada de nivel n. En la figura 1, se muestra el n´umero de l´ıneas que se requiere para
    formar una estrella de nivel 1, de nivel 2 y de nivel 3. Se te pide calcular el n´umero de l´ıneas rectas que
    se requieren para formar una estrella estrellada de nivel n.*/

    public int estrellas(int n){
        int res = 0;
        if(n == 1){
            res = 10;
        }else{
            res = estrellas(n-1) * 4 + 15; 
        }
        return res;
    }
}