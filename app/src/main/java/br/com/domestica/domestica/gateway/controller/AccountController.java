package br.com.domestica.domestica.gateway.controller;

import br.com.domestica.domestica.domains.Contact;
import br.com.domestica.domestica.gateway.ContactGateway;
import br.com.domestica.domestica.service.AttendContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private ContactGateway contactGateway;
    @Autowired
    private AttendContact attendContact;

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public void createContact(@RequestBody Contact contact) {
        contactGateway.create(contact);
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getContacts() {
        return contactGateway.getContacts();
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public Contact getContact(@PathVariable String userName) {
        return contactGateway.getContactByName(userName);
    }

    @RequestMapping(value = "/contact/{id}", method = RequestMethod.PATCH)
    public void attend(@PathVariable  String id, String description) {
        attendContact.execute(id, description);
    }

}
