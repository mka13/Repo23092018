public class PG extends StatystykiZawodnika {
    String napis;
    public PG(double shot, int age, double wartosc, String name) {
        super(shot, age, wartosc, name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double obliczanieWartosci() {
        return 2*this.shot+this.wartosc;
    }

    public String shot3() {
        return "rzut za 3, szansa na trafienie: "+ this.shot*100;
    }

    public String shot2() {

        return "rzut za 2, szansa na trafienie: "+ this.shot*100;
    }

    public String shot1() {

        return "rzut za 1, szansa na trafienie: "+ this.shot*100;
    }

    public String faul() {

        return "faul ";
    }

    public String steal() {

        return "przechwyt";
    }
}
