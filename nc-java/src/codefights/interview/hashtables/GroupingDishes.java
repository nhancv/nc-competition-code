package codefights.interview.hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 * https://codefights.com/interview-practice/task/xrFgR63cw7Nch4vXo/description
 * You have a list of dishes. Each dish is associated with a list of ingredients used to prepare it. You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).
 * <p>
 * Return an array where each element is a list with the first element equal to the name of the ingredient and all of the other elements equal to the names of dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically. The result array should be sorted lexicographically by the names of the ingredients in its elements.
 * <p>
 * Example
 * <p>
 * For
 * dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
 * ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
 * ["Quesadilla", "Chicken", "Cheese", "Sauce"],
 * ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]
 * the output should be
 * groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
 * ["Salad", "Salad", "Sandwich"],
 * ["Sauce", "Pizza", "Quesadilla", "Salad"],
 * ["Tomato", "Pizza", "Salad", "Sandwich"]]
 * For
 * dishes = [["Pasta", "Tomato Sauce", "Onions", "Garlic"],
 * ["Chicken Curry", "Chicken", "Curry Sauce"],
 * ["Fried Rice", "Rice", "Onions", "Nuts"],
 * ["Salad", "Spinach", "Nuts"],
 * ["Sandwich", "Cheese", "Bread"],
 * ["Quesadilla", "Chicken", "Cheese"]]
 * the output should be
 * groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
 * ["Chicken", "Chicken Curry", "Quesadilla"],
 * ["Nuts", "Fried Rice", "Salad"],
 * ["Onions", "Fried Rice", "Pasta"]]
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.array.string dishes
 * <p>
 * An array of dishes. dishes[i] for each valid i contains information about the ith dish: the first element of dishes[i] is the name of the dish and the following elements are the ingredients of that dish. Both the dish name and the ingredient names consist of English letters and spaces. It is guaranteed that all dish names are different. It is also guaranteed that ingredient names for one dish are also pairwise different.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ dishes.length ≤ 500,
 * 2 ≤ dishes[i].length ≤ 10,
 * 1 ≤ dishes[i][j].length ≤ 50.
 * <p>
 * [output] array.array.string
 * <p>
 * The array containing the grouped dishes.
 */
public class GroupingDishes {
    String[][] groupingDishes(String[][] dishes) {
        TreeMap<String, List<String>> map = new TreeMap<>();
        for (int i = 0; i < dishes.length; i++) {
            for (int j = 1; j < dishes[i].length; j++) {
                List<String> l;
                if (!map.containsKey(dishes[i][j])) {
                    l = new ArrayList<>();
                } else {
                    l = map.get(dishes[i][j]);
                }
                l.add(dishes[i][0]);
                map.put(dishes[i][j], l);

            }
        }

        List<List<String>> ll = new Vector<>();
        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            List<String> d = stringListEntry.getValue();
            if (d.size() > 1) {
                Collections.sort(d);
                d.add(0, stringListEntry.getKey());
                ll.add(d);
            }
        }
        String[][] res = new String[ll.size()][];
        for (int j = 0; j < ll.size(); j++) {
            res[j] = new String[ll.get(j).size()];
            for (int k = 0; k < res[j].length; k++) {
                res[j][k] = ll.get(j).get(k);
            }
        }
        return res;
    }

}
