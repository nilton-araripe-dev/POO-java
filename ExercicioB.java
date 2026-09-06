class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(double valor) {
        this.quantidade += valor;
    }

    public void removerEstoque(double valor) {
        if (valor <= quantidade) {
            this.quantidade -= valor;
        }
    }

    
    public void mostrarInformacoes() {
        System.out.println("O produto " + nome + " esta sendo vendido pelo preco de "
                + preco + " R$ e possui em estoque " + quantidade + " unidades");
    }

    public class ExercicioB {
        public static void main(String[] args) {

            Produto p1 = new Produto();
                p1.nome = "Computador";
                p1.preco = 3.500;
                p1.quantidade = 53;
                p1.adicionarEstoque(15);
                p1.mostrarInformacoes();

            Produto p2 = new Produto();
                p2.nome = "Notebook";
                p2.preco = 2.900;
                p2.quantidade = 78;
                p2.removerEstoque(27);
                p2.mostrarInformacoes();
        }
    }
}