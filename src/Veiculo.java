public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Marca

    public String getMarca() { //GET
        return marca;
    }

    public void setMarca(String marca) {//SET
        this.marca = marca;
    }

    //Modelo

    public String getModelo() {//GET
        return modelo;
    }

    public void setModelo(String modelo) {//SET
        this.modelo = modelo;
    }

    //Ano

    public int getAno() { //GET
       return ano;
    }

    public void setAno(int ano) {//SET
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s\nModelo: %s\nAno: %d", marca, modelo, ano);
    }
}
