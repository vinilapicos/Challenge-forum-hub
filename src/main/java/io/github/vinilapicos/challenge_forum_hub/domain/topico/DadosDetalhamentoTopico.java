package io.github.vinilapicos.challenge_forum_hub.domain.topico;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        String nomeAutor,
        StatusTopico status,
        List<DadosResposta> respostas
) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getAutor().getNome(),
                topico.getStatus(),
                topico.getRespostas().stream().map(DadosResposta::new).toList()
        );
    }
}

