package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDTO {
	private String campo;
	private String mensagem;

	public ErroDeFormularioDTO(String campo, String erro) {
		this.campo = campo;
		this.mensagem = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return mensagem;
	}

}
