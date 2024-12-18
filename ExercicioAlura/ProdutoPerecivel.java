public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String data){
        super(nome, preco, quantidade);
        this.dataValidade = data;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Preço: R$" + this.getPreco() + " Quantidade no estoque: " +
                this.getQuantidade() + " Data de validade: " + this.getDataValidade();
    }
}
