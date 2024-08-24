//nomeDaRua, cidade, estado, pais (sem acento), cep (do tipo String), numero (sem acento e também do tipo String) 
//e complemento (String).
public class Endereco {
    private String nomedarua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomedarua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomedarua= nomedarua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais= pais;
        this.cep= cep;
        this.numero= numero;
        this.complemento= complemento;
    }
    public String getNomeDaRua(){
        return this.nomedarua;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getPais(){
        return this.pais;
    }
    public String getCep(){
        return this.cep;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public void setNomeDaRua(String nomedarua){
        this.nomedarua= nomedarua;
    }
    public void setCidade(String cidade){
        this.cidade= cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    @Override
    public String toString(){
        return "Nome Da Rua: "+ nomedarua +"\nCidade: "+ cidade + "\nEstado: " + estado + "\nPaís: " + pais + 
        "\nCEP: " + cep + "\nNúmero: " + numero + "\nComplemento: " + complemento; 
    }
}



