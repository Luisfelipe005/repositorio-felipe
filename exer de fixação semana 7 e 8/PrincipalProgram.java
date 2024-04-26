import java.util.Scanner;
public class PrincipalProgram {
  public static void main(String[] args){
    ContaBanco c1 = new ContaBanco("12345678","cc","luis felipe" ,0, false);
    //ContaBanco c2 = new ContaBanco("12345", "cp", "isadora", 0, false  );
    Scanner scanner = new Scanner(System.in);
    System.out.print("que tipo de conta você que abrir? \ncc = conta corrente \ncp = conta poupança\ndigte aqui o tipo: ");
    String tipodaconta = scanner.nextLine();
    int i = 0;
    while(i<2){
    c1.settipodaconta(tipodaconta);
    c1.abrirconta();
    System.out.println("se você abriu conta corrente (vc tem 50 de bônus), conta poupança (150 de bônus)");
    System.out.print("você quer depositar ou sacar? ");
    String acao = scanner.nextLine().toUpperCase().replaceAll("\\s", "");
    if (acao.equalsIgnoreCase("depositar")){
       c1.depositar();
     }
    else if (acao.equalsIgnoreCase("sacar")){
       c1.sacar(); 
      }
    c1.pagarmensal();
    i+=1;
    
  } scanner.close();
  }
}
