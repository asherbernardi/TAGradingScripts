/**
 * TreeDriver.java
 *
 * A test driver for trees.
 *
 * @author CGG & the class
 * Wheaton College, CSCI 235, Fall 2019
 * Lab 11
 * 
 */

public class TreeDriver {

    public static void main(String[] args) {

        TreeNode tree = 
            new TreeNode(1, 
                         new TreeNode(2, 
                                      new TreeNode(4, null, null) ,
                                      new TreeNode(5, null, null)),
                         new TreeNode(3,
                                      null, //new TreeNode(6, null, null),
                                      new TreeNode(7, null, null)));

        System.out.println(tree.count());
	System.out.println("pre");
        tree.displayPreOrder();
	System.out.println("in");
        tree.displayInOrder();
	System.out.println("post");
        tree.displayPostOrder();

    }
}
