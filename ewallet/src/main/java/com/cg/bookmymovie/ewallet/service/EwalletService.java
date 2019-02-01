package com.cg.bookmymovie.ewallet.service;

import java.util.List;
import java.util.Optional;

import com.cg.bookmymovie.ewallet.ewallet.Ewallet;
import com.cg.bookmymovie.ewallet.ewallet.Statement;

public interface EwalletService {

	List<Ewallet> getAll();

	Optional<Ewallet> getByProfileId(Integer profileId);
	 public void deposit(Integer profileId,Double amount);

	 public Ewallet getStatement(int profileId);

	
}
