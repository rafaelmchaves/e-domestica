package br.com.domestica.domestica.gateway;

import br.com.domestica.domestica.domains.Contact;

import java.util.List;

public interface ContactGateway {
    void create(Contact contact);
    List<Contact> getContacts();
    Contact getContact(String userName);
}
