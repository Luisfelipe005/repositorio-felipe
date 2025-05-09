package med.voll.api.endereco;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(){}
    
    public Endereco(DadosEndereco dados) {
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.numero = dados.numero();
        this.uf = dados.uf();
        this.complemento = dados.complemento();

    }

    public void atualizaEndereco(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.cep() != null){
            this.cep = dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if(dados.numero() != null){
            this.numero = dados.numero();
        }
        if(dados.uf() != null){
            this.uf = dados.uf();
        }
        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }
    }
}
