package med.voll.api.paciente;

import med.voll.api.medico.DadosListagemMedico;

public record DadosListagemPaciente(String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
