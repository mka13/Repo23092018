import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testy {
    public static void main(String[] args) throws ParseException {
        float cena=25.8972f;
        int wiek;
        String text;
        String text2="Michal";
       int test = 2345;


        double suma=30;
        cena= (float) suma+50;
        Date date = czas.konswersjaWprowadzonejDaty("20.08.2018", "dd.MM.yyyy");

        text=String.format(" wartosc zmiennej typu double to %.4f |%s| Nazwa zmiennej typu int to %d, a data to %tc ",cena,text2,test,date);
        System.out.println(text);

        Integer [] tablica = {5,2,8,7,9,13,15,27,99,4};
        //metodaWyswietlaniaTablicy(tablica);
        List<Integer> integers = Arrays.asList(tablica);
        List<Integer> listaPosortowanaIpomnozonaRazyDwa = integers.stream()
                .filter(x->x>20)
                .map(x -> x * 2)
                .peek(x-> System.out.println(x))
                .sorted((x1, x2) -> Integer.compare(x2, x1))
                .peek(x-> System.out.println(x))
                .collect(Collectors.toList());


        System.out.println("dlugosc listy to: " +integers.size());

        for (Integer x:listaPosortowanaIpomnozonaRazyDwa
             ) {
            System.out.println(x);
        }

        System.out.println("----------------");
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i]=tablica[i]*2;
        }

        for (int x:tablica
             ) {
            System.out.println(x);

        }

        System.out.println(Pattern.compile("\\d{3}-\\d{3}-\\d{3}").matcher("123-123-123").find());

    }




public static void metodaWyswietlaniaTablicy(Object[]tablica){
    for (int i = 0; i <tablica.length ; i++) {
        System.out.println(tablica[i]);
    }
}




}
