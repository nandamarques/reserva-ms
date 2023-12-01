package br.ucsal.compose.models;

import org.springframework.cloud.openfeign.FeignClient;

import java.time.LocalDateTime;


public class Solicitacao {
    private Long id;
    private String nome;
    private LocalDateTime horaReserva;
    private Reserva reserva;

}
