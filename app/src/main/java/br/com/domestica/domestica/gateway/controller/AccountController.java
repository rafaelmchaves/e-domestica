package br.com.domestica.domestica.gateway.controller;

import br.com.domestica.domestica.domains.Contact;
import br.com.domestica.domestica.gateway.ContactGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private ContactGateway contactGateway;

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public void createContact(@RequestBody Contact contact) {
        contactGateway.create(contact);
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getContacts() {
        return contactGateway.getContacts();
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public Contact getContact(String userName) {
        return contactGateway.getContact(userName);
    }

}
