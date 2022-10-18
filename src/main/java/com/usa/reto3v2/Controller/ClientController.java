package com.usa.reto3v2.Controller;

import com.usa.reto3v2.Model.Client;
import com.usa.reto3v2.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Client")

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Client> getClient(@PathVariable("id") int id){
        return clientService.getClient(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save1 (@RequestBody Client client) {
        return clientService.save(client);
    }

    //el put  la ruta es /api/Client/update
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update (@RequestBody Client client) {
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete (@PathVariable("id") int id) {return clientService.delete(id);}


}

