package n2ex1;

import n2ex1.generic.Address;
import n2ex1.generic.Phone;

public class Contact {
    private Address address;
    private Phone phone;

    public Contact(Address address, Phone phone) {
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address: " + address + " | Phone: " + phone;
    }
}
