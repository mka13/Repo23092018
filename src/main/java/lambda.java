import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {
        Liczba liczba=(a,b)->a>b;
        System.out.println(liczba.multiple(9.14,8.86));
        String [] lista = {"michal","jan","andrzej"};
        Arrays.sort(lista,(String x1,String x2)->x1.compareTo(x2));


     List<String> lista2=Arrays.asList(lista).stream()
                .sorted((x1,x2)->x1.compareTo(x2))
                .collect(Collectors.toList());

//        try {
//            System.out.println(dzielenie(10, 0));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("OK");
//
dzielenie(10,0);
        System.out.println("OK");
  }

public static int dzielenie (int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Nie można dzielić przez 0");
        }
                return a/b;
}
}
