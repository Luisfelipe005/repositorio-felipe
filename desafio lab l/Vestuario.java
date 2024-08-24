public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario( int quantMax,boolean produtosImportados,Data datadefundacao,Endereco endereco,String nome, int quantfuncionario, double salariobasefuncionario){
        super(quantMax, nome, quantfuncionario, quantfuncionario, endereco, datadefundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return super.toString() + "Vende Produtos Importados? " + this.produtosImportados;
    }
}
/*Crie uma classe chamada Vestuario, que é um tipo de loja, representando uma loja de vestuário.
As lojas de vestuários possuem como atributo (além de tudo que uma Loja tem) um valor booleano chamado produtosImportados. 
Este atributo indica se a loja de vestuário vende roupas importadas ou não. 
Crie um construtor para a classe, que receba informações para inicializar todos os atributos.
 Além disso, crie os métodos de acesso dos atributos (os métodos que ainda não existem) e sobrescreva o método toString, 
 incluindo a informação específica da classe.*/
