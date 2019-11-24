import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public final class tiro {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = bf.readLine()) != null) System.out.println(palindromize(input));
    }

    /**
     *
     * @param word word to be palindromized
     * @return Palindromized word with the less number of characters removed
     *         It's done by finding the largest common subsequence between the word and itself reversed
     */
    static String palindromize(String word) {
        String reverseWord = (new StringBuilder()).append(word).reverse().toString();
        return maxCommonSubSequence(word, reverseWord);
    }

    /**
     *
     * @param word1 first word or characters sequence
     * @param word2 second word or characters sequence
     * @return Max Common Sub-sequence
     */
    static String maxCommonSubSequence(String word1, String word2){
        int [][] dynamicProgrammingMatrix = dynamicProgrammingSubSequencesMatrix(word1, word2);
        return matrixRollBack(word1, word2, dynamicProgrammingMatrix);
    }

    /**
     *
     * @param word1 first word or characters sequence
     * @param word2 second word or characters sequence
     * @return Dynamic programming matrix containing the information of the largest common subsequence:
     *      W O R D 2
     *   [0 0 0 0 0 0]
     * W [0 1 1 1 1 1]
     * O [0 1 2 2 2 2]
     * R [0 1 2 3 3 3]
     * D [0 1 2 3 4 4]
     * 1 [0 1 2 3 4 4]
     */
    static int[][] dynamicProgrammingSubSequencesMatrix(String word1, String word2){
        int [][] dynamicProgrammingMatrix = fillMatrix(word1.length() + 1, word2.length() + 1);
        for (int index1 = 1; index1 < word1.length() + 1; index1++){
            char character1 = word1.charAt(index1 - 1);
            for (int index2 = 1; index2 < word2.length() + 1; index2++){
                char character2 = word2.charAt(index2 - 1);
                if (character1 == character2){
                    dynamicProgrammingMatrix[index1][index2] = dynamicProgrammingMatrix[index1-1][index2-1] + 1;
                } else {
                    dynamicProgrammingMatrix[index1][index2] = Math.max(dynamicProgrammingMatrix[index1-1][index2],
                            dynamicProgrammingMatrix[index1][index2-1]);
                }
            }
        }
        // print2D(dynamicProgrammingMatrix);
        return dynamicProgrammingMatrix;
    }

    /**
     *
     * @param width matrix width
     * @param height matrix height
     * @return first matrix in the style:
     * [0 0 0]
     * [0 / /]
     * [0 / /]
     */
    static int[][] fillMatrix(int width, int height){
        int [][] dynamicProgrammingMatrix = new int[width][height];
        for (int index1 = 1; index1 < dynamicProgrammingMatrix.length; index1++){
            dynamicProgrammingMatrix[index1][0] = 0;
        }
        for (int index1 = 1; index1 < dynamicProgrammingMatrix[0].length; index1++){
            dynamicProgrammingMatrix[0][index1] = 0;
        }
        return dynamicProgrammingMatrix;
    }

    /**
     *
     * @param word1 First word from which the common characters will be taken
     * @param word2 Second word from which the common characters will be taken
     * @param dynamicProgrammingMatrix matrix containing the info of the common characters
     * @return Largest common subsequence
     */
    static String matrixRollBack(String word1, String word2, int [][] dynamicProgrammingMatrix){
        StringBuilder maxCommonSubSequence = new StringBuilder();
        int i = word1.length();
        int j = word2.length();
        while (i > 0 && j > 0){
            if (word1.charAt(i - 1) == word2.charAt(j - 1)){
                maxCommonSubSequence.append(word1.charAt(i - 1));
            }
            if (dynamicProgrammingMatrix[i - 1][j] > dynamicProgrammingMatrix[i][j - 1]){
                i--;
            } else {
                j--;
            }
        }
        return maxCommonSubSequence.reverse().toString();
    }

    static void print2D(int [][] mat) {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

}