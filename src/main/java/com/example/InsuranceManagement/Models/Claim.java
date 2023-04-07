package com.example.InsuranceManagement.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int claimNumber;
    private String description;
    private LocalDate claimDate;
    private String claimStatus;
    private int policyNo;

    @OneToOne
    @JsonIgnore
    private InsurancePolicy policy;
}
