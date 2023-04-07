package com.example.InsuranceManagement.Converter;

import com.example.InsuranceManagement.DTO.ClaimResponse;
import com.example.InsuranceManagement.Models.Claim;

public class ClaimConverter {

    public static ClaimResponse convertEntityToDto(Claim claim){
        return ClaimResponse.builder().id(claim.getId()).claimNumber(claim.getClaimNumber()).claimStatus(claim.getClaimStatus()).claimDate(claim.getClaimDate()).description(claim.getDescription()).policy(claim.getPolicy()).build();
    }
}
