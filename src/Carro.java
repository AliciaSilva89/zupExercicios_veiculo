public class Carro extends Veiculo{

    private int numero_portas;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, int numero_portas, Motor motor) {
        super(marca, modelo, ano);
        this.numero_portas = numero_portas;
        this.motor = motor;
    }

    //Numero de portas
    public int getNumero_portas() {//GET
        return numero_portas;
    }
    public void setNumero_portas(int numero_portas) {//Set
        this.numero_portas = numero_portas;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append(String.format("\nNúmero de portas: %d", numero_portas));
        model.append(String.format("\nMotor: %s", motor.toString()));
        return model.toString();
    }
}
