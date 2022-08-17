package n2ex1.generic;

public abstract class Address {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}
