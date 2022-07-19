
public abstract class OperacionMatematica{
    protected int operador1;
    protected int operador2;

    public OperacionMatematica(int op1, int op2){
        this.operador1 = op1;
        this.operador2 = op2;
    }

    public void setOperador1(int operador1){
        this.operador1 = operador1;
    }

    public int getOperador1(){
        return operador1;
    }

    public void setOperador2(int operador2){
        this.operador2 = operador2;
    }

    public int getOperador2(){
        return operador2;
    }

    public abstract void mostrarResultado();

    public abstract int calcularResultado();

}