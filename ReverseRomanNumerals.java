public class ReverseRomanNumerals {

    public String intToRoman(int decimal){
        String romanString = "";
        if(decimal==0){
            System.out.println("0 is not a valid number");
        }else if(decimal>= 4000){
            System.out.println("only number between 1 and 3999 are accepted. Insert valid number");
        }else{
            if (decimal>= 1000){
                int x = decimal/1000;
                romanString += "M".repeat(x);
                decimal = decimal-(1000*x);
            }
            if (decimal <= 999 && decimal >= 900 ){
                int s = (decimal/100)*100 ;
                romanString += "CM";
                decimal = decimal-s;
            }
            if (decimal>= 500){
                int y = decimal/500;
                romanString += "D".repeat(y);
                decimal = decimal-(500*y);
            }
            if (decimal>= 100){
                int z = decimal/100;
                romanString +=  z>3 ? "CD" : "C".repeat(z);
                decimal = decimal-(100*z);
            }
            if (decimal <= 99 && decimal >= 90 ){//947
                int s = (decimal/10)*10 ;
                romanString += "XC";
                decimal = decimal-s;
            }
            if (decimal>= 50){
                int w = decimal/50;
                romanString += "L".repeat(w);
                decimal = decimal-(50*w);
            }
            if (decimal>= 10){
                int a = decimal/10;
                romanString += a>3 ? "XL" :"X".repeat(a);
                decimal = decimal-(10*a);
            }
            if (decimal == 9){
                romanString += "IX";
                decimal = decimal-9;
            }
            if (decimal>= 5){
                int b = decimal/5;
                romanString += "V".repeat(b);
                decimal = decimal-(5*b);
            }
            if (decimal>= 1){
                int c = decimal;
                romanString +=  c>3 ? "IV":"I".repeat(c);
            }
        }
return romanString;
    }
}
