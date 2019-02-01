package com.cg.bookmymovie.ewallet.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookmymovie.ewallet.ewallet.Ewallet;
import com.cg.bookmymovie.ewallet.ewallet.Statement;
import com.cg.bookmymovie.ewallet.repository.EwalletRepository;

@Service
public class EwalletServiceImpl implements EwalletService {

	@Autowired
	private EwalletRepository repo;

	@Override
	public List<Ewallet> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Ewallet> getByProfileId(Integer profileId) {

		return repo.findById(profileId);
	}

	@Override
	public void deposit(Integer profileId, Double amount) {
		Ewallet wallet = repo.findById(profileId).get();
		wallet.setCurrentBalance(wallet.getCurrentBalance()+amount);
		double balance = wallet.getCurrentBalance();
		repo.save(wallet);
		System.out.println(balance);
	}
	
	
	@Override
	public Ewallet getStatement(int profileId) {
		Ewallet wallet = repo.findById(profileId).get();
		Statement statement = new Statement();
		statement.setDateandtime(LocalDateTime.now());
		statement.setTransactionType("ticket");
		statement.setRemarks("xyz");
		statement.setTransactionId(wallet.getStatement().getTransactionId());
		wallet.setStatement(statement);
		return repo.save(wallet);
	}
	
	

}
