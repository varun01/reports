package com.reports.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reports.dto.Individual;
import com.reports.dto.ReportsResponse;

@RestController(value="/individual/")
public class ManageIndividualController {

	@PostMapping(path="add-individuals", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReportsResponse<Individual> addIndividuals(@RequestBody List<Individual> individuals){
		return null;
	}
	
	@DeleteMapping(path = "delete-individuals", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReportsResponse<Individual> deleteIndividuals(@RequestBody List<Individual> individuals){
		return null;
	}
	
	@GetMapping(path = "get-individuals", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReportsResponse<List<Individual>> getIndividuals(){
		return null;
	}
	
	@PutMapping(value = "update-individual", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ReportsResponse<Individual> updateIndividual(){
		return null;
	}
}
