package HomeWork2DArray;

public class HW6 {
    public static void main(String[] args) {
        String [][] arr={
                {"USA", "Mexico", "Cuba"},
                {"Argentina", "Peru","Colombia"},
                {"Serbia", "Italy","France"},
                {"Japan", "India", "China"},
                {"Angola", "Nigeria", "Cameroon"}
        };
        for (int row=0; row< arr.length; row++){
            for (int col=0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String [] countries:arr )
            for (String country:countries){
                System.out.print(country+" ");
            }
            System.out.println();
        }

    }

