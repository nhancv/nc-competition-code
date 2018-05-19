package codefights.interview.trees;

/**
 * https://codefights.com/interview-practice/task/FwAR7koSB3uYYsqDp
 * Consider a special family of Engineers and Doctors. This family has the following rules:
 * <p>
 * Everybody has two children.
 * The first child of an Engineer is an Engineer and the second child is a Doctor.
 * The first child of a Doctor is a Doctor and the second child is an Engineer.
 * All generations of Doctors and Engineers start with an Engineer.
 * We can represent the situation using this diagram:
 * <p>
 * E
 * /         \
 * E           D
 * /   \        /  \
 * E     D      D    E
 * / \   / \    / \   / \
 * E   D D   E  D   E E   D
 * Given the level and position of a person in the ancestor tree above, find the profession of the person.
 * Note: in this tree first child is considered as left child, second - as right.
 * <p>
 * Example
 * <p>
 * For level = 3 and pos = 3, the output should be
 * FindProfession(level, pos) = "Doctor".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer level
 * <p>
 * The level of a person in the ancestor tree, 1-based.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ level ≤ 30.
 * <p>
 * [input] integer pos
 * <p>
 * The position of a person in the given level of ancestor tree, 1-based, counting from left to right.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ pos ≤ 2(level - 1).
 * <p>
 * [output] string
 * <p>
 * Return Engineer or Doctor.
 */
public class FindProfession {

    String findProfession(int level, int pos) {
        if (level == 1)
            return "Engineer";
        if (findProfession(level - 1, (pos + 1) / 2).equals("Doctor")) {
            if (pos % 2 > 0) return "Doctor";
            else return "Engineer";
        }
        if (pos % 2 > 0) return "Engineer";
        else return "Doctor";
    }

}
