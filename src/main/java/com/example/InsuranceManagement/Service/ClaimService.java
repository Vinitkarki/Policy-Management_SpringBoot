package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Converter.ClaimConverter;
import com.example.InsuranceManagement.DTO.ClaimResponse;
import com.example.InsuranceManagement.Models.Claim;
import com.example.InsuranceManagement.Models.InsurancePolicy;
import com.example.InsuranceManagement.Repository.ClaimRepository;
import com.example.InsuranceManagement.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimService {

    @Autowired
    ClaimRepository claimRepository;

    @Autowired
    PolicyRepository policyRepository;
    public List<Claim> getAllClaims(){

        List<Claim> claims=new ArrayList<>();
        claimRepository.findAll().forEach(claim->claims.add(claim));

        return claims;
    }

    public ClaimResponse getClaimById(int id){

        Claim claim=claimRepository.findById(id).get();

        return ClaimConverter.convertEntityToDto(claim);
    }

    public void addClaim(Claim claim){

        int policyNo=claim.getPolicyNo();
        InsurancePolicy policy=policyRepository.findById(policyNo).get();
        claim.setPolicy(policy);

        claimRepository.save(claim);
    }

    public void deleteClaim(int id){
        claimRepository.deleteById(id);
    }

    public void updateClaim(int id,Claim claim){

        Claim oldClaim=claimRepository.findById(id).get();

        oldClaim.setClaimDate(claim.getClaimDate());
        oldClaim.setClaimNumber(claim.getClaimNumber());
        oldClaim.setClaimStatus(claim.getClaimStatus());
        oldClaim.setDescription(claim.getDescription());


        claimRepository.save(oldClaim);
    }
}
