class Pessoa {
    String nome;
    int idade;
    double altura;

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " e minha altura é " + altura);
    }

    public class ExercicioA {
        public static void main(String[] args) {
            Pessoa p1 = new Pessoa();

                p1.nome = "Nilton";
                p1.idade = 18;
                p1.altura = 1.82;
                p1.apresentar();

            Pessoa p2 = new Pessoa();
                p2.nome = "Lorena";
                p2.idade = 19;
                p2.altura = 1.80;
                p2.apresentar();

        }
    }
}