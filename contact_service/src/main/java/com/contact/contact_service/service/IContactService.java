package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;

import java.util.List;

public interface IContactService
{
    public List<Contact> getContactsOfUser(Long userId);
}
