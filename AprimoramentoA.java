class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá! meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura);
    }
}

public class AprimoramentoA {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Nilton", 18, 1.82);
        p1.apresentar();

        Pessoa p2 = new Pessoa("Lorena", 19, 1.80);
        p2.apresentar();
    }
}