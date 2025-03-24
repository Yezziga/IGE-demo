import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mapping letters to emoji
        HashMap<Character, String> emojiMap = new HashMap<>();
        emojiMap.put('a', "😀"); emojiMap.put('b', "😃"); emojiMap.put('c', "😄");
        emojiMap.put('d', "😁"); emojiMap.put('e', "😆"); emojiMap.put('f', "😅");
        emojiMap.put('g', "😂"); emojiMap.put('h', "🤣"); emojiMap.put('i', "😜");
        emojiMap.put('j', "😝"); emojiMap.put('k', "😛"); emojiMap.put('l', "😋");
        emojiMap.put('m', "😎"); emojiMap.put('n', "😍"); emojiMap.put('o', "😘");
        emojiMap.put('p', "😚"); emojiMap.put('q', "😙"); emojiMap.put('r', "😉");
        emojiMap.put('s', "😊"); emojiMap.put('t', "😇"); emojiMap.put('u', "😏");
        emojiMap.put('v', "😬"); emojiMap.put('w', "😐"); emojiMap.put('x', "😑");
        emojiMap.put('y', "😶"); emojiMap.put('z', "😯"); emojiMap.put('å', "😮");
        emojiMap.put('ä', "😕"); emojiMap.put('ö', "😟");

        // Mapping colors to bead count
        HashMap<Character, String> beadMap = new HashMap<>();
        beadMap.put('a', "🔴🔴"); beadMap.put('b', "🔴🔴🔴"); beadMap.put('c', "🔴🔴🔴🔴");
        beadMap.put('d', "🔵🔵"); beadMap.put('e', "🔵🔵🔵"); beadMap.put('f', "🔵🔵🔵🔵");
        beadMap.put('g', "🟢🟢"); beadMap.put('h', "🟢🟢🟢"); beadMap.put('i', "🟢🟢🟢🟢");
        beadMap.put('j', "🩷🩷"); beadMap.put('k', "🩷🩷🩷"); beadMap.put('l', "🩷🩷🩷🩷");
        beadMap.put('m', "🟠🟠"); beadMap.put('n', "🟠🟠🟠"); beadMap.put('o', "🟠🟠🟠🟠");
        beadMap.put('p', "🟣🟣"); beadMap.put('q', "🟣🟣🟣"); beadMap.put('r', "🟣🟣🟣🟣");
        beadMap.put('s', "⚫⚫"); beadMap.put('t', "⚫⚫⚫"); beadMap.put('u', "⚫⚫⚫⚫");
        beadMap.put('v', "⚪⚪"); beadMap.put('w', "⚪⚪⚪"); beadMap.put('x', "⚪⚪⚪⚪");
        beadMap.put('y', "🟡🟡"); beadMap.put('z', "🟡🟡🟡"); beadMap.put('å', "🟡🟡🟡🟡");
        beadMap.put('ä', "🟤🟤"); beadMap.put('ö', "🟤🟤🟤");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // User input
            System.out.print("Skriv in ditt namn: ");
            String name = scanner.nextLine().toLowerCase();
            // Convert name to emoji code
            StringBuilder emojiCode = new StringBuilder();
            StringBuilder beadCode = new StringBuilder();
            for (char letter : name.toCharArray()) {
                if (emojiMap.containsKey(letter)) {
                    emojiCode.append(emojiMap.get(letter)).append(" ");
                } else {
                    emojiCode.append(letter).append(" "); // Keep spaces or unknown characters
                }
                if (beadMap.containsKey(letter)) {
                    beadCode.append(beadMap.get(letter)).append(" ");
                } else {
                    beadCode.append(letter).append(" ");
                }
            }
            // Output results
            System.out.println("\n🔹 Ditt namn i emoji kod: " + emojiCode);
            System.out.println("🔹 Ditt namn i färgkod: " + beadCode);
            System.out.println("\n");
        }
    }
}