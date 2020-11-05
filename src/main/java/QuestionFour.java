import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuestionFour {

    private static void sortDiagonal(ArrayList<ArrayList<Integer>> mat) {
        int colSize = mat.get(0).size();
        int rowSize = mat.size();
        for (int i = 0; i < colSize; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int curRow = 0;
            int curCol = i;
            while(curRow < rowSize && curCol < colSize) {
                tmp.add(mat.get(curRow).get(curCol));
                curCol++;
                curRow++;
            }
            Collections.sort(tmp);
            curRow = 0;
            curCol = i;
            int curPos = 0;
            while(curRow < rowSize && curCol < colSize) {
                mat.get(curRow).set(curCol,tmp.get(curPos));
                curCol++;
                curRow++;
                curPos++;
            }
        }

        for (int i = 1; i < rowSize; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int curRow = i;
            int curCol = 0;
            while(curRow < rowSize && curCol < colSize) {
                tmp.add(mat.get(curRow).get(curCol));
                curCol++;
                curRow++;
            }
            Collections.sort(tmp);
            curRow = i;
            curCol = 0;
            int curPos = 0;
            while(curRow < rowSize && curCol < colSize) {
                mat.get(curRow).set(curCol,tmp.get(curPos));
                curCol++;
                curRow++;
                curPos++;
            }
        }
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> mat) {
        for (ArrayList<Integer> vec : mat) {
            for (Integer val : vec) {
                System.out.print(val + " ");
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList(Arrays.asList(3, 3, 1, 1)));
        matrix.add(new ArrayList(Arrays.asList(2, 2, 1, 2)));
        matrix.add(new ArrayList(Arrays.asList(1, 1, 1, 2)));
        sortDiagonal(matrix);
        printMatrix(matrix);
    }
}
