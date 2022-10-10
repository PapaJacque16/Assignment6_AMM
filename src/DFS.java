/**
 * @author Aaron McCarley
 * Version 2.0
 * CS215
 * Homework 6.1
 */

public class DFS {       
       Node root;
       public DFS()
       {               
    	   DFS(root);
    	   System.out.println();
       }
       //ADD CODE TO TRAVERSE THE TREE HERE
       //THIS IS APPROXIMATELY THREE LINES OF CODE
      //INCLUDING AN IF STATEMENT TO
      //SEE IF THE NODE IS A LEAF
      //AND TWO RECURSIVE CALLS TO THE CHILDREN
      //MODIFY OTHER CODE AS NECESSARY
        public void DFS(Node node)      {
        	if (node == null){}
        	// recursion on left subtree
        	DFS(node.getlChild());
        	// recursion right subtree
        	DFS(node.getrChild());
        	DFS(node.getHeight());
        	// print the node
            System.out.println(node.getData());
            
        
        }
 }

