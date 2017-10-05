package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<Integer, String> converter = new LinkedHashMap<>();

    public RomanNumeral() {
        converter.put(500, "D");
        converter.put(400, "CD");
        converter.put(100, "C");
        converter.put(90, "XC");
        converter.put(50, "L");
        converter.put(40, "XL");
        converter.put(10, "X");
        converter.put(9, "IX");
        converter.put(5, "V");
        converter.put(4, "IV");
        converter.put(1, "I");
    }

    public String convert(int number) {
        StringBuilder romanNumber = new StringBuilder();
        for (int arabicNumber : converter.keySet()) {
            while (number >= arabicNumber) {
                romanNumber.append(converter.get(arabicNumber));
                number -= arabicNumber;
            }
        }
        return romanNumber.toString();
    }

}
