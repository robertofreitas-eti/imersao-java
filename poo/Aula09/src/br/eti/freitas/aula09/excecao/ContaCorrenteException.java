package br.eti.freitas.aula09.excecao;

public class ContaCorrenteException extends Exception {

	private static final long serialVersionUID = 1L;

	private final ErrorCode code;

	public ContaCorrenteException(ErrorCode error) {
		super();
		this.code = error;
	}

	public ContaCorrenteException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public ContaCorrenteException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}

	public ContaCorrenteException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public ContaCorrenteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace, ErrorCode code) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}

	public ErrorCode getCode() {
		return code;
	}
	
}
