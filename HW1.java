package HomeWork2DArray;

public class HW1 {
    public static void main(String[] args) {
        String[][]student={
                { "Anya","Nikola","Matea","David"},
                {"A","B", "C","D"},

        };
        for (int i=0; i< student.length; i++){
            if (student[1][i].equals("A") || student[1][i].equals("B")){
                System.out.println(student[0][i]);
            }
        }
    }
}
