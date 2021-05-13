package src;

public class ClassContador {

    int num1;
    int num2;
    int num3;

    //Constructor
    public ClassContador (int inicial, int incremento, int limite) {
        this.num1 = inicial;
        this.num2 = incremento;
        this.num3 = limite;
    }

    
    //Getters y setters
    public int getValorLimite() {
        return num3;
    }

    public void setNum3(int limite) {
        this.num3 = limite;
    }

    

    
}