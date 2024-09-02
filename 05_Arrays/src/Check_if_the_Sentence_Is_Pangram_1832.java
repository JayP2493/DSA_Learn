import java.util.HashMap;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("xyz"));
    }
    public static boolean checkIfPangram(String sentence) {
        char[] arr = sentence.toCharArray();

        if (arr.length < 26) {
            return false;
        }

        int count = 0;
        HashMap<Character,Integer> charMap = new HashMap<>();

        for (char i : arr) {
            if (!charMap.containsKey(i)) {
                count++;
                charMap.put(i,1);
            }
        }

        return  count >= 26;
    }
}
