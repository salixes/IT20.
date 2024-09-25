/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LO2_SIMPLEIMPLEMENTATION;

/**
 *
 * @author Hp
 */
public class SIMPLEIMPLEMENTAION {
   public static void main(String[] args) {
      int[] simple_array = {1, 2, 3, 4, 5,6,7,8,9};
        
        for (int num : simple_array) {
            System.out.println(num);
        }

        int[][] multi_array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Displaying multi_array elements
        for (int[] sublist : multi_array) {
            for (int num : sublist) {
                System.out.println(num);
            }
        }
    }

}
