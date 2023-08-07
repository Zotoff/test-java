package com.example.demo.services;

import com.example.demo.models.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//бизнес-логика
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
            return clientRepository.findAll();
    }


    public void saveClient(Client client){
        clientRepository.save(client);
    }


    public Client getClient(Long id){
        return clientRepository.findById(id).orElseThrow();
    }

    public Client updateClient(Client client)  {
        Client updatedClient = clientRepository.save(client);
        return updatedClient;
    }


}
