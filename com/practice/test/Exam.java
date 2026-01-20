
public class Exam{
    static String makeDouble(String str){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            res.append(c);
            res.append(c);
        }return res.toString();
    }
    public static void main(String[] args) {
        // original marks matrix
        int[][] marks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = marks.length;        // students
        int cols = marks[0].length;     // subjects

        // -----------------------------
        // 1️⃣ TRANSPOSE
        // -----------------------------
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = marks[i][j];
            }
        }

        System.out.println("Transpose of Marks:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // -----------------------------
        // 2️⃣ TOTAL MARKS OF EACH STUDENT
        // -----------------------------
        System.out.println("\nTotal marks of each student:");

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + " Total = " + sum);
        }
        System.out.println(makeDouble("The"));
    }
}