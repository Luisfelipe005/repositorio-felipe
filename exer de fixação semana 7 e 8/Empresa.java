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
        System.out.println("---INFO DO FUNCIONARIO--- ");
        System.out.println("Nome: " + this.funcionario1.getnome());
        System.out.println("Endereço: " + this.funcionario1.getendereco());
        System.out.println("Sexo: "+ this.funcionario1.getsexo());
        System.out.println("---INFO DO FUNCIONARIO--- ");
        System.out.println("Nome: " + this.funcionario2.getnome());
        System.out.println("Endereço: " + this.funcionario2.getendereco());
        System.out.println("Sexo: "+ this.funcionario2.getsexo());
    }
    public static void main(String[] args){
        FuncionarioCaixa f1 = new FuncionarioCaixa(new Calculadora("azul"), "lipe", "assa", "m");
        FuncionarioCaixa f2 = new FuncionarioCaixa(new Calculadora("roxo"), "nay", "baba", "f");
        Empresa e1 = new Empresa("nike", f1, f2);
        e1.imprimeInfo();
    }
}
//- Uma empresa tem um nome e dois funcionários do caixa;
//- Crie três construtores: um que recebe todos os parâmetros para inicializar os atributos; outro que recebe apenas
//o nome da empresa, inicializando os funcionários em null; outro que não recebe parâmetros, inicializando os
//funcionários em null e o nome com algum valor padrão.
//- Crie os métodos de acesso dos atributos desta classe (get e set);
//- Crie um método “imprimeInfo”, que imprime as informações da classe. 