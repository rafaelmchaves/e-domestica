package br.com.domestica.domestica.service;

import br.com.domestica.domestica.domains.Contact;
import br.com.domestica.domestica.gateway.ContactGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AttendContact {

    @Autowired
    private ContactGateway contactGateway;

    public void execute(String id, String description) {
        Contact contact = contactGateway.getContactByName(id);
        contact.setDescription(description);
        contact.setAttended(true);
        contact.setUpdateDate(LocalDateTime.now());
        this.contactGateway.update(contact);
    }
}
