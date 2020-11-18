public class Oblicz implements Numer {
    double m;
    double w;

    public Oblicz(double m, double w) {
        this.m = m;
        this.w = w;
    }
    public double policzBMI() {
        return m/Math.pow(w/100,faktor);
    }

}
