public enum Ebmiinfo {
    NIEDOWAGA("masz niedowagę"),
    PRAWIDLOWA("twoja waga jest prawidłowa"),
    NADWAGA("masz nadwagę"),
    OTYLOSC1("Otyłość I stopnia"),
    OTYLOSC2("Otyłość II stopnia"),
    OTYLOSC3("Otyłość III stopnia");

    private final String info;

    Ebmiinfo(String info) {
        this.info = info;
    }

    public String info() {
        return info;
    }
}
