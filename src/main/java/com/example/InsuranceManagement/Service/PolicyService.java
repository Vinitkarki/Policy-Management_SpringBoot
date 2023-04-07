package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Converter.PolicyConverter;
import com.example.InsuranceManagement.DTO.PolicyResponse;
import com.example.InsuranceManagement.Models.Claim;
import com.example.InsuranceManagement.Models.Client;
import com.example.InsuranceManagement.Models.InsurancePolicy;
import com.example.InsuranceManagement.Repository.ClaimRepository;
import com.example.InsuranceManagement.Repository.ClientRepository;
import com.example.InsuranceManagement.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository policyRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClaimRepository claimRepository;

    public List<InsurancePolicy> getAllPolicies(){

        List<InsurancePolicy> policies=new ArrayList<>();
        policyRepository.findAll().forEach(policy->policies.add(policy));

        return policies;
    }

    public PolicyResponse getPolicyById(int id){

        InsurancePolicy insurancePolicy= policyRepository.findById(id).get();



        return PolicyConverter.convertEntityToDto(insurancePolicy);
    }

    public void addPolicy(InsurancePolicy insurancePolicy){


        int idClient=insurancePolicy.getClientIdNo();
        Client client=clientRepository.findById(idClient).get();
        insurancePolicy.setClient(client);

        policyRepository.save(insurancePolicy);

    }

    public void deletePolicy(int id){
        policyRepository.deleteById(id);
    }

    public void updatePolicy(int id,InsurancePolicy policy){
        InsurancePolicy insurancePolicy=policyRepository.findById(id).get();

        insurancePolicy.setPolicyNumber(policy.getPolicyNumber());
        insurancePolicy.setPolicyType(policy.getPolicyType());
        insurancePolicy.setClaim(policy.getClaim());
        insurancePolicy.setCoverageAmount(policy.getCoverageAmount());
        insurancePolicy.setPremium(policy.getPremium());
        insurancePolicy.setStartDate(policy.getStartDate());
        insurancePolicy.setEndDate(policy.getEndDate());
        insurancePolicy.setClientIdNo(policy.getClientIdNo());

        policyRepository.save(insurancePolicy);
    }
}
