package com.somedia.client.controller;

import com.somedia.client.entity.Client;
import com.somedia.client.service.ClientService;
import com.somedia.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientProvider {

    @Autowired
    private ClientService clientService;


    @GetMapping(path="/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }
    @PostMapping(path="/save")
    public  void saveClient(@RequestParam("client")Client client){
        clientService.saveClient(client);
    }
    @GetMapping(path="/signIn")
    public Client signIn(@RequestParam("email") String email,@RequestParam("password") String password){
       Client client =  clientService.signIn(email,password);
        System.out.println(client);
        return  client;
    }
}
