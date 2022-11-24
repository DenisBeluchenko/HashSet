import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (symbols.containsKey(c)) {
                    symbols.put(c, symbols.get(c) + 1);
                } else {
                    symbols.put(c, 1);
                }
            }
        }
        int max = -1;
        int min =Integer.MAX_VALUE;
        char frequency = 0;
        for (char c : symbols.keySet()) {
            if (symbols.get(c) > max) {
                max = symbols.get(c);
                frequency = c;
            }
        }
        System.out.println("Больше всех встречактся символ "+frequency+" - "+max);
        for (char c : symbols.keySet()) {
            if (symbols.get(c) < min) {
                min = symbols.get(c);
                frequency = c;
            }
        }
        System.out.println("Меньше всех встречактся символ "+frequency+" - "+min);
    }
}
