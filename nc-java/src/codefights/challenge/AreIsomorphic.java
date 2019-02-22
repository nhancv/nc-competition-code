package codefights.challenge;

public class AreIsomorphic {

    public int pepEight(int l) {
        return 80 / ~l;
    }

    int i, x;

    public Object areIsomorphic(int[][] a, int[][] b) {
        for (x = a.length; x == b.length & i < x && a[i].length == b[i].length; i++) ;
        return i == x;
    }

}
