package p10_4;

public class TreeRunner {

	public static void main(String[] args) {
		
		BSTree tree = new BSTree();
		
		tree.add("+");
		
		tree.add("/");
		tree.add("+");
		tree.add("8");
		tree.add("+");
		tree.add("4");
		tree.add("2");
		tree.add("1");
		tree.add("2");
		System.out.println(tree);
	}

}
//     +
//   /   + 
// 8 +   1 2
//  4 2
   