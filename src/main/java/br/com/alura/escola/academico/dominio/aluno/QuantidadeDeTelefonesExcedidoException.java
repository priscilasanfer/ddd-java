package br.com.alura.escola.academico.dominio.aluno;

public class QuantidadeDeTelefonesExcedidoException extends RuntimeException {
    public QuantidadeDeTelefonesExcedidoException() {
        super("Quantidade de telefones excedido.");
    }
}
