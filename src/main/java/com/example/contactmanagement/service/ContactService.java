package com.example.contactmanagement.service;

import com.example.contactmanagement.model.Contact;
import com.example.contactmanagement.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public void addContact(Contact contact) {
        repository.save(contact);
    }

    public boolean updateContact(int id, Contact updatedContact) {
        Contact existing = repository.findById(id);
        if (existing != null) {
            existing.setName(updatedContact.getName());
            existing.setPhone(updatedContact.getPhone());
            existing.setEmail(updatedContact.getEmail());
            return true;
        }
        return false;
    }

    public boolean deleteContact(int id) {
        Contact contact = repository.findById(id);
        if (contact != null) {
            repository.delete(contact);
            return true;
        }
        return false;
    }
}
