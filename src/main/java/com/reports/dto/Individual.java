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
public class Individual {

	private Integer studntId;
	private String frstName;
	private String lstName;
	private Long phNum;
	private Long altPhNum;
	private String email;

}
