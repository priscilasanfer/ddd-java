package br.com.alura.escola.academico.dominio.aluno;

import java.util.Objects;

public class Email {
	
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || 
				!endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Email email = (Email) o;
		return endereco.equals(email.endereco);
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco);
	}
}
