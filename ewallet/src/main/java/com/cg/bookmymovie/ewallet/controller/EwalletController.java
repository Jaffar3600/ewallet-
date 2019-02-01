package com.cg.bookmymovie.ewallet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmymovie.ewallet.ewallet.Ewallet;
import com.cg.bookmymovie.ewallet.service.EwalletService;

@RestController
public class EwalletController {

	@Autowired
	private EwalletService service;

	@RequestMapping("/ewallets")
	public List<Ewallet> findAll() {
		return service.getAll();
	}

	@RequestMapping("/ewallets/{profileId}")
	public Optional<Ewallet> getById(@PathVariable int profileId) {
		return service.getByProfileId(profileId);

	}

	@PutMapping("/ewallets/{profileId}")
	public void deposit(@PathVariable int profileId, @RequestParam("currentBalance") double amount) {

		 service.deposit(profileId, amount);

	}
	
	@GetMapping("/ewallte/{profileId}")
	public Ewallet getStatement(@PathVariable int profileId) {
		
		return service.getStatement(profileId);
		
	}

}
