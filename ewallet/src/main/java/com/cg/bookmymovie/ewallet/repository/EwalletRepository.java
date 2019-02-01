package com.cg.bookmymovie.ewallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookmymovie.ewallet.ewallet.Ewallet;
@Repository
public interface EwalletRepository extends JpaRepository<Ewallet, Integer>{

}
