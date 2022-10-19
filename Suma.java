public class Suma extends OperacionMatematica{

    public Suma(int operador1, int operador2){
        super(operador1, operador2);
    }

    @Override
    public int calcularResultado(){
        Suma suma = new Suma(operador1, operador2);
        OperacionMatematica op = suma;
        return calcularResultado(op.getOperador1(), op.getOperador2());
    }

    private int calcularResultado(int numero1, int numero2){
        int res = numero1 + numero2;
        return res;
    }

    @Override
    public void mostrarResultado(){
        System.out.print("\nHola soy la suma:" + " " + "y mi resultado es: " + calcularResultado());
    }
}