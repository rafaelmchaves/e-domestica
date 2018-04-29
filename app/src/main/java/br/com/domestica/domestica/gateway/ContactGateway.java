package br.com.domestica.domestica.gateway;

import br.com.domestica.domestica.domains.Contact;

import java.util.List;

public interface ContactGateway {
    void create(Contact contact);
    List<Contact> getContacts();
    Contact getContactByName(String userName);
    Contact getContactById(String id);
    Contact update(Contact contact);

}
