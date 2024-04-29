public class Empresa {
    private String nome;
    private FuncionarioCaixa funcionario1;
    private FuncionarioCaixa funcionario2;

    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }
    public Empresa(String nome){
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    public Empresa(){
        this.nome = "nome da empresa";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }
    public String getnome(){
        return this.nome;
    }
    public FuncionarioCaixa getfuncionario1(){
        return this.funcionario1;
    }
    public FuncionarioCaixa getfuncionario2(){
        return this.funcionario2;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setfuncionario1(FuncionarioCaixa funcionario1){
        this.funcionario1 = funcionario1;
    }
    public void setfuncionario2(FuncionarioCaixa funcionario2){
        this.funcionario2 = funcionario2;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getnome());
        System.out.println("Funcionário 1: " + getfuncionario1());
        System.out.println("Funcionário 2: " + getfuncionario2());
    }
}
//- Uma empresa tem um nome e dois funcionários do caixa;
//- Crie três construtores: um que recebe todos os parâmetros para inicializar os atributos; outro que recebe apenas
//o nome da empresa, inicializando os funcionários em null; outro que não recebe parâmetros, inicializando os
//funcionários em null e o nome com algum valor padrão.
//- Crie os métodos de acesso dos atributos desta classe (get e set);
//- Crie um método “imprimeInfo”, que imprime as informações da classe. 