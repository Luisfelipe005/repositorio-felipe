public class FuncionarioCaixa {
    private Calculadora calculadora;
    private String nome;
    private String endereco;
    private String sexo;

    public FuncionarioCaixa(){
        this.nome = "";
        this.endereco = "";
        this.sexo = "";
        this.calculadora = null;
    }
    public FuncionarioCaixa(Calculadora calculadora, String nome, String endereco, String sexo){
        this.calculadora = calculadora;
        this.endereco = endereco;
        this.nome = nome;
        this.sexo = sexo;
    }
    public Calculadora getCalculadora(){
        return this.calculadora;
    }
    public String getnome(){
        return this.nome;
    }
    public String getendereco(){
        return this.endereco;
    }
    public String getsexo(){
        return this.sexo;
    }
    public void setcalculadora(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setendereco(String endereco){
        this.endereco = endereco;
    }
    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    public void soma(double n1, double n2){
        calculadora.soma(n1, n2);
     }
     public void subtrai(double n1, double n2){
       calculadora.subtrai(n1, n2);
     }
     public void multiplica(double n1, double n2){
        calculadora.multiplica(n1, n2);
     }
     public void divide(double n1,double n2){
        calculadora.divide(n1, n2); 
     }
     public void elevaAoCubo(int valor){
         calculadora.elevaAoCubo(valor);
     }
     public void elevaAoQuadrado(int valor){
         calculadora.elevaAoQuadrado(valor);
     }
     public void imprimeInfo(){
        System.out.println("Nome: " + getnome());
        System.out.println("Endereço: " + getendereco());
        System.out.println("Sexo: " + getsexo());
        calculadora.imprimeInfo();
     }
     public static void main(String[] args){
        Calculadora c1 = new Calculadora("azul");
        FuncionarioCaixa f1 = new FuncionarioCaixa(c1, "lipe", "sdsad", "m");
        f1.imprimeInfo();
    }
}
//- Possui um nome, um endereço, um sexo e uma calculadora;
//- Crie dois construtores: um não recebe parâmetros (inicializa os atributos com algum valor padrão); o outro
//recebe os parâmetros para inicializar todos os atributos;
//- Crie os métodos de acesso dos atributos desta classe (get e set);
//- Crie os métodos soma, subtrai, multiplica, divide, elevaAoQuadrado e elevaAoCubo. Cada método destes deve
//chamar o método correspondente da calculadora, retornando o valor obtido na operação.
//- Crie um método chamado “imprimeInfo”, que não recebe parâmetros de entrada e imprime na tela as
//informações da classe, inclusive da calculadora (sem as operações, apenas os atributos). 