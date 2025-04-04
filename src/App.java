import controller.shellsort;

public class App {
    public static void main(String[] args) throws Exception {
        shellsort sS = new shellsort();
        int[] a = { -10, 0, 4, 7, 2, 1, 9, 6, 5 };
        System.out.println("Daniel Sanchez");
        sS.printArray(a);
        System.out.println("-------------------------------------");

        // asendente//
        System.out.println("[\torden Ascendente\t]");
        sS.sort(a, false);

        // descendente//
        System.out.println("[\torden Descendente\t]");
        sS.sort(a, true);
        sS.printArray(a);
    }
}
