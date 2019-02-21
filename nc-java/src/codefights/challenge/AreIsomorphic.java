package codefights.challenge;

public class AreIsomorphic {

    Object pepEight(int l) {
        return l < 80;
    }

    public Object areIsomorphic(int[][] a, int[][] b) {
        int i = 0, x = a.length;
        for (; x == b.length & i < x && a[i].length == b[i].length; i++) ;
        return i == x;
    }

}
