public class Motor {
    private double potencia;
    private String tipo;

    public Motor(double potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    //Potencia
    public double getPotencia() {//Get
        return potencia;
    }
    public void setPotencia(double potencia) {//Set
        this.potencia = potencia;
    }

    //Tipo
    public String getTipo() {//Get
        return tipo;
    }
    public void setTipo(String tipo) {//Set
        this.tipo = tipo;//gasolina, etanol, eletrico
    }

    @Override
    public String toString() {
        return String.format("Potência: %.1f CV, Tipo de combustível: %s", potencia, tipo);
    }
}
