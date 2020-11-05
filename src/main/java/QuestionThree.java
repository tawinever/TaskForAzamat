import java.util.ArrayList;

public class QuestionThree {
    private static boolean isArithmeticProgression(ArrayList<Integer> list) {
        if (list.size() < 2) return true;
        int diff = list.get(1) - list.get(0);
        int cur = list.get(0) - diff;
        for (Integer member: list) {
            if (cur + diff != member) return false;
            cur = member;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(5);
        ar.add(8);
        ar.add(9);
        if (isArithmeticProgression(ar)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
