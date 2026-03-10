package io.github.vinilapicos.challenge_forum_hub.domain.curso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository <Curso, Long> {
    Curso findByNome(String nome);
}
