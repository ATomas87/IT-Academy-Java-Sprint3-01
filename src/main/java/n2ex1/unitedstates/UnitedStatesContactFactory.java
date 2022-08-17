package n2ex1.unitedstates;

import n2ex1.generic.Address;
import n2ex1.generic.ContactFactory;
import n2ex1.generic.Phone;

public class UnitedStatesContactFactory implements ContactFactory {
    @Override
    public UnitedStatesAddress createAddress(String address) {
        return new UnitedStatesAddress(address);
    }

    @Override
    public UnitedStatesPhone createPhone(String phone) {
        return new UnitedStatesPhone(phone);
    }
}
