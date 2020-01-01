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
public class Marks {

	private Integer marksId;
	private Integer marks;
	private String remarks;
	private Subject subject;
}
