public class Produto {
    private Data datadevalidade;
    private String nome;
    private float preco;

    public Produto(){
    }
    public Produto(String nome, float preco, Data datadevalidade){
        this.nome = nome;
        this.preco = preco;
        this.datadevalidade = datadevalidade;
    }
    public Data getDataDeValidade(){
        return this.datadevalidade;
    }
     public String getNome(){
        return this.nome;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setDataDeValidade(Data datadevalidade){
        this.datadevalidade = datadevalidade;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setPreco(float preco){
        this.preco= preco;
    }
    @Override
    public String toString(){
        return "Nome Do Produto: " + nome + "\nPreço: R$" + preco + "\nData: " + datadevalidade.toString();
    }
    public boolean estaVencido(Data data){
        if(datadevalidade.getano()== data.getano()){
            if(datadevalidade.getmes() == data.getmes()){
                if(datadevalidade.getdia() <= data.getdia()){
                    return true;
                }
                else{
                    return false;                
                }
            }
            else if(datadevalidade.getmes()< data.getmes()){
                return true;
            }
            else
                return false;
            

        }
        else if(datadevalidade.getano()< data.getmes()){
            return true;
        }
        else
            return false;
        
        }
        }

    
//Um Produto possui, além dos atributos já criados, uma data de validade (do tipo Data).
// Crie os métodos de acesso deste atributo. Além disso, atualize o construtor para receber a data de validade do produto.
//Na classe Produto, crie um método chamado estaVencido, que recebe uma data por parâmetro (objeto do tipo Data)
//e retorna verdadeiro caso o produto esteja vencido em relação a esta data ou falso caso contrário.