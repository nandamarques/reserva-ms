package br.ucsal.compose.dto;

import java.time.LocalDateTime;

public record SolicitacaoDTO(String nome, LocalDateTime horaReserva, Reser) {
}
