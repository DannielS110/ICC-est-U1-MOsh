package controller;

public class shellsort {
    public void sort(int[] arr, boolean des) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            int cambios = 0; 

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && (
                        (des && arr[j - gap] < temp) || (!des && arr[j - gap] > temp)
                )) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                    cambios++;
                }

                arr[j] = temp;
            }

            System.out.println(cambios + " cambios en el Gap " + gap + ":");
            printArray(arr);
            System.out.println("-------------------------------------");
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]); 
            }
        }
        System.out.println();
    }
}