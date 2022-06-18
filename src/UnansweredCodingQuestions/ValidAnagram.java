package UnansweredCodingQuestions;

public class ValidAnagram {

    public static void main(String[] args) {
        isAnagram("poop","popo");
    }

    public static boolean isAnagram(String s, String t) {

        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

        for (int i = 0; i < stringS.length; i++) {
            System.out.print(stringS[i]);
        }

        for (int j = 0; j < stringT.length; j++) {
            System.out.print(stringT[j]);
        }

        return false;

    }
}
