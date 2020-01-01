package com.reports.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(content = Include.NON_NULL)
public class ReportsResponse<T> {

	private String message;
	private String status;
	private T data;

	public ReportsResponse(String message, String status, T data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

}
