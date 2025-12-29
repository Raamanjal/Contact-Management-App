package com.example.contactmanagement.repository;

import com.example.contactmanagement.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepository {

    private final List<Contact> contacts = new ArrayList<>();

    public List<Contact> findAll() {
        return contacts;
    }

    public void save(Contact contact) {
        contacts.add(contact);
    }

    public Contact findById(int id) {
        return contacts.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void delete(Contact contact) {
        contacts.remove(contact);
    }
}
