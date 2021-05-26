package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements IContactService
{
    List<Contact> list = List.of(
            new Contact(11L,"sanket@gmail.com","Sanket more",1311L),
            new Contact(12L,"paragt@gmail.com","Parag more",1L),
            new Contact(13L,"bill@gmail.com","Bill Gates",1311L),
            new Contact(14L,"elont@gmail.com","Elon Musk",1L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
