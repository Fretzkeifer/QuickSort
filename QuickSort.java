/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class QuickSort {
   int[] fruit;
    
    public QuickSort(int[] fruit){
        this.fruit = fruit;
    }
    
    public void sort(){
        quicksort(0, fruit.length - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pivot = fruit[high];
            int i = low - 1;
            for (int j = low; j < high; j++){
                if (fruit[j] < pivot){
                    i++;
                }
            }
            
            int temp = fruit[i + 1];
            fruit[i + 1] = fruit[high];
            fruit[high] = temp;
            
            int pivotIndex = i + 1;
            
            quicksort(low, pivotIndex - 1);
            quicksort(pivotIndex + 1, high);
        }
      
    }
     public void print() {
        for (int fruit : fruit) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
