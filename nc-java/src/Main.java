
import java.util.Arrays;
import java.util.List;

import codefights.challenge.ShortestPathBetweenDoors;


public class Main {

    public static void main(String[] args) {

        ShortestPathBetweenDoors test = new ShortestPathBetweenDoors();
        System.out.println(test.shortestPathBetweenDoors(new int[][]{
                {0, 0, 0, 0},
                {2, 0, 1, 0},
                {0, 1, 0, 0},
                {1, 0, 2, 0}
        }));
//        System.out.println(test.shortestPathBetweenDoors(new int[][]{
//                {0, 0},
//                {2, 2}
//        }));
    }

}
