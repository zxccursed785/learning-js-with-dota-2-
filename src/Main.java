import java.util.Scanner;

public class Main {
    private static final String word = "ХантыМансийск";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Угадай слово иначе лох");
        int length = word.length();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < length; i++) {
            stringBuilder.append("-");
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    String wordMask = StringBuilder.toString();

    System.out.println(wordMask);

    do {
        System.out.println("Черкани сюда букву: ");
        char c = input.next().charAt(0);

        if (word.indexOf(c) >= 0){
            System.out.println("Пон ты угадал");
        }

    }
    private static String replaceLetter(String letter, String wordMask){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= word.length(); i++){

        }
    }
}
