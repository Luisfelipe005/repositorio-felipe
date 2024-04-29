public class Calculadora {
    private int memoria;
    private String cor;

    public Calculadora(String cor){
        this.memoria = 0;
        this.cor = cor;
    }
    public int getmemoria(){
        return this.memoria;
    }
    public String getcor(){
        return this.cor;
    }
    public void setmemoria(int memoria){
        this.memoria = memoria;
    }
    public void setcor(String cor){
        this.cor = cor;
    }
    public void soma(double n1, double n2){
       double soma = n1 + n2;
       System.out.println(soma);
    }
    public void subtrai(double n1, double n2){
      double subtrai = n1 - n2;
      System.out.println(subtrai);
    }
    public void multiplica(double n1, double n2){
        double multiplica = n1 * n2;
        System.out.println(multiplica);
    }
    public void divide(double n1,double n2){
        double divide = n1/ n2;
        System.out.println(divide);
    }
    public void elevaAoCubo(int valor){
        int expoente = 3;
       double resultado = Math.pow(valor, expoente );
       System.out.println(resultado);
    }
    public void elevaAoQuadrado(int valor){
        int expoente = 2;
        double resultado = Math.pow(valor, expoente);
        System.out.println(resultado);
    }
    public void imprimeInfo(){
        System.out.println("---INFORMAÇÕES DA CALCULADORA---");
        System.out.println("A Memória Da Calculadora É " + getmemoria());
        System.out.println("A Cor É " + getcor());
    }
   //public static void main(String[] args){
     //   Calculadora c1 = new Calculadora("PRETA");
     //   c1.soma(3, 3);
     //   c1.subtrai(3, 2);
     //   c1.multiplica(3, 0);
     //   c1.divide(3, 3);

    //}
}
//- Uma calculadora possui uma memória e uma cor;
//- Quando uma calculadora é criada, a memória deve ser inicializada com 0 e a cor deve ser recebida por parâmetro
//(construtor);
//- Crie os métodos de acesso para os atributos da classe (get e set);
//- Crie os métodos: soma, subtrai, multiplica e divide. Todos recebem dois valores (double) por parâmetro e
//retornam o valor da operação realizada.
//- Crie os métodos elevaAoQuadrado e elevaAoCubo. Ambos recebem apenas um valor (int) e retornam o valor da
//operação realizada.
//- Crie um método “imprimeInfo”, que não recebe parâmetros e simplesmente imprime as informações da
//calculadora de maneira legível e organizada. 