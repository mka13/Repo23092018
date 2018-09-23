public class Center extends StatystykiZawodnika implements  Player {


    public Center(double shot, int age, double wartosc, String name) {
        super(shot, age, wartosc, name);
    }


    @Override
    public String shot3() {
        return null;
    }

    @Override
    public String shot2() {
        return null;
    }

    @Override
    public String shot1() {
        return null;
    }

    @Override
    public String faul() {
        return null;
    }

    @Override
    public String steal() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double obliczanieWartosci() {
        return this.shot+this.wartosc;
    }
}
