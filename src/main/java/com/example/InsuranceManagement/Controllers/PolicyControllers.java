package com.example.InsuranceManagement.Controllers;

import com.example.InsuranceManagement.DTO.PolicyResponse;
import com.example.InsuranceManagement.Models.InsurancePolicy;
import com.example.InsuranceManagement.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyControllers {

    @Autowired
    PolicyService policyService;

    @GetMapping("/api/policies")
    public List<InsurancePolicy> getAllPolicies(){
        return policyService.getAllPolicies();
    }

    @PostMapping("/api/policies")
    public void addPolicy(@RequestBody InsurancePolicy insurancePolicy){
         policyService.addPolicy(insurancePolicy);
    }

    @GetMapping("/api/policies/{id}")
    public PolicyResponse getPolicyById(@PathVariable Integer id){
        return policyService.getPolicyById(id);
    }

    @PutMapping("/api/policies/{id}")
    public void updatePolicy(@PathVariable Integer id,@RequestBody InsurancePolicy policy){
        policyService.updatePolicy(id,policy);
    }

    @DeleteMapping("/api/policies/{id}")
    public void deletePolicy(@PathVariable Integer id){
        policyService.deletePolicy(id);
    }
}
