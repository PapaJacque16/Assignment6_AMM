/**
 * @author Aaron McCarley
 * Version 2.0
 * CS215
 * Homework 6.1
 */
public class Node {
	public static Node height;
	private int data;
	Node lChild;
	Node rChild;
	
	public Node(int data)
	{
		this.data=data;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	
	}
	public void setHeight(Node node) {
		
	}
	public Node getHeight() {
		return null;
	}
	

}