package aulas._regex._r_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Contact us at 123-456-7890 or 987-654-3210.";

        Pattern pattern = Pattern.compile("""
                \\d{3}-\\d{3}-\\d{4}""");

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Found match: " + matcher.group());
        }
    }
}
