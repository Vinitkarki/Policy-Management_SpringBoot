package com.example.InsuranceManagement.DTO;

import com.example.InsuranceManagement.Models.InsurancePolicy;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class ClientResponse {

    int id;
    String name;
    LocalDate dob;
    String address;
    String mobileNumber;

    List<InsurancePolicy> policies;
}
