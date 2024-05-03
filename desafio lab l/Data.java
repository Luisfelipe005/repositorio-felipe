public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(dia<=0 || dia>=32 && mes<=0 || mes >=13){
           System.out.println("ERRO!");
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
           setano(2000); setmes(1); setdia(1);
        }
        if((ano % 4 == 0 && ano % 100 !=0) || ano % 400 == 0){
            if(mes==2){
                if(dia >= 1 || dia <=29){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                    setano(ano); setmes(mes); setdia(dia);
              }
            }
           }
            
    }
    public int getdia(){
        return this.dia;
    }
    public int getmes(){
        return this.mes;
    }
    public int getano(){
        return this.ano;
    }
    public void setdia(int dia){
        this.dia = dia;
    }
    public void setmes(int mes){
        this.mes = mes;
    }
    public void setano(int ano){
        this.ano = ano;
    }
    @Override
    public String toString(){
        return getdia() + "/" + getmes() + "/" + getano(); 
    }
    public boolean verificaAnoBissexto(){
      if((getano() % 4 == 0 && getano() % 100 != 0) || getano() % 400 == 0 ){
          return true;
        }
      else
        return false;
    }
    public static void main(String[] args) {
    Data data = new Data(29, 2, 1900);
    System.out.println(data.verificaAnoBissexto());
    }
}


//Método Construtor: crie 1 construtor que um recebe parâmetros para inicializar todos os atributos. 
//Neste construtor, você deve validar a data informada nos parâmetros. 
//Ou seja, o método construtor deve verificar se o dia é condizente com o mês, levando em conta, também, 
//o fato de o ano poder ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode ser atribuído em anos bissextos.
//Caso a data seja inválida, o método construtor deve imprimir uma mensagem de erro e alterar a data para a seguinte data padrão:
// 1/1/2000.
//Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
//Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, 
//retornando uma String que representa a data no formato dia/mês/ano.
//Método verificaAnoBissexto: este método não recebe parâmetros e 
//retorna verdadeiro caso o ano seja bissexto e falso caso contrário.