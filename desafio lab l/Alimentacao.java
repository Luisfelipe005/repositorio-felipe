public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao( int quantMax,Data dataAlvara,String nome, int quantidadefuncionarios, float salariobasefuncionario, Endereco endereco, Data datadefundacao){
        super(quantMax ,nome, quantidadefuncionarios, salariobasefuncionario, endereco, datadefundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return this.dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return super.toString() + " Alvará De Funcionamento (Data):" + this.dataAlvara;
    }
    
}
/*Crie uma classe chamada Alimentacao, que é um tipo de loja, representando uma loja de alimentação.
 As lojas de alimentação possuem como atributo (além de tudo que uma Loja tem) um valor do tipo Data chamado dataAlvara, 
 que indica a data que a loja de alimentação recebeu o alvará de funcionamento. 
 Crie um construtor para a classe, que receba informações para inicializar todos os atributos. 
 Além disso, crie os métodos de acesso dos atributos (os métodos que ainda não existem) e sobrescreva o método toString, 
 incluindo a informação específica da classe.*/