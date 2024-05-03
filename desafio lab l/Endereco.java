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
    public String getnomedarua(){
        return this.nomedarua;
    }
    public String getcidade(){
        return this.cidade;
    }
    public String getestado(){
        return this.estado;
    }
    public String getpais(){
        return this.pais;
    }
    public String getcep(){
        return this.cep;
    }
    public String getnumero(){
        return this.numero;
    }
    public String getcomplemento(){
        return this.complemento;
    }
    public void setnomedarua(String nomedarua){
        this.nomedarua= nomedarua;
    }
    public void setcidade(String cidade){
        this.cidade= cidade;
    }
    public void setestado(String estado){
        this.estado = estado;
    }
    public void setpais(String pais){
        this.pais = pais;
    }
    public void setcep(String cep){
        this.cep = cep;
    }
    public void setnumero(String numero){
        this.numero = numero;
    }
    public void setcomplemento(String complemento){
        this.complemento = complemento;
    }
    @Override
    public String toString(){
        return "Nome Da Rua: "+ nomedarua +"\nCidade: "+ cidade + "\nEstado: " + estado + "\nPaís: " + pais + 
        "\nCEP: " + cep + "\nNúmero: " + numero + "\nComplemento: " + complemento; 
    }
}        



