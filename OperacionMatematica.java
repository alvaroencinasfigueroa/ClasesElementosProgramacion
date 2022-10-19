public abstract class OperacionMatematica{
    protected int operador1;
    protected int operador2;

    public OperacionMatematica(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void setOperador1(int op1){
        operador1 = op1;
    }

    public int getOperador1(){
        return operador1;
    }

    public void setOperador2(int op2){
        operador2 = op2;
    }

    public int getOperador2(){
        return operador2;
    }
    
    public abstract void mostrarResultado();//estos son métodos polimórficos
    public abstract int calcularResultado();
}
