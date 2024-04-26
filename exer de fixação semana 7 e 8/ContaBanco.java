import java.util.Scanner;
public class ContaBanco {
    private String numdaconta;
    private String tipodaconta;
    private String nome;
    private float saldo;
    private boolean status;

    public ContaBanco(String numdaconta,String tipodaconta, String nome,float saldo, boolean status){
        this.numdaconta = numdaconta;
        this.tipodaconta = tipodaconta;
        this.nome = nome;
        this.saldo= saldo = 0;
        this.status = status=false;
    }

    public String getnumdaconta(){
        return this.numdaconta;
    }
    public String gettipodaconta(){
        return this.tipodaconta;
    }
    public String getnome(){
        return this.nome;
    }
    public float getsaldo(){
        return this.saldo;
    }
    public boolean getstatus(){
        return this.status;
    }
    public void setnumdaconta(String numdaconta){
        this.numdaconta = numdaconta;
    }
    public void settipodaconta(String tipodaconta){
        this.tipodaconta = tipodaconta;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setsaldo(float saldo){
        this.saldo = saldo;
    }
    public void setstatus(boolean status){
        this.status = status;
    }
    public void abrirconta(){
    setstatus(true);
    if(gettipodaconta() == "cc" || gettipodaconta() =="CC"){
         float soma = this.saldo + 50;
         setsaldo(soma); 
         
        }
    else {
        float soma1 = this.saldo + 150;
        setsaldo(soma1);
    }
    }
    public void fecharconta(){
    if (getsaldo()==0){
        System.out.println("fechando a conta...");
        System.out.println("conta fechada com sucesso");
    }
    else 
        System.out.println("para fechar a conta seu saldo deve ser zero e vc não pode estar devendo");
    }
    public void depositar(){
    if (getstatus()== true){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Qual o valor a ser depositado: ");
      float deposito = scanner.nextFloat(); scanner.nextLine();
      float saldo = this.saldo+ deposito;
      System.out.println("seu saldo ficou de "+saldo);
      setsaldo(saldo);
      scanner.close();
          }
    else 
     System.out.println("sua conta tem que estar aberta para depositar!");

    }  
    public void sacar(){
    if (getstatus()== true){
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("digite o valor que você que sacar: ");
        float dinsacar = scanner2.nextFloat(); scanner2.nextLine();
        if (getsaldo()> dinsacar){
            float diminui = getsaldo() - dinsacar;        
            System.out.println("seu saldo depois do saque é " + diminui);
            setsaldo(diminui);
        }
        else
            System.out.println("seu saldo tem que ser maior que seu saque");
        scanner2.close();
    }
    else 
      System.out.println("sua conta tem que estar aberta para sacar");
         
    }
    public void pagarmensal(){
    if (gettipodaconta()== "cc" || gettipodaconta() == "CC") {  
        System.out.println("o valor pago por mês é R$ 12,00 ");
        System.out.println("pagando...");
        float novosaldocc= getsaldo() - 12;
        System.out.println("seu novo saldo é " + novosaldocc);
    }
    else
        System.out.println("o valor pago por mês é R$ 20,00 ");
        System.out.println("pagando...");
        float novosaldocp= getsaldo() - 20;
        System.out.println("seu novo saldo é " + novosaldocp);
        
    }
}
