import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrzyjmowanieZawodnikowDoDraftu {

        List<StatystykiZawodnika>draftZawodnikow=new ArrayList<>();

    public PrzyjmowanieZawodnikowDoDraftu(List<StatystykiZawodnika> draftZawodnikow) {
        draftZawodnikow = draftZawodnikow;
    }

    public void dodawanieZawodnika(StatystykiZawodnika nowyZawodnik){
        draftZawodnikow.add(nowyZawodnik);
    }


    public void SortowanieWgNajlepszychZawodnikow(){
        if( draftZawodnikow.size()==0 ){
        throw new NullPointerException("Nie ma żadnych wpisów na liście");
        }
        draftZawodnikow.sort(new Comparator<StatystykiZawodnika>() {
            @Override
            public int compare(StatystykiZawodnika o1, StatystykiZawodnika o2) {
                return (int) (o2.obliczanieWartosci()-o1.obliczanieWartosci());
            }
        });

    }


}

