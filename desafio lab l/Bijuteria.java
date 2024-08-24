public class Bijuteria extends Loja {
    private double metavendas;

    public Bijuteria(int quantMax,double metavendas,String nome, int quantidadefuncionarios, float salariobasefuncionario, Endereco endereco, Data datadefundacao){
        super(quantMax ,nome, quantidadefuncionarios, salariobasefuncionario, endereco, datadefundacao);
        this.metavendas = metavendas;
    }
    
    public double getMetaVendas(){
        return this.metavendas;
    }

    public void setMetaVendas(double metavendas){
        this.metavendas = metavendas;
    }
    @Override
    public String toString(){
        return super.toString() + "Meta De Vendas Mensais: " + this.metavendas;
    }

}
/*Crie uma classe chamada Bijuteria, que é um tipo de loja, representando uma loja de bijuteria.
 As lojas de bijuteria possuem como atributo (além de tudo que uma Loja tem) um double chamado metaVendas, 
 que representa a meta de vendas mensais desta loja. Crie um construtor para a classe, 
 que receba informações para inicializar todos os atributos. Além disso,
  crie os métodos de acesso dos atributos (os métodos que ainda não existem) e sobrescreva o método toString, 
  incluindo a informação específica da classe.*/