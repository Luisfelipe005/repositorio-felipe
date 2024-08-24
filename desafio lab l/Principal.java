import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        Loja loja = new Loja(10,null, 1, 1, null, null);
        Produto produto = new Produto(null, 1, null);
        while(i < 1000){
        System.out.print("\n(1) criar uma loja"+
        "\n(2) criar um produto"+
        "\n(3) sair" + "\nDigite O Número Conforme O Que Quer Fazer: ");
        int numescolhido = scanner.nextInt(); scanner.nextLine();
        switch(numescolhido){
            case 1:
                System.out.println("vc vai criar a loja");
                System.out.print("Digite O Nome Da Sua Loja: "); 
                String nomeloja = scanner.nextLine();
                System.out.print("Digite A quantidade de funcionarios que sua loja possuirá: ");
                int quantfuncionario = scanner.nextInt(); scanner.nextLine();
                System.out.print("digite o salario base de seus funcionarios: "); 
                float salariobase = scanner.nextFloat(); scanner.nextLine();
                System.out.println("digite o endereço da sua loja"); 
                System.out.print("Cidade: "); 
                String cidade = scanner.nextLine(); 
                System.out.print("Estado: "); 
                String estado = scanner.nextLine(); 
                System.out.print("País: ");
                String pais = scanner.nextLine();
                System.out.print("Rua: "); 
                String rua = scanner.nextLine();
                System.out.print("Número: "); 
                String numerodaloja = scanner.nextLine();
                System.out.print("Complemeto: ");
                String complemento = scanner.nextLine();
                System.out.print("CEP: ");
                String cep = scanner.nextLine();
                System.out.println("digite a data de fundação da loja (ex: DD/MM/AAAA) : ");
                System.out.print("Ano: ");
                int ano = scanner.nextInt(); scanner.nextLine();
                System.out.print("Mês: ");
                int mes = scanner.nextInt(); scanner.nextLine();
                System.out.print("Dia: ");
                int dia = scanner.nextInt(); scanner.nextLine();
                Data data= new Data(dia, mes, ano);
                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numerodaloja, complemento);
                loja.setNome(nomeloja); loja.setQuantidadeFuncionarios(quantfuncionario); loja.setSalarioBaseFuncionario(salariobase);
                loja.setEndereco(endereco); loja.setDataDeFundacao(data);
                i+=1;
                continue;
            case 2:
                System.out.println("vamos criar o produto!");
                System.out.print("Digite o Nome Do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                float preco = scanner.nextFloat(); scanner.nextLine();
                System.out.println("digite a data de validade do produto!");
                System.out.print("Ano: ");
                int anodoproduto = scanner.nextInt(); scanner.nextLine();
                System.out.print("mês: ");
                int mesdoproduto = scanner.nextInt(); scanner.nextLine();
                System.out.print("dia: ");
                int diadoproduto = scanner.nextInt(); scanner.nextLine();
                Data datadevali = new Data(diadoproduto, mesdoproduto, anodoproduto);
                produto.setDataDeValidade(datadevali); produto.setNome(nome); produto.setPreco(preco);
                i+=1;
                continue;
            case 3:
                System.out.println("Saindo...");
                i+=1;
                break;
            case 4:
                i+=1  ;
                continue;
        } 
    } 
    scanner.close();
    Data datavencimento = new Data(20, 10, 2023);
    System.out.println(produto.estaVencido(datavencimento));
    System.out.println(loja);
}
}
//O usuário, então, deve digitar 1 para criar um objeto do tipo Loja, 2 para criar um objeto do tipo Produto ou 3 para sair.
//O menu deve ser apresentado para o usuário até que ele informe o valor 3 (sair).
//Caso ele informe um valor inválido, imprima a mensagem “Opção inválida” e mostre o menu novamente, solicitando uma nova opção.
//Todas as informações para criação da loja e do produto devem ser solicitadas ao usuário pelo Teclado.
//Após criados os 2 objetos corretamente, seu programa deve:
//imprimir a mensagem "PRODUTO VENCIDO" ou "PRODUTO NÃO VENCIDO" caso o produto criado esteja vencido na data de 20/10/2023 
//(utilizando o método criado anteriormente para isso) o imprimir as informações da loja criada.