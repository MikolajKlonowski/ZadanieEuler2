package klonowski.mikolaj.euler2;

import java.util.ArrayList;
import java.util.List;

public class CiagFibonaccicego {
    public static void main(String[] args) {
        CiagFibonaccicego ciagFibonaccicego = new CiagFibonaccicego();
        List<Integer> wynik = ciagFibonaccicego.pierwszeLiczbyDoWartosci(4_000_000);
        System.out.println(wynik.toString());
    }

    public List<Integer> pierwszeLiczbyDoWartosci(int a) {

        List<Integer> wynik = new ArrayList<>();
        wynik.add(1);
        wynik.add(2);
        for (int i = 1; wynik.get(i)+wynik.get(i-1) < a; i++) {


            wynik.add(wynik.get(i) + wynik.get(i - 1));


        }


        return wynik;


    }
}
