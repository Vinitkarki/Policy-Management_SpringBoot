package com.example.InsuranceManagement.DTO;

import com.example.InsuranceManagement.Models.InsurancePolicy;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class ClaimResponse {

    int id;
    int claimNumber;
    String description;
    LocalDate claimDate;
    String claimStatus;

    InsurancePolicy policy;
}
