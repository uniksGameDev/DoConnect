package com.wipro.doconnect.chat.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO
{
	@NotBlank(message = "provide the user Details")
	private String fromUser;

	@NotBlank(message = "provide message")
	private String message;
}
