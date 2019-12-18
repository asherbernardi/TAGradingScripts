/**
 * ListInsertion.java
 * 
 *  This file implements insertion sort on lists
 *
 * @author Thomas VanDrunen
 * Wheaton College, CSCI 235, Fall 2019
 * Lab 10
 * 
 */

public class ListInsertion {

    public static IList sort(IList unsorted) {
        
        IList sorted = IList.newSortList();

        while (!unsorted.isEmpty()) {
            int nextNumber = unsorted.removeFront();
            sorted.insertSorted(nextNumber);
        }

        return sorted;
    }
}
