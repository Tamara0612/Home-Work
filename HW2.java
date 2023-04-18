package HomeWork2DArray;

public class HW2 {
    public static void main(String[] args) {
        String [][] cars={
                {"Cadilac", "Tesla", "Ford"},
                {"Audi", "BMW", "Porsche"},
                {"Kia", "Hyndai", "Daewoo"},
                {"Alfa Romeo", "Fiat", "Ferrari"}
        };
        for (int i=0; i< cars.length; i++){
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]);
            }
        }
        System.out.println();
        for (String[] car:cars){
            for(String A:car){
                System.out.print(A+" ");
            }
        }
    }
}
