public class Informatica extends Loja {
   private double seguroEletronicos;

   public Informatica(int quantMax, double seguroEletronicos,String nome, int quantidadefuncionarios, float salariobasefuncionario, Endereco endereco, Data datadefundacao){
    super(quantMax, nome, quantidadefuncionarios, salariobasefuncionario, endereco, datadefundacao);
    this.seguroEletronicos = seguroEletronicos;
   }

   public double getSeguroEletronicos(){
    return this.seguroEletronicos;
   }

   public void setSeguroEletronicos(double seguroEletronicos){
    this.seguroEletronicos = seguroEletronicos;
   }

   @Override
   public String toString(){
    return super.toString() + "Seguro De Eletrônicos: " + this.seguroEletronicos;
   } 
}
/*Crie uma classe chamada Informatica, que é um tipo de loja, representando uma loja de informática. 
As lojas de informática possuem como atributos (além de tudo que uma Loja tem) um valor do tipo double chamado seguroEletronicos, 
que representa um seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente. 
Crie um construtor para a classe, que receba informações para inicializar todos os atributos. 
Além disso, crie os métodos de acesso dos atributos (os métodos que ainda não existem) 
e sobrescreva o método toString, incluindo a informação específica da classe.*/
