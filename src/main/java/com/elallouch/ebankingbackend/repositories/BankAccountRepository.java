package com.elallouch.ebankingbackend.repositories;

import com.elallouch.ebankingbackend.entities.AccountOperation;
import com.elallouch.ebankingbackend.entities.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository  extends JpaRepository<BankAccount,String> {

}
