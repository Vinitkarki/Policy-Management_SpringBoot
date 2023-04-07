package com.example.InsuranceManagement.Controllers;

import com.example.InsuranceManagement.DTO.ClaimResponse;
import com.example.InsuranceManagement.Models.Claim;
import com.example.InsuranceManagement.Service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClaimControllers {

    @Autowired
    ClaimService claimService;

    @GetMapping("/api/claims")
    public List<Claim> getAllClaims(){
        return claimService.getAllClaims();
    }

    @PostMapping("/api/claims")
    public void addClaim(@RequestBody Claim claim){
        claimService.addClaim(claim);
    }

    @GetMapping("/api/claims/{id}")
    public ClaimResponse getClaimById(@PathVariable Integer id){
        return claimService.getClaimById(id);
    }

    @PutMapping("/api/claims/{id}")
    public void updateClaim(@PathVariable Integer id,@RequestBody Claim claim){
        claimService.updateClaim(id,claim);
    }

    @DeleteMapping("/api/claims/{id}")
    public void deleteClaim(@PathVariable Integer id){
        claimService.deleteClaim(id);
    }
}
