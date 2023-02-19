package com.rashad.paymentservice.repository;

import com.rashad.paymentservice.entity.UserBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBalanceRepository extends JpaRepository<UserBalance, Integer> {
}
