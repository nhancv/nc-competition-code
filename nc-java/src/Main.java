import codefights.challenge.AreIsomorphic;

public class Main {

    public static void main(String[] args) {
//        AreIsomorphic test = new AreIsomorphic();
//        int[][] array1 = new int[2][];
//        array1[0] = new int[]{1, 1, 1};
//        array1[1] = new int[]{0, 0};
//        int[][] array2 = new int[2][];
//        array2[0] = new int[]{2, 1, 1};
//        array2[1] = new int[]{2, 1};
//        System.out.println(test.areIsomorphic(array1, array2));

        AreIsomorphic test = new AreIsomorphic();
        System.out.println(test.pepEight(0));
        for (int i = 79; i < 81; i++) {
            System.out.println(test.pepEight(i));
        }
    }

}
