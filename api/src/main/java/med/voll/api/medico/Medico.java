package med.voll.api.medico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

    @Table(name = "medicos")
    @Entity(name = "Medico")
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Medico {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private String crm;
        private String telefone;

        @Enumerated(EnumType.STRING)
        private Especialidade especialidade;

        @Embedded
        private Endereco endereco;

        private Boolean ativo;

        public Medico(){}
        public Medico(DadosCadastroMedico dados) {
            this.ativo = true;
            this.nome = dados.nome();
            this.email = dados.email();
            this.telefone = dados.telefone();
            this.crm = dados.crm();
            this.endereco = new Endereco(dados.endereco());
            this.especialidade = dados.especialidade();
        }

        public Long getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getCrm() {
            return crm;
        }

        public String getTelefone() {
            return telefone;
        }

        public Especialidade getEspecialidade() {
            return especialidade;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void atualizaDados(DadosAtualizacaoMedico dados) {
            if(dados.nome() != null){
                this.nome = dados.nome();
            }
            if(dados.telefone() != null){
                this.telefone = dados.telefone();
            }
            if(dados.endereco() != null){
                this.endereco.atualizaEndereco(dados.endereco());
            }
        }

        public void excluir() {
            this.ativo = false;
        }
    }
