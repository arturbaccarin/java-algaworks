package com.algaworks.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafoodapi.di.model.Client;
import com.algaworks.algafoodapi.di.service.ClientActivationService;

@Controller
public class MyFirstController {

    private ClientActivationService clientActivationService;

    public MyFirstController(ClientActivationService clientActivationService) {
        this.clientActivationService = clientActivationService;

        System.out.println("MyFirstController: " + clientActivationService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Client joao = new Client("joao", "joao@ywr.com", "2615181661");

        clientActivationService.activate(joao);

        return "Hello friend 2";
    }
}
