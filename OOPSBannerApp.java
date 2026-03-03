public class OOPSBannerApp {

    public static void main(String[] args) {

 String[] lines = {

    String.join("  ",
            "  *****  ",
            "  *****  ",
            "  *****  ",
            "  *****  "),

    String.join("  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *        "),

    String.join("  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *        "),

    String.join("  ",
            " *     * ",
            " *     * ",
            "  *****  ",
            "  *****  "),

    String.join("  ",
            " *     * ",
            " *     * ",
            " *        ",
            "        * "),

    String.join("  ",
            " *     * ",
            " *     * ",
            " *        ",
            "        * "),

    String.join("  ",
            "  *****  ",
            "  *****  ",
            " *        ",
            "  *****  ")
};

        // Step 3: Use enhanced for-loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}