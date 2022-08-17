package n2ex1;

import n2ex1.spain.SpanishAddress;
import n2ex1.spain.SpanishContactFactory;
import n2ex1.unitedstates.UnitedStatesContactFactory;

public class Main {
    public static void main(String[] args) {
        ContactBook agenda = new ContactBook();

        UnitedStatesContactFactory usaFactory = new UnitedStatesContactFactory();
        agenda.addContact(usaFactory.createAddress("Broadway 154, Manhattan"), usaFactory.createPhone("555-665-315"));

        SpanishContactFactory spanishFactory = new SpanishContactFactory();
        agenda.addContact(spanishFactory.createAddress("Gran Vía 547, Madrid"), spanishFactory.createPhone("916325784"));

        agenda.printContacts();
    }
}
