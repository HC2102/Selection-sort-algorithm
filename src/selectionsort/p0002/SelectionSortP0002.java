/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort.p0002;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HE170417
 */
public class SelectionSortP0002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int input;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please enter a decimal number:");
        input = sc.nextInt();
        int[] numberList = new int[input];
        //generate random array number
        for(int i =0; i < input; i++){
            numberList[i] = rand.nextInt(input);
        }
        System.out.println("Array before sort:");
        display(numberList);
        selectionSort(numberList);
        System.out.println("Array after sort:");
        display(numberList);
        
        
    }
    
    public static void display(int[] numberList){
        System.out.print("{ ");
        for(int i =0; i<numberList.length; i++){
            System.out.print(numberList[i]+" ");
        }
        System.out.print("}\n");
    }
    
    public static void selectionSort(int[] numberList){
        // idea: divide the array into 2 subarrays sorted and unsorted
        int index,temp;
        for(int i =0 ; i< numberList.length;i ++){
            index = i; //pointer to divide 2 subarrays
            for(int j = index; j<numberList.length;j ++){
                if(numberList[index]>numberList[j]){ //select the smallest of the unsorted array and swap it to pointer
                    //swap algorithm
                    temp = numberList[index];
                    numberList[index] = numberList[j];
                    numberList[j] = temp;
                }
            } //pointer will increase 1 and move the wall between 2 subarrays away.
        }
    }
    
}
