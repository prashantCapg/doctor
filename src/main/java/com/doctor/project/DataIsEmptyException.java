package com.doctor.project;

public class DataIsEmptyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DataIsEmptyException(String str) {
		super(str);
	}
}