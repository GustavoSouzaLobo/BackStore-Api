package com.gustavo.projeto.service.exeption;

public class ObjectNotFoundedExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundedExeption(String message, Throwable cause) {
		super(message, cause);

	}

	public ObjectNotFoundedExeption(String message) {
		super(message);

	}

}
