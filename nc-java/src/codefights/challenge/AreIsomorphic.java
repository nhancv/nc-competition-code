package codefights.challenge;

public class AreIsomorphic {

    public int pepEight(int l) {
        return l / 80 ^ 1;
    }

    int i, x;

    public Object areIsomorphic(int[][] a, int[][] b) {
        for (x = a.length; x == b.length & i < x && a[i].length == b[i].length; i++) ;
        return i == x;
    }

}
