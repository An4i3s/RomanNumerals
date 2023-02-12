import java.util.HashMap;

// TODO: 07/02/2023 Reverse Roman Numberals 
public class RomanNumeralsBis {

    private String romanString;

    public int decodedRomanNumerals (String string) throws IndexOutOfBoundsException {
        this.romanString = string;
        ValidateRomanNumerals validateRomanNumerals = new ValidateRomanNumerals();
        boolean isValid = validateRomanNumerals.ValidationOfRomanNumerals(this.romanString);
        if(!isValid){
            System.out.println("Invalid Roman Number.");
        }else {
            int romanCalculation = 0;
            string = string.toUpperCase();
            char[] stringArray = string.toCharArray();
            for (int i = 0; i < stringArray.length; i++) {

                switch (stringArray[i]) {
                    case 'I':
                        romanCalculation += 1;
                        break;
                    case 'V':
                        romanCalculation += 5;
                        break;
                    case 'X':
                        romanCalculation += 10;
                        break;
                    case 'L':
                        romanCalculation += 50;
                        break;
                    case 'C':
                        romanCalculation += 100;
                        break;
                    case 'D':
                        romanCalculation += 500;
                        break;
                    case 'M':
                        romanCalculation += 1000;
                        break;
                }

            }
            if (string.contains("IV"))
            {
                romanCalculation -=2;
            }
            if (string.contains("IX"))
            {
                romanCalculation -=2;
            }
            if (string.contains("XL"))
            {
                romanCalculation -=20;
            }
            if (string.contains("XC"))
            {
                romanCalculation -= 20;
                System.out.println("roman calculation is "+romanCalculation);
            }
            if (string.contains("CD"))
            {
                romanCalculation -=200;
            }
            if (string.contains("CM"))
            {
                romanCalculation-=200;
            }
            return romanCalculation;

        }
        return 0;
        }

}
