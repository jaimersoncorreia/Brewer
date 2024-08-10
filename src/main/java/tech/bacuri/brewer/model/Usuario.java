package tech.bacuri.brewer.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Builder
public class Usuario {
    private String nome;
    private String email;
    private LocalDate nascimento;
    private String senha;
    private String confirmacaoSenha;
    private String status;

    public Integer getIdade() {
        if (nascimento == null)
            return 0;

        return Period.between(nascimento, LocalDate.now()).getYears();
    }
}
