package package_01;

import java.util.Scanner;

public class CarroTestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();

        carro1.marca = "Chevrolet";
        carro1.ano = 2008;
        carro1.vel = 10;
        carro1.acelerar(20);

        System.out.println("Velocidade inicial: " + carro1.vel + " km/h");
        System.out.println("Velocidade após acelerar: " + carro1.vel + " km/h");
        System.out.print("marca da bixa: " + carro1.marca);

        sc.close();
    }
}
