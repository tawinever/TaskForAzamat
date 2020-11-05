import java.io.*;
import java.util.Scanner;

public class QuestionOne {

    private static void readLine(int lineNumber) throws IOException, IllegalArgumentException {
        InputStream is = QuestionOne.class.getClassLoader().getResourceAsStream("test.txt");
        InputStreamReader ir = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(ir);
        String line;
        while ((line = bf.readLine()) != null){
            lineNumber--;
            if(lineNumber == 0) {
                System.out.println(line);
                break;
            }
        }
        if (lineNumber > 0)
            throw new IllegalArgumentException();
    }

    private static void readLineWithException(int lineNumber) {
        try {
            readLine(lineNumber);
        } catch (IOException e) {
            System.out.println("Incorrect input");
        } catch (IllegalArgumentException e) {
            System.out.println("Bad line number");
        }
    }



    public static void main(String[] args) {
        System.out.println("Enter line number:");
        Scanner in = new Scanner(System.in);
        int lineNumber = in.nextInt();
        readLineWithException(lineNumber);
    }
}
