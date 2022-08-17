package n2ex1;

import n2ex1.generic.Address;
import n2ex1.generic.Phone;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private List<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Address address, Phone phone){
        this.contacts.add(new Contact(address, phone));
    }

    public void printContacts(){
        this.contacts.forEach(System.out::println);
    }
}
