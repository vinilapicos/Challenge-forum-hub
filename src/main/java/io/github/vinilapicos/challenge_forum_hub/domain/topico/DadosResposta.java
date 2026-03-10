package io.github.vinilapicos.challenge_forum_hub.domain.topico;

import io.github.vinilapicos.challenge_forum_hub.domain.resposta.Resposta;

import java.time.LocalDateTime;

record DadosResposta(Long id, String mensagem, LocalDateTime dataCriacao, String nomeAutor, Boolean solucao) {
    public DadosResposta(Resposta resposta) {
        this(resposta.getId(), resposta.getMensagem(), resposta.getDataCriacao(), resposta.getAutor().getNome(), resposta.getSolucao());
    }
}
