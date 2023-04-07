package com.example.InsuranceManagement.Repository;

import com.example.InsuranceManagement.Models.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PolicyRepository extends CrudRepository<InsurancePolicy,Integer> {
}
