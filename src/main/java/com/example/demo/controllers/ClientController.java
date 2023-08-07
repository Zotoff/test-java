package com.example.demo.controllers;

import com.example.demo.models.Client;
import com.example.demo.services.ClientService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//контроллеры для вызова в постман
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController( ClientService clientService){
        this.clientService = clientService;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping("/{id}")
    public Client getClients(@PathVariable Long id){
        return clientService.getClient(id);
    }
    @PostMapping()
    public void saveClient(@RequestBody Client client){
        clientService.saveClient(client);
    }
    @PutMapping()
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}
