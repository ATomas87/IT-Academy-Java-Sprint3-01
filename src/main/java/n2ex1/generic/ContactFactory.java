package n2ex1.generic;

public interface ContactFactory {
    Address createAddress(String address);
    Phone createPhone(String phone);
}
