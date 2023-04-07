package com.example.InsuranceManagement.Repository;

import com.example.InsuranceManagement.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Integer> {
}
