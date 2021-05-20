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

    public ClassContador(int limite) {
        this.num1 = 0;
        this.num2 = 1;
        this.num3 = limite;
    }

    
    //Getters y setters
    public int getValorLimite() {
        return num3;
    }

    public void setValorLimite(int limite) {
        this.num3 = limite;
    }

    public int getValorInicial() {
        return num1;
    }

    public void setValorInicial(int inicial) {
        this.num1 = inicial;
    }

    public int getValorIncremento() {
        return num2;
    }

    public void setValorIncremento(int incremento) {
        this.num2 = incremento;
    }

    
    //Métodos
    public int incrementarValor() {
        return getValorInicial() + getValorIncremento();
    }
    
    public boolean comprobarLimiteSuperado() {
        if (getValorInicial() + getValorIncremento() > getValorLimite()) {
            return true;
        } else return false;
    }

    public int resetearContador() {
        if (getValorInicial() + getValorIncremento() > getValorLimite()) {
            return getValorInicial();
        }

        return getValorInicial() + getValorIncremento();
    }

    public int ValorActual() {
        return getValorInicial();
    }

    public int incrementarValorActual() {
        return ValorActual() + getValorIncremento();
    }

    public int resetearCualquierMomento() {
        setValorInicial(num1);

        return num1;
    }
    
}