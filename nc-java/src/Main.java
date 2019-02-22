import codefights.challenge.IsSkewSymmetricMatrix;

public class Main {

    public static void main(String[] args) {
        IsSkewSymmetricMatrix test = new IsSkewSymmetricMatrix();
        System.out.println(test.isSkewSymmetricMatrix(new int[][]{
                new int[]{0, 0, 1},
                new int[]{0, 0, -2},
                new int[]{-1, -2, 0},
        }));

    }

}
