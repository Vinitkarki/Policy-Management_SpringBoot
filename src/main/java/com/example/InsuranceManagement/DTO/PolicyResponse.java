package com.example.InsuranceManagement.DTO;

import com.example.InsuranceManagement.Models.Claim;
import com.example.InsuranceManagement.Models.Client;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class PolicyResponse {

    int id;
    int policyNumber;
    String policyType;
    int coverageAmount;
    int premium;
    LocalDate startDate;
    LocalDate endDate;

    Client client;
    Claim claim;
}
