package HomeWork2DArray;

public class HW3 {
    public static void main(String[] args) {
        String[][] grocery = {
                {"Beans","Cabbage", "Tomato"},
                {"Apple", "Cherry","Orange"},
                {"Milk","Sour cream","Yogurt"},
                {"Milka", "Ice Cream", "Twix"}
        };
        for (int i=0; i<grocery.length; i++){
            for (int j=0; j< grocery[i].length; j++){
                System.out.print(grocery[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] str : grocery){
            for(String List : str){
                System.out.println();
                System.out.print(List+" ");
            }
        }

    }
}
