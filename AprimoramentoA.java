class Pessoa {
    String nome;
    int idade;
    double altura;
    String profissao;

    public Pessoa(String nome, int idade, double altura, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.profissao = profissao;
    }

    public void apresentar() {
        System.out.println("Olá! meu nome é " + nome + ", tenho " + idade + " anos, minha altura é " + altura + "m e sou " + profissao);
    }
}

public class AprimoramentoA {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Nilton", 18, 1.82, "estudante");
        p1.apresentar();

        Pessoa p2 = new Pessoa("Lorena", 19, 1.80, "Analista de dados");
        p2.apresentar();
    }
}