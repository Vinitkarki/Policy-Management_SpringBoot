package com.example.InsuranceManagement.Converter;

import com.example.InsuranceManagement.DTO.ClientResponse;
import com.example.InsuranceManagement.Models.Client;

public class ClientConverter {

    public static ClientResponse convertEntityToDto(Client client){
        return ClientResponse.builder().id(client.getId()).dob(client.getDob()).name(client.getName()).address(client.getAddress()).mobileNumber(client.getMobileNumber()).policies(client.getPolicies()).build();
    }
}
