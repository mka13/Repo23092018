public abstract class StatystykiZawodnika implements Player {
    double shot;
    int age;
    double wartosc;
    String name;

    public StatystykiZawodnika(double shot, int age, double wartosc, String name) {
        this.shot = shot;
        this.age = age;
        this.wartosc = wartosc;
        this.name = name;
    }

public abstract String getName();
    public abstract double obliczanieWartosci();


}
