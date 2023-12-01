package ucsal.bes.arq20232.solicitacao.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDateTime horaReservaInicio;
    private LocalDateTime horaReservaFim;

    @ManyToOne()
    @JoinColumn(name = "laboratorio_id")
    private Laboratorio laboratorio;

    @ManyToOne()
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @ManyToOne()
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
