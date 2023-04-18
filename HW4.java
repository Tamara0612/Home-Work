package HomeWork2DArray;

public class HW4 {
    public static void main(String[] args) {


        int[][] numbers = {
                {10, 20, 30},
                {22, 44, 77},
                {6, 12, 15}
        };
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
            System.out.println(sum);
        }

    }
}
