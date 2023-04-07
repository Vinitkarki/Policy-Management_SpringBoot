package com.example.InsuranceManagement.Converter;

import com.example.InsuranceManagement.DTO.PolicyResponse;
import com.example.InsuranceManagement.Models.InsurancePolicy;

public class PolicyConverter {

    public static PolicyResponse convertEntityToDto(InsurancePolicy policy){

       return PolicyResponse.builder().id(policy.getId()).policyNumber(policy.getPolicyNumber()).policyType(policy.getPolicyType()).coverageAmount(policy.getCoverageAmount()).premium(policy.getPremium()).startDate(policy.getStartDate()).endDate(policy.getEndDate()).client(policy.getClient()).claim(policy.getClaim()).build();
    }
}
