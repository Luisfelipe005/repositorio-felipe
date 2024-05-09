//Uma Loja possui, além dos atributos já criados, um endereço (do tipo Endereco) e uma data de fundação (do tipo Data).
//Crie os métodos de acesso destes atributos.
//Além disso, atualize os construtores para receberem o endereço e a data de fundação da loja.
public class Loja {
    private Data datadefundacao;
    private Endereco endereco;
    private String nome; 
    private int quantidadefuncionarios;
    private float salariobasefuncionario;

    public Loja(String nome, int quantidadefuncionarios, float salariobasefuncionario, Endereco endereco, Data datadefundacao){
        this.nome = nome;
        this.quantidadefuncionarios = quantidadefuncionarios;
        this.salariobasefuncionario = salariobasefuncionario;
        this.endereco = endereco;
        this.datadefundacao = datadefundacao;
    }
    public Loja(String nome, int quantidadefuncionarios,Endereco endereco, Data datadefundacao){
      this.nome = nome;
      this.quantidadefuncionarios= quantidadefuncionarios;
      this.salariobasefuncionario = -1;
      this.endereco = endereco;
        this.datadefundacao = datadefundacao;
    }
    public Loja(){

    }
    public Endereco getEndereco(){
        return this.endereco;
        }
    public Data getDataDeFundacao(){
        return this.datadefundacao;
    }
    public String getNome(){
        return this.nome;
    }
    public int getQuantidadeFuncionarios(){
        return this.quantidadefuncionarios;
    }
    public float getSalarioBaseFuncionario(){
        return this.salariobasefuncionario;
    }
    public void setDataDeFundacao(Data datadefundacao){
        this.datadefundacao = datadefundacao;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setQuantidadeFuncionarios(int quantidadefuncionarios){
        this.quantidadefuncionarios= quantidadefuncionarios;
    }
    public void setSalarioBaseFuncionario(float salariobasefuncionario){
        this.salariobasefuncionario = salariobasefuncionario;
    }
    public double GastosComSalario(){
       if(getSalarioBaseFuncionario() == -1){
          return -1;
        }
        else{
          float soma = getQuantidadeFuncionarios() * getSalarioBaseFuncionario();
          return soma;
        }
    }
    public char TamanhoDaLoja(){
    //String abrevia = "Tamanho Da Loja: ";
        if(getQuantidadeFuncionarios()<= 9){
          return 'P';
        }
        else if(getQuantidadeFuncionarios()>=10 && getQuantidadeFuncionarios() <= 30) {
            return 'M';
        }
        else{
            return 'G';
        }
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Quantidade De Funcionários: "
        + quantidadefuncionarios + 
        "\n" + "Salário Base Dos Funcionários: R$" + salariobasefuncionario;
    }
}