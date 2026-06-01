package package_02;

public class CarroTestar {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Carro carro01 = new Carro("toyota", 2000, 140);

        System.out.println("-----------------DADOS----DA-----CORRIDA-----------------");
        System.out.println("Marca do carro: " + carro01.getMarca());
        System.out.println("Ano de lançamento: " + carro01.getAno());
        System.out.println("velocidade do carro: " + carro01.velAtual + "km/h");
        System.out.println(carro01);

        System.out.println("----Testando ações----");

        System.out.println("Buzina do carro: " + carro01.buzinar());
        carro01.acelerar(20);
        System.out.println("Velocidade depois de acelerar: " + carro01.getVelAtual() + "km/h");
        carro01.freiar(45);
        System.out.println("O carro depois de freiar: " + carro01.getVelAtual() + "km/h");
        System.out.println(carro01);
        Carro carro02 = new Carro("HB20", 2020, 200);
        System.out.println(carro02);

    }
}
