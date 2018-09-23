import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertTrue;
@RunWith(JUnitParamsRunner.class)
public class PG3Test {
PG pg1;
PrzyjmowanieZawodnikowDoDraftu draft2019;
    List<StatystykiZawodnika> nowaLista;
@Before
public void setUP(){
    draft2019=new PrzyjmowanieZawodnikowDoDraftu(nowaLista);
}

@Test
    @FileParameters("src/test/java/testy.csv")
    public void TworzenieZawodnika(double shot, int wiek, double wartosc, String imie,String result){
    pg1=new PG(shot,wiek,wartosc,imie);
    draft2019.dodawanieZawodnika(pg1);
    assertTrue(draft2019.draftZawodnikow.get(0).name.equals(result));

}
}
