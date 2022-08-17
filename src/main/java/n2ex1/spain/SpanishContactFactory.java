package n2ex1.spain;

import n2ex1.generic.ContactFactory;

public class SpanishContactFactory implements ContactFactory {

    @Override
    public SpanishAddress createAddress(String address) {
        return new SpanishAddress(address);
    }

    @Override
    public SpanishPhone createPhone(String phone) {
        return new SpanishPhone(phone);
    }
}
