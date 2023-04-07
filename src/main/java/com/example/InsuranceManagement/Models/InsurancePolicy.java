package com.example.InsuranceManagement.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int policyNumber;
    private String policyType;
    private int coverageAmount;
    private int premium;
    private LocalDate startDate;
    private LocalDate endDate;
    private int clientIdNo;

    @ManyToOne
    @JsonIgnore
    private Client client;

    @OneToOne(mappedBy = "policy",cascade = CascadeType.ALL)
    @JsonIgnore
    private Claim claim;

}
