package codeeval.easy.morsecode;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        final Scanner scanner = new Scanner(new File(args[0]), Charset.defaultCharset().name());
        final Map<String, Character> morseCode = new HashMap<>();
        morseCode.put(".-", 'A');
        morseCode.put("-...", 'B');
        morseCode.put("-.-.", 'C');
        morseCode.put("-..", 'D');
        morseCode.put(".", 'E');
        morseCode.put("..-.", 'F');
        morseCode.put("--.", 'G');
        morseCode.put("....", 'H');
        morseCode.put("..", 'I');
        morseCode.put(".---", 'J');
        morseCode.put("-.-", 'K');
        morseCode.put(".-..", 'L');
        morseCode.put("--", 'M');
        morseCode.put("-.", 'N');
        morseCode.put("---", 'O');
        morseCode.put(".--.", 'P');
        morseCode.put("--.-", 'Q');
        morseCode.put(".-.", 'R');
        morseCode.put("...", 'S');
        morseCode.put("-", 'T');
        morseCode.put("..-", 'U');
        morseCode.put("...-", 'V');
        morseCode.put(".--", 'W');
        morseCode.put("-..-", 'X');
        morseCode.put("-.--", 'Y');
        morseCode.put("--..", 'Z');
        morseCode.put("-----", '0');
        morseCode.put(".----", '1');
        morseCode.put("..---", '2');
        morseCode.put("...--", '3');
        morseCode.put("....-", '4');
        morseCode.put(".....", '5');
        morseCode.put("-....", '6');
        morseCode.put("--...", '7');
        morseCode.put("---..", '8');
        morseCode.put("----.", '9');

        while (scanner.hasNextLine()) {
            final String[] sequence = scanner.nextLine().split(" ");
            for (final String string : sequence) {
                final Character c = morseCode.get(string);
                System.out.print(c != null ? c : " ");
            }

            if (scanner.hasNextLine()) {
                System.out.println("");
            }
        }
        scanner.close();
    }
}
