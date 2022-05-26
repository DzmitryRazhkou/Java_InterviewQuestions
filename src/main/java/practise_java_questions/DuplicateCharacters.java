package practise_java_questions;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Ssseemey";
        int count = 0;
        char[]js = str.toCharArray();
        System.out.println("Duplicated character are ");
        for (int i = 0; i < js.length; i++) {
            for (int j = i + 1; j < js.length; j++) {
                if (js[i] == js[j]) {
                    System.out.println(js[j]);
                    count++;
                    break;
                }
            }

        }

    }
}
