package com.somedia.client.service;

import com.somedia.client.entity.Client;
import com.somedia.client.repository.ClientRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sun.tools.javac.util.List.of;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAll() {
       return repository.findAll();
    }

    public void saveClient(Client client) {
    repository.save(client);
    }
    public  Client signIn(String email, String password){
     return repository.findByClientByEmailAndPassword(email,password);
    }
}
