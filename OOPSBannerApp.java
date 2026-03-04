import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8
 * Use Map for Character Patterns and Render via Function
 */

public class OOPSBannerApp {

    // Create and store character patterns in HashMap
    public static Map<Character, String[]> createCharacterMap() {

        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        charMap.put(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return charMap;
    }

    // Function to display banner
    public static void displayBanner(String message, Map<Character, String[]> charMap) {

        for (int line = 0; line < 7; line++) {

            StringBuilder patternLine = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                patternLine.append(pattern[line]).append("  ");
            }

            System.out.println(patternLine.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}