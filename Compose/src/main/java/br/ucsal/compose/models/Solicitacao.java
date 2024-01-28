package br.ucsal.compose.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Solicitacao {
    private Long id;
    private String nome;
    private LocalDateTime horaReservaInicio;
    private LocalDateTime horaReservaFim;
    private Laboratorio laboratorio;
    private Disciplina disciplina;
    private Professor professor;
}
