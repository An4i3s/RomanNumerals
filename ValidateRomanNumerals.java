import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateRomanNumerals {
        public  boolean ValidationOfRomanNumerals(String str){
            String regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
                 Pattern p = Pattern.compile(regex);

            if (str == null) {
                return false;
            }
            Matcher m = p.matcher(str);
            return m.matches();
        }
}
