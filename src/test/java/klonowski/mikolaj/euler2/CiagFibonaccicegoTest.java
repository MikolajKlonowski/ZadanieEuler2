package klonowski.mikolaj.euler2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CiagFibonaccicegoTest {
    @Test
    public void shouldReturnListe(){
        //given
        CiagFibonaccicego ciagFibonaccicego = new CiagFibonaccicego();
        int a = 100;
        List<Integer> wylosowaneLiczby = new ArrayList<>();
        wylosowaneLiczby.add(1);
        wylosowaneLiczby.add(2);
        wylosowaneLiczby.add(3);
        wylosowaneLiczby.add(5);
        wylosowaneLiczby.add(8);
        wylosowaneLiczby.add(13);
        wylosowaneLiczby.add(21);
        wylosowaneLiczby.add(34);
        wylosowaneLiczby.add(55);
        wylosowaneLiczby.add(89);
        //when
        List<Integer> wynik = ciagFibonaccicego.pierwszeLiczbyDoWartosci(a);
        //then
        Assert.assertThat(wynik, CoreMatchers.is(wylosowaneLiczby));






    }
}
