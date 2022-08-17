package n2ex1.generic;

public abstract class Phone {
    private String phone;

    public Phone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return phone;
    }
}
