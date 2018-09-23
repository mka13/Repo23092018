import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PGTest {
    PG nowyPG;
    PG nowyPG2;
    PG nowyPG3;
    PG nowyPG4;
    PG nowyPG5;
    PrzyjmowanieZawodnikowDoDraftu draft2019;
    List<StatystykiZawodnika>nowaLista;
    valueComparator komparator;


    @Before
    public void setUp() {
        nowyPG=new PG(0.6,20,50,"Ingram");
        nowyPG2=new PG(0.4,19,30,"Simmons");
        nowyPG3=new PG(0.7,19,60,"DSJ");
        nowyPG4=new PG(0.3,19,20,"Fulc");
        nowyPG5=new PG(0.5,19,45,"Hart");
        System.out.println(nowyPG.shot3());
        draft2019=new PrzyjmowanieZawodnikowDoDraftu( nowaLista);
        komparator = new valueComparator();

    }
    @Test
    public void testowanieWyswietlania(){

        //given

        //when

        //then
        assertTrue("rzut za 3, szansa na trafienie: 60.0".equals(nowyPG.shot3()));


    }


    @Test
    public void TestowanieWyliczaniaWartosc(){
        assertTrue(nowyPG.obliczanieWartosci()==51.2);
    }

    @Test
    public void TestowanieListy(){

        draft2019.dodawanieZawodnika(nowyPG);
        draft2019.dodawanieZawodnika(nowyPG2);
        draft2019.dodawanieZawodnika(nowyPG3);
        draft2019.dodawanieZawodnika(nowyPG4);
        draft2019.dodawanieZawodnika(nowyPG5);


        draft2019.SortowanieWgNajlepszychZawodnikow();


        assertTrue(draft2019.draftZawodnikow.get(0).name.equals("DSJ"));
    }
@Test(expected = NullPointerException.class)
public void test2(){
draft2019.SortowanieWgNajlepszychZawodnikow();
}

@Test
    public void TestBledow(){
        try {
            draft2019.SortowanieWgNajlepszychZawodnikow();
        }catch (Exception e){
            assertTrue(e instanceof  NullPointerException);
            assertTrue(e.getMessage().equals("Nie ma żadnych wpisów na liście"));
        }
}

@Test
    public void testowanie(){
    draft2019.dodawanieZawodnika(nowyPG);
    draft2019.dodawanieZawodnika(nowyPG2);
    draft2019.dodawanieZawodnika(nowyPG3);
    draft2019.dodawanieZawodnika(nowyPG4);
    draft2019.dodawanieZawodnika(nowyPG5);
    draft2019.SortowanieWgNajlepszychZawodnikow();
  assertThat(draft2019.draftZawodnikow).isSortedAccordingTo(komparator);
}


}