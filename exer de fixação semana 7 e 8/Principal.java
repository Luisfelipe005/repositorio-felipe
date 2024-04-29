import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Livro l1 = new Livro("homem aranha ", "peter parker", 2000, 200.5, 40);
    Livro l2 = new Livro("homem aranha ", "peter parker", 2000, 200.5, 40);
    Livro l3 = new Livro("homem aranha ", "peter parker", 2000, 200.5, 40); 
    Cliente c1 = new Cliente("LIPE", 1, "masc", "dsdsdsd", " asasa",l1);
    Cliente c2 = new Cliente("lipe", 2, "masc", "dsdsdsd", " asasa",l1);
    Cliente c3 = new Cliente("lipe", 2, "masc", "dsdsdsd", " asasa",l1);
    int i = 1;
    while(i< 4){
        System.out.println("---INFORMAÇÕES DO CLIENTE---");
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt(); scanner.nextLine();
        System.out.print("digite seu sexo [M/F]: ");
        String sexo = scanner.nextLine();
        System.out.print("digite seu email: ");
        String email = scanner.nextLine();
        System.out.print("digite sua senha: ");
        String senha = scanner.nextLine();
        System.out.println("---INFORMAÇÕES DO LIVRO---");
        System.out.print("digite o titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("digite o nome do autor: ");
        String autor = scanner.nextLine();
        System.out.print("digite o ano que foi lançado: ");
        int anodepublicacao = scanner.nextInt(); scanner.nextLine();
        System.out.print("digite o preço: ");
        double preco = scanner.nextDouble(); scanner.nextLine();
        System.out.print("qual a quantidade de página: ");
        int quantpagina = scanner.nextInt(); scanner.nextLine();
         switch(i){
          case 1:
           c1.setidade(idade); c1.setnome(nome); c1.setsexo(sexo); c1.setemail(email); c1.setsenha(senha);
           l1.settitulo(titulo); l1.setautor(autor); l1.setanodepublicacao(anodepublicacao); l1.setquantpagina(quantpagina); l1.setpreco(preco);
           i+=1; 
           continue;
          case 2:
            c2.setidade(idade); c2.setnome(nome); c2.setsexo(sexo); c2.setemail(email); c2.setsenha(senha);
            l2.settitulo(titulo); l2.setautor(autor); l2.setanodepublicacao(anodepublicacao); l2.setquantpagina(quantpagina); l2.setpreco(preco);
            i+=1;
           continue;
          case 3:
            c3.setidade(idade); c3.setnome(nome); c3.setsexo(sexo); c3.setemail(email); c3.setsenha(senha);
            l3.settitulo(titulo); l3.setautor(autor); l3.setanodepublicacao(anodepublicacao); l3.setquantpagina(quantpagina); l3.setpreco(preco);
            i+=1;
            break;
          }
    }
    
    System.out.println("o cliente" + c1.getnome() + ", esta com o livro "+ l1.gettitulo() + ", e o preço por página dele é " + l1.calcularprecoporpagina());
    System.out.println("o cliente" + c2.getnome() + ", esta com o livro "+ l2.gettitulo() + ", e o preço por página dele é " + l2.calcularprecoporpagina());
    System.out.println("o cliente" + c3.getnome() + ", esta com o livro "+ l3.gettitulo() + ", e o preço por página dele é " + l3.calcularprecoporpagina());
    
}
} 
//Crie uma classe chamada Principal. Nela, coloque o método main.
//• No main, crie 3 instâncias de Cliente. Todas as informações necessárias para a criação
//dos objetos devem ser solicitadas pelo Teclado. Obs.: para todos os clientes deve ser
//indicado algum livro.
//• Imprima o preço por página de cada um dos livros dos clientes, no formato: "O cliente X
//está com o livro Y, e o preço por página deste livro é R$Z", substituindo X pelo nome do
//cliente, Y pelo título do livro e Z pelo preço por página deste livro.
//• Imprima as informações de todos os clientes criados.
