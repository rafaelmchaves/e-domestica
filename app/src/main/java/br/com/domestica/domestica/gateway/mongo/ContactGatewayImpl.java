package br.com.domestica.domestica.gateway.mongo;

import br.com.domestica.domestica.domains.Contact;
import br.com.domestica.domestica.gateway.ContactGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class ContactGatewayImpl implements ContactGateway {

    @Autowired
    private ContactRepository repository;

    @Override
    public void create(Contact contact) {
        contact.setCreatedDate(LocalDateTime.now());
        repository.save(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return repository.findAll();
    }

    @Override
    public Contact getContact(String userName) {
        return repository.findByUserName(userName);
    }
}
