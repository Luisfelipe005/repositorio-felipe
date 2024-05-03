//Métodos Construtores: crie 2 construtores para a classe, sendo que um recebe parâmetros para inicializar todos os atributos e outro recebe apenas valores para inicializar o nome e a quantidade de funcionários, colocando -1 no salário base dos funcionários.
//Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
//Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, retornando uma String formatada da forma que você desejar, desde que contenha as informações de todos os atributos da classe.
//Método gastosComSalario: este método não recebe parâmetros e retorna quanto a loja gasta com o salário de todos os seus funcionários. Atente para o fato de que não é possível realizar este cálculo caso o valor do salário base seja -1. Neste caso, não realize o cálculo e retorne -1.
//Método tamanhoDaLoja: este método não recebe parâmetros e retorna um dos seguintes caracteres: ‘P’, caso a loja possua menos de 10 funcionários; ‘M’, caso a loja possua entre 10 (inclusive) e 30 (inclusive) funcionários; ou ‘G’, caso a loja possua mais do que 31 (inclusive) funcionários.

public class Loja {
    private String nome; 
    private int quantidadefuncionarios;
    private float salariobasefuncionario;

    public Loja(String nome, int quantidadefuncionarios, float salariobasefuncionario){
        this.nome = nome;
        this.quantidadefuncionarios = quantidadefuncionarios;
        this.salariobasefuncionario = salariobasefuncionario;
    }
    public Loja(String nome, int quantidadefuncionarios){
      this.nome = nome;
      this.quantidadefuncionarios= quantidadefuncionarios;
      this.salariobasefuncionario = -1;
    }
    public Loja(){

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
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setQuantidadeFuncionarios(int quantidadefuncionarios){
        this.quantidadefuncionarios= quantidadefuncionarios;
    }
    public void setSalarioBaseFuncionario(float salariobasefuncionario){
        this.salariobasefuncionario = salariobasefuncionario;
    }
    public void GastosComSalario(){
       if(getSalarioBaseFuncionario() == -1){
          System.out.println(-1);
        }
        else{
          float soma = getQuantidadeFuncionarios() * getSalarioBaseFuncionario();
          System.out.println("A Soma Do Gasto Com Sálario É R$" + soma);
        }
    }
    public void TamanhoDaLoja(){
    String abrevia = "Tamanho Da Loja: ";
        if(getQuantidadeFuncionarios()<= 9){
         System.out.println(abrevia + 'P');
        }
        else if(getQuantidadeFuncionarios()>=10 && getQuantidadeFuncionarios() <= 30) {
            System.out.println(abrevia + 'M');
        }
        else{
            System.out.println(abrevia + 'G');
        }
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Quantidade De Funcionários: "
        + quantidadefuncionarios + 
        "\n" + "Salário Base Dos Funcionários: R$" + salariobasefuncionario;
    }
}