class TreeTest {
	public static void main(String[] args) {
		TreeNode t = new TreeNode(4,null,null);
		System.out.println("tree:\n4");
		System.out.println("Size (should be 1) = " + t.count());
		System.out.println("Pre order:");
		t.displayPreOrder();
		System.out.println("\nIn order:");
		t.displayInOrder();
		System.out.println("\nPost order:");
		t.displayPostOrder();
		System.out.println();
		
		t = new TreeNode(1, new TreeNode(5, new TreeNode(8, null, null),
		                                    new TreeNode(10, null, null)),
		                    new TreeNode(2, new TreeNode(0, null, null),
							                new TreeNode(-4, null, null)));
		System.out.println("tree:\n    1\n   / \\\n  5   2\n / \\ / \\\n8 10 0 -4");
		System.out.println("Size (should be 7) = " + t.count());
		System.out.println("Pre order: (1 5 8 10 2 0 -4)");
		t.displayPreOrder();
		System.out.println("\nIn order: (8 5 10 1 0 2 -4)");
		t.displayInOrder();
		System.out.println("\nPost order: (8 10 5 0 -4 2 1)");
		t.displayPostOrder();
		System.out.println();
		
		t = new TreeNode(1, null,
		                    new TreeNode(2, null,
							                new TreeNode(-4, null,
											                 new TreeNode(19, null, null))));
		System.out.println("tree:\n    1\n     \\\n      2\n       \\\n       -4\n         \\\n          19");
		System.out.println("Size (should be 4) = " + t.count());
		System.out.println("Pre order: (1 2 -4 19)");
		t.displayPreOrder();
		System.out.println("\nIn order: (1 2 -4 19)");
		t.displayInOrder();
		System.out.println("\nPost order: (19 -4 2 1)");
		t.displayPostOrder();
		System.out.println();
		
		t = new TreeNode(1, new TreeNode(5, new TreeNode(8, new TreeNode(7, null, null),
		                                                    null),
		                                    null),
		                    null);
		System.out.println("tree:\n      1\n     /\n    5\n   /\n  8\n /\n7");
		System.out.println("Size (should be 4) = " + t.count());
		System.out.println("Pre order: (1 5 8 7)");
		t.displayPreOrder();
		System.out.println("\nIn order: (7 8 5 1)");
		t.displayInOrder();
		System.out.println("\nPost order: (7 8 5 1)");
		t.displayPostOrder();
		System.out.println();
		
	}
}
