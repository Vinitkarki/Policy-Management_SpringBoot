package com.example.InsuranceManagement.Controllers;

import com.example.InsuranceManagement.DTO.ClientResponse;
import com.example.InsuranceManagement.Models.Client;
import com.example.InsuranceManagement.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientControllers {

    @Autowired
    ClientService clientService;

    @GetMapping("api/clients/{id}")
    public ClientResponse getClientById(@PathVariable Integer id){

        ClientResponse client=clientService.getClientById(id);

        return client;
    }

    @PostMapping("/api/clients")
    public void createClient(@RequestBody Client client){

        clientService.createClient(client);
    }

    @GetMapping("/api/clients")
    public List<Client> getAllClients(){

        return clientService.getAllClients();
    }

    @DeleteMapping("/api/clients/{id}")
    public void deleteClient(@PathVariable Integer id){

        clientService.deleteClient(id);
    }

    @PutMapping("/api/clients/{id}")
    public void updateClient(@PathVariable Integer id,@RequestBody Client client){

        clientService.updateClient(id,client);
    }

}
