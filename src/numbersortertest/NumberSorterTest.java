/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numbersortertest;

/**
 *
 * @author kibat6204
 */
public class NumberSorterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numbers[] = {1,3,4,5,2};
        int index1 = 0;
        int index2 = 1;
        int num1 = 0;
        int num2 = 0;
        boolean exit = false;
        int numberOfPasses = 0;
        
        while(exit == false)
        {
            index1 = index1+1;
            index2 = index2+1;
            
            if(index2 == 5)
            {
                index2 = 0;
                index1 = 4;
            }
            if(index1 == 5)
            {
                index2 = 1;
                index1 = 0;
            }
            if(numbers[index1]>numbers[index2])
            {
                num1 = numbers[index1];
                num2 = numbers[index2];
                numbers[index1] = num2;
                numbers[index2] = num1;
                numberOfPasses = 0;
            }
            else
            {
                numberOfPasses = numberOfPasses+1;
            }
            if(numberOfPasses == 5)
            {
                exit = true;
            }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        
        
    }
    
}
