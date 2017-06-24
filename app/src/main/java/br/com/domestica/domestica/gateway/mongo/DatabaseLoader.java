package br.com.domestica.domestica.gateway.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private ContactRepository repository;

    @Override
    public void run(String... strings) throws Exception {
    }
}

