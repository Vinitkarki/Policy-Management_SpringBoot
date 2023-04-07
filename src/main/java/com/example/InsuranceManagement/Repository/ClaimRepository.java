package com.example.InsuranceManagement.Repository;

import com.example.InsuranceManagement.Models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClaimRepository extends CrudRepository<Claim,Integer> {
}
