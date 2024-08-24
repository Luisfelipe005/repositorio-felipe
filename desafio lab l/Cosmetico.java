public class Cosmetico extends Loja {
    private double taxaComercializacao;
    
    public Cosmetico(int quantMax,double taxaComercializacao,Data datadefundacao,Endereco endereco,String nome, int quantfuncionario, double salariobasefuncionario){
      super(quantMax ,nome, quantfuncionario, quantfuncionario, endereco, datadefundacao);
      this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    @Override
    public String toString(){
        return super.toString() + "Taxa: " + this.taxaComercializacao;
    }
}