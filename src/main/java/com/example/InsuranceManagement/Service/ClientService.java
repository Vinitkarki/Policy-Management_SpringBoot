package com.example.InsuranceManagement.Service;

import com.example.InsuranceManagement.Converter.ClientConverter;
import com.example.InsuranceManagement.DTO.ClientResponse;
import com.example.InsuranceManagement.Models.Client;
import com.example.InsuranceManagement.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientResponse getClientById(int id){

        Client client= clientRepository.findById(id).get();

        return ClientConverter.convertEntityToDto(client);
    }

    public void createClient(Client client){

        clientRepository.save(client);
    }

    public List<Client> getAllClients(){

        List<Client> clients= new ArrayList<>();
        clientRepository.findAll().forEach(client -> clients.add(client));

        return clients;

    }

    public void deleteClient(int id){

        clientRepository.deleteById(id);
    }

    public void updateClient(int id,Client client){


        Client prevDetails= clientRepository.findById(id).get();

        prevDetails.setName(client.getName());
        prevDetails.setDob(client.getDob());
        prevDetails.setAddress(client.getAddress());
        prevDetails.setMobileNumber(client.getMobileNumber());

        clientRepository.save(prevDetails);
    }
}
