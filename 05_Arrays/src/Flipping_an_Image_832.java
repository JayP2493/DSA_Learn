import java.util.Arrays;

public class Flipping_an_Image_832 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flipAndInvertImage(new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
        System.out.println(Arrays.toString(flipAndInvertImage(new int[][] {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}})));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length-1;

            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
