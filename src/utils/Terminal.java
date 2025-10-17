package utils;

public class Terminal {
    public static void clear() {
        System.out.print("\033c\r");
    }

    public static void title(String title) {
        int width = 30;

        if (title.length() >= width) {
            System.out.println(title);
            return;
        }

        int padding = (width - title.length()) / 2;
        System.out.println("-".repeat(padding) + " " + title + " " + "-".repeat(width - padding - title.length()) + "\n");
    }

    public static void error(String msg) {
        System.out.println("\033[91m\r[!] " + msg + "\033[0m\r");
    }
}
