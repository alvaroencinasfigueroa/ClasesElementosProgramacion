
public class Vectores{

    public void mostrarLista(int vec []){
        for(int i = 0; i <= vec.length-1; i++){
            System.out.print(" " + vec[i]);
        }
    }

    public void mostrarListaNombres(String v []){
        for(int i = 0; i < v.length; i++){
            System.out.print(" " + v[i]);
        }
    }
    // 0 1 2 3 4
    //{1,2,3,4,5}

    public void mostrarListaDeNombres(String v []){
        System.out.print("leticio");
        System.out.print("leticio otro");
        System.out.print("leticia");
        System.out.print("leticio");
        System.out.print("leticio");
        System.out.print("leticio otro");
        System.out.print("leticia");
        System.out.print("leticio");
        System.out.print("leticio");
        System.out.print("leticio otro");
        System.out.print("leticia");
        System.out.print("leticio");
        System.out.print("leticio");
        System.out.print("leticio otro");
        System.out.print("leticia");
        System.out.print("leticio");
    }

    public void mostrarVectorRec(int vec []){
        mostrarVectorRec(vec,0);
    }

    private void mostrarVectorRec(int vec [], int i){

        if(i == vec.length-1){//caso base
            System.out.print(" " + vec[i]);
        }
        else{
            System.out.print(" " + vec[i]);
            mostrarVectorRec(vec, i+1);
        }
    }
    // 0
    //{1,2,3,4,5}
}
