package cl.anpetrus.evencalculatormvp;

/**
 * Created by Petrus on 21-08-2017.
 */

public class EvenCalculation {
    EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void evenCalculation(String value) {
        if (value.trim().length() > 0) {
            int auxValue = Integer.parseInt(value);
            value += (auxValue % 2 == 0) ? " es par" : " es impar";
            callback.evenResult(value);
        } else {
            callback.blankInput();
        }
    }
}
