package HomeWork2DArray;

public class HW5 {
    public static void main(String[] args) {
        int [][] numbers={
                {1,2,3,4},
                {13,15,6,12},
                {44,55,10,15}
        };
        for (int[] number:numbers){
            for (int i:number){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
