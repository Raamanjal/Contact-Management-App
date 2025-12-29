package com.example.contactmanagement.controller;

import com.example.contactmanagement.model.Contact;
import com.example.contactmanagement.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // POST /contacts
    @PostMapping
    public String addContact(@RequestBody Contact contact) {
        if (contact.getName() == null || contact.getPhone() == null) {
            return "Invalid contact data";
        }
        service.addContact(contact);
        return "Contact added successfully";
    }

    // GET /contacts
    @GetMapping
    public List<Contact> getContacts() {
        return service.getAllContacts();
    }

    // PUT /contacts/{id}
    @PutMapping("/{id}")
    public String updateContact(@PathVariable int id,
                                @RequestBody Contact contact) {

        boolean updated = service.updateContact(id, contact);
        return updated ? "Contact updated successfully" : "Contact not found";
    }

    // DELETE /contacts/{id}
    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable int id) {
        return service.deleteContact(id)
                ? "Contact deleted successfully"
                : "Contact not found";
    }
}
