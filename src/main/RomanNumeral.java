package main;

import java.util.LinkedHashMap;

public class RomanNumeral {

    private LinkedHashMap<Integer, String> converter = new LinkedHashMap<>();

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
        while (number > 0) {
            for(int arabicNumber : converter.keySet()) {
                if (number >= arabicNumber) {
                    romanNumber.append(converter.get(arabicNumber));
                    number -= arabicNumber;
                    break;
                }
            }
        }
        return romanNumber.toString();
    }

}
