package codefights.challenge;

//https://app.codesignal.com/challenge/MYQxyzoojoNnaprNi
public class AreIsomorphic {

    //https://app.codesignal.com/challenge/ymMFKbCwTkQS4pJwu
    public int pepEight(int l) {
        return 80 / ~l;
    }

    int i, x;

    public Object areIsomorphic(int[][] a, int[][] b) {
        for (x = a.length; x == b.length & i < x && a[i].length == b[i].length; i++) ;
        return i == x;
    }

}
