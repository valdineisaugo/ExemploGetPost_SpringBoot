package com.unifaesp.myapp;

import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

//Esta classe mapeia todas as chamadas http (GET, POST, DELETE, PUT...)
@RestController
public class MainController {
    //localhost:8080
    @GetMapping("/")
    public String index(){
        return "My SpringBoot APP - Unifaesp";
    }
    //localhost:8080/teste
    @GetMapping("/teste")
    public String teste(){
        return "Você chamou um teste!";
    }
    //local:8080/api/valor
    @PostMapping("/api/valor")
    public String valor(@RequestBody String info){
        return "Informação recebida: " + info;
    }

    @GetMapping("/status")
    public String status(){
        OperatingSystemMXBean op = ManagementFactory.getOperatingSystemMXBean();
        return op.getArch() + " - " +op.getAvailableProcessors() + " - " +op.getName();
    }

    @GetMapping("/json")
    public String json(){
        JSONObject myJson = new JSONObject();
        myJson.put("nome", "João");
        myJson.put("sobrenome", "Silva");
        myJson.put("idade", 23);
        return myJson.toString();
    }

    @PostMapping("/api/validate")
    public String validate(@RequestBody String info){
        //Validar se recebeu um JSON correto
        return "";
    }





}
