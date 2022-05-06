package com.contact.services;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list= List.of(
            new Contact(1001L,"Rohit@gmail.com","RM",1L),
            new Contact(1002L,"Pradeep@yahoo.com","Pradeep",2L),
            new Contact(1003L,"Tarun@hotmail.com","Tarun",3L)
    );

    @Override
    public List<Contact> getContacts(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
