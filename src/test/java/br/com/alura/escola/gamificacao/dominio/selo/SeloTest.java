package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeloTest {

    @Test
    void deveCriarUmSelo() {
        Selo selo = new Selo (new CPF("123.456.789-00"), "Iniciante");
        assertEquals(new CPF("123.456.789-00"), selo.getCpfDoAluno());
        assertEquals("Iniciante", selo.getNome());
    }
}