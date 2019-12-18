public class ConstantNode implements ExprNode {
	int number;
	public ConstantNode(String n) {
		number = Integer.parseInt(n);
	}
	public int evaluate() {
		return number;
	}
}
