/*
Crie os métodos de acesso para este atributo.
Atualize o método toString. */
public class Loja {
    private Produto[] estoqueProdutos;
    private Data datadefundacao;
    private Endereco endereco;
    private String nome; 
    private int quantidadefuncionarios;
    private float salariobasefuncionario;

    public Loja(int quantMax,String nome, int quantidadefuncionarios, float salariobasefuncionario, Endereco endereco, Data datadefundacao){
        this.nome = nome;
        this.quantidadefuncionarios = quantidadefuncionarios;
        this.salariobasefuncionario = salariobasefuncionario;
        this.endereco = endereco;
        this.datadefundacao = datadefundacao;
        estoqueProdutos = new Produto[quantMax];
    }
    public Loja( int quantMax,String nome, int quantidadefuncionarios,Endereco endereco, Data datadefundacao){
      this.nome = nome;
      this.quantidadefuncionarios= quantidadefuncionarios;
      this.salariobasefuncionario = -1;
      this.endereco = endereco;
      this.datadefundacao = datadefundacao;
      estoqueProdutos = new Produto[quantMax];
    }
    public Loja(int quantMax){
     estoqueProdutos = new Produto[quantMax];
    }
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
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
    public void setEstoqueProdutos(Produto[] EstoqueProdutos){
      this.estoqueProdutos = EstoqueProdutos;
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

    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length; i++)
          System.out.println(estoqueProdutos[i].toString());
    }

    public boolean insereProduto(Produto produto){
      for(int i = 0; i < estoqueProdutos.length; i++)
        if(estoqueProdutos[i] != null){
            estoqueProdutos[i] = produto;
            return true;
        }
        return false;  
    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length; i++)
         if(estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
          estoqueProdutos[i] = null;
          return true;
         }
         return false;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Quantidade De Funcionários: "
        + quantidadefuncionarios + 
        "\n" + "Salário Base Dos Funcionários: R$" + salariobasefuncionario + "\nEndereço: " + endereco.toString() + "\nData: " + datadefundacao.toString() +
        "\nProdutos: " + estoqueProdutos.toString();
    }
}
/*

 */