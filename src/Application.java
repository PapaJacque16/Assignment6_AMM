/**
 * @author Aaron McCarley
 * Version 2.0
 * CS215
 * Homework 6.1
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DFS aSearch=new DFS();
		aSearch.DFS(root);
		

	}

}