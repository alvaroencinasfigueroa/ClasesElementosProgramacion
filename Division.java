
public class Division extends OperacionMatematica{

    public Division(int operador1, int operador2){
        super(operador1, operador2);
    }

    @Override
    public int calcularResultado(){
        Division division = new Division(operador1,operador2);
        OperacionMatematica op = division;
        return calcularResultado(op.getOperador1(), op.getOperador2());
    }

    private int calcularResultado(int numero1, int numero2){
        int res = numero1 / numero2;
        return res;
    }

    @Override
    public void mostrarResultado(){
        System.out.print("Hola soy la division: " + " " + " y mi resultado es: " + calcularResultado());
    }

}