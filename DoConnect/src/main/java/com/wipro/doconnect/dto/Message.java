package com.wipro.doconnect.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message
{
	@NotBlank(message = "Provide User Details")
	private String fromUser;
	
	@NotBlank(message = "Provide Message")
	private String message;
}
