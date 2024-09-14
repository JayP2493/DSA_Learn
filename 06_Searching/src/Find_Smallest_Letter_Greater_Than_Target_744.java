public class Find_Smallest_Letter_Greater_Than_Target_744 {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'},'a'));
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'},'c'));
        System.out.println(nextGreatestLetter(new char[] {'x', 'x', 'y', 'y'},'z'));
        System.out.println(nextGreatestLetter(new char[] {'c', 'f', 'j'},'d'));
        System.out.println(nextGreatestLetter(new char[] {'c', 'f', 'j'},'j'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int targetChar = (target - 'a') + 1;
        int lastChar = (letters[letters.length-1] - 'a') + 1;

        if (targetChar >= lastChar) {
            return letters[0];
        }

        while (start <= end) {

            int mid = start + (end-start)/2;
            int currentChar = (letters[mid] - 'a') + 1;

            if (targetChar < currentChar) {
                end = mid-1;
            } else {
                start = mid + 1;
            }

        }

        return letters[start];
    }
}
