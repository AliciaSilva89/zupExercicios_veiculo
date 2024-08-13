public class App {
    public static void main(String[] args) {
        // Apenas preenchimento utilizando IA
        Motor motorCarro1 = new Motor(150, "Gasolina");
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4, motorCarro1);

        Motor motorCarro2 = new Motor(450, "Gasolina");
        Carro carro2 = new Carro("Ford", "Mustang", 2021, 2, motorCarro2);

        Motor motorCarro3 = new Motor(115, "Etanol");
        Carro carro3 = new Carro("Chevrolet", "Onix", 2019, 4, motorCarro3);

        Motor motorCarro4 = new Motor(200, "Gasolina");
        Carro carro4 = new Carro("Volkswagen", "Golf", 2022, 4, motorCarro4);

        Motor motorCarro5 = new Motor(140, "Gasolina");
        Carro carro5 = new Carro("Honda", "Civic", 2018, 4, motorCarro5);

        System.out.println("Carros:");
        System.out.println();
        System.out.println(carro1);
        System.out.println();//pula linha
        System.out.println(carro2);
        System.out.println();
        System.out.println(carro3);
        System.out.println();
        System.out.println(carro4);
        System.out.println();
        System.out.println(carro5);
        System.out.println();

        // Apenas para preenchimento utilizando IA
        Motor motorMoto1 = new Motor(100, "Gasolina");
        Moto moto1 = new Moto("Honda", "CB500", 2022, "Esportivo", motorMoto1);

        Motor motorMoto2 = new Motor(75, "Gasolina");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2021, "Street", motorMoto2);

        Motor motorMoto3 = new Motor(130, "Gasolina");
        Moto moto3 = new Moto("Kawasaki", "Ninja ZX-6R", 2020, "Esportivo", motorMoto3);

        Motor motorMoto4 = new Motor(95, "Gasolina");
        Moto moto4 = new Moto("BMW", "F 850 GS", 2023, "Adventure", motorMoto4);

        Motor motorMoto5 = new Motor(70, "Gasolina");
        Moto moto5 = new Moto("Suzuki", "V-Strom 650", 2019, "Adventure", motorMoto5);

        System.out.println("Motos:");
        System.out.println();
        System.out.println(moto1);
        System.out.println();//pula linha
        System.out.println(moto2);
        System.out.println();
        System.out.println(moto3);
        System.out.println();
        System.out.println(moto4);
        System.out.println();
        System.out.println(moto5);
    }
}
