class People {
    private String nome;
    private int idade;
    private double altura;
    private String profissao;

    public People(String nome, int idade, double altura, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.profissao = profissao;
    }
    public void apresentar(){
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade
         + " anos, minha altura é " + altura + " e minha profissão é " + profissao);
    }
    public void setIdade(int idade){
        if (idade >= 0 ){
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser menor que 0");
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public double getAltura(){
        return altura;
    }
    public String getProfissao(){
        return profissao;
    }
}
public class Encapsulamento {
    public static void main(String[] args){
        People p1 = new People("Nilton", 18, 1.82, "Desenvolvedor");
        People p2 = new People("Lorena", 19, 1.80, "Analista de Dados");

        System.out.println(p1.getNome());
        p1.setIdade(19);
        System.out.println(p1.getIdade());

        System.out.println(p2.getIdade());
        p2.setIdade(-10);
        System.out.println(p2.getIdade());
    }
}