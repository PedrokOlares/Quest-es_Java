package package_01;

public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("acorda dog");
    }
}
