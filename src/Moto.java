public class Moto extends Veiculo{
    private String tipoDeGuidao;
    private Motor motor;

    public Moto(String marca, String modelo,int ano ,String tipoDeGuidao, Motor motor) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
        this.motor = motor;
    }

    //Numero de portas

    public String getTipoDeGuidao() {//GET
        return tipoDeGuidao;
    }
    public void setTipoDeGuidao(String tipoDeGuidao) {//SET
        this.tipoDeGuidao = tipoDeGuidao;//espotivo ou cruiser
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append(super.toString());
        model.append(String.format("\nTipo de Guidão: %s", tipoDeGuidao));
        model.append(String.format("\nMotor: %s", motor.toString()));
        return model.toString();
    }
}
