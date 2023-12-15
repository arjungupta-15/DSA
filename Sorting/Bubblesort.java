package Sorting;

public class Bubblesort {
    public static void bubble(int Array[]){
        for(int i = 0;i<Array.length-1;i++){
            for(int j=0;j<Array.length-1-i;j++){
                if(Array[j]>Array[j+1]){
                    int temp = Array[j];
                    Array [j] = Array[j+1];
                    Array[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        
    }
}
