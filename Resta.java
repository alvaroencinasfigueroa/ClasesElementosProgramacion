
public class Resta extends OperacionMatematica{

    public Resta(int operador1, int operador2){
        super(operador1, operador2);
    }

    @Override
    public int calcularResultado(){
        Resta resta = new Resta(operador1,operador2);
        OperacionMatematica op = resta;
        return calcularResultado(op.getOperador1(), op.getOperador2());
    }

    private int calcularResultado(int numero1, int numero2){
        int res = numero1 - numero2;
        return res;
    }

    @Override
    public void mostrarResultado(){
        System.out.print("\nHola soy la resta:" + " " + "y mi resultado es: " + calcularResultado());
    }
}
