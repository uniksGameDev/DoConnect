package com.wipro.doconnect.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AlreadyThere extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private String errorMsg;

}
