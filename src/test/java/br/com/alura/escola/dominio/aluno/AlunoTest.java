package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno(new CPF("123.456.789-00"), "Fulano", new Email("fulano@teste.com"));
    }

    @Test
    void devePermitirCadastrarAlunosComUmTelefones() {
        aluno.adicionarTelefone("11", "123450987");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void devePermitirCadastrarAlunosComDoisTelefones() {
        aluno.adicionarTelefone("11", "123456789");
        aluno.adicionarTelefone("11", "123450987");
        assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    void naoDevePermitirCadastrarAlunosComMaisDoisTelefones() {
        assertThrows(QuantidadeDeTelefonesExcedidoException.class, () -> {
            aluno.adicionarTelefone("11", "12345679");
            aluno.adicionarTelefone("11", "12345678");
            aluno.adicionarTelefone("11", "12345678");
        });
    }
}