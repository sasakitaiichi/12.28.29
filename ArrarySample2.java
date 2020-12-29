public class ArrarySample2 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'C', 'D'},
                {'B', 'D', 'C', 'D'},
                {'D', 'C', 'B', 'B'},
                {'A', 'A', 'C', 'D'}};

        char[] key = {'D', 'C', 'A', 'B'};

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            System.out.println("Student" + i + "'s correct count is:" + correctCount);
        }

    }
}
