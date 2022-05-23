package com.elallouch.ebankingbackend.repositories;

import com.elallouch.ebankingbackend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository  extends JpaRepository<AccountOperation,Long> {
}
