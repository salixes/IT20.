    package LO2_Multidimensionalarray;

    public class Multidimensionalarray{
    public static void main(String[] args){

    int[][] matrix = {
              {3, 4, 5},
              {6, 7,8}, 
              {9,10,11},

    };
       //Printing the 2D array 
        System.out.println ("matrix:");
        for (int i= 0; i < matrix.length; i++){
             for (int j = 0; j < matrix.length; j++) {
                 System.out.print(matrix [i][j]+ " ");

        System.out.println();
        //ove to the nest linn afses printing each tow
    }     }
}
}