import java.io.File;
import java.io.FileFilter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Abet {
	/*
	 * 18.9 a
	 * the Big Oh time is O(n) linear
	 */
	public static int numOfLeafs(BinaryNode<Integer> b) {
		if(b == null) {
			return 0;
		}
		if(b.getLeft() == null && b.getRight() == null) {
			return 1;
		}
		else {
			return numOfLeafs(b.getLeft()) + numOfLeafs(b.getRight());
		}
	}
	
	/*
	 * 18.9 b
	 * the Big Oh time is O(n) linear
	 */
	public static int numOfOneNonNull(BinaryNode<Integer> b) {
		if(b == null) {
			return 0;
		}
		if(b.getLeft() == null && b.getRight() != null) {
			return 1 + numOfOneNonNull(b.getRight());
		}
		if(b.getLeft() != null && b.getRight() == null) {
			return 1 + numOfOneNonNull(b.getLeft());
		}
		else {
			return numOfOneNonNull(b.getLeft()) + numOfOneNonNull(b.getRight());
		}
	}
	
	/*
	 * 18.9 c
	 * the Big Oh time is O(n) linear
	 */
	public static int numOfTwoNonNull(BinaryNode<Integer> b) {
		if(b == null) {
			return 0;
		}
		if(b.getLeft() != null && b.getRight() != null) {
			return 1;
		}
		else {
			return numOfTwoNonNull(b.getLeft()) + numOfTwoNonNull(b.getRight());
		}
	}
	
	/*
	 * 18.10a
	 * the Big Oh time is O(n) linear
	 */
	public static int numOfEvens(BinaryNode<Integer> b) {
		int total = 0;
		if(b == null) {
			return 0;
		}
		if((b.getElement()%2) == 0) {
			total = 1;
		}
		return total + numOfEvens(b.getLeft()) + numOfEvens(b.getRight());
	}
	
	/*
	 * 18.10b
	 * the Big Oh time is O(n) linear
	 */
	public static int totalOfTree(BinaryNode<Integer> b) {
		if(b == null) {
			return 0;
		}
		return b.getElement() + totalOfTree(b.getLeft()) + totalOfTree(b.getRight());
	}
	
	/*
	 * 18.14
	 * the Big Oh time is O(n) linear
	 */
	public static void fileRead(File[] p) {
		for(File temp: p) {
			if(temp.isDirectory()) {
				System.out.println("directory: " + temp.getName());
				if(temp.listFiles() != null) {
					fileRead(temp.listFiles());
				}
			}
			else if(p != null){
				long size = temp.length();
				if(size > 40000) {
					System.out.println("file: " + temp.getName());
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> b1 = new BinaryTree<Integer>();
		BinaryTree<Integer> b2 = new BinaryTree<Integer>( 3 );
		BinaryTree<Integer> b3 = new BinaryTree<Integer>( 6 );
		b1.merge(4, b2, b3);
		System.out.println("tree 1");
		b1.printPreOrder();
		System.out.println("\n");
		
		BinaryTree<Integer> b4 = new BinaryTree<Integer>();
		BinaryTree<Integer> b5 = new BinaryTree<Integer>( 3 );
		BinaryTree<Integer> b6 = new BinaryTree<Integer>( 7 );
		BinaryTree<Integer> b7 = new BinaryTree<Integer>( 9 );
		BinaryTree<Integer> b8 = new BinaryTree<Integer>();
		b6.merge(7, b8, b7);
		b4.merge(5, b5, b6);
		System.out.println("tree 2");
		b4.printPreOrder();
		
		System.out.println("\n" + "number of leafs tree 1");
		System.out.println(numOfLeafs(b1.getRoot()));
		System.out.println("\n" + "number of leafs tree 2");
		System.out.println(numOfLeafs(b4.getRoot()));
		
		System.out.println("\n" + "number of one non null tree 1");
		System.out.println(numOfOneNonNull(b1.getRoot()));
		System.out.println("\n" + "number of one non null tree 2");
		System.out.println(numOfOneNonNull(b4.getRoot()));

		System.out.println("\n" + "number of 2 nun nulls tree 1");
		System.out.println(numOfTwoNonNull(b1.getRoot()));
		System.out.println("\n" + "number of 2 nun nulls tree 2");
		System.out.println(numOfTwoNonNull(b4.getRoot()));
		
		System.out.println("\n" + "number of evens in tree 1");
		System.out.println(numOfEvens(b1.getRoot()));
		System.out.println("\n" + "number of evens in tree 2");
		System.out.println(numOfEvens(b4.getRoot()));
		
		System.out.println("\n" + "total of tree 1");
		System.out.println(totalOfTree(b1.getRoot()));
		System.out.println("\n" + "total of tree 2");
		System.out.println(totalOfTree(b4.getRoot()));
		
		System.out.println("\n" + "find all the files in my C drive");
		File path = new File("C:\\");
		File[] arrFile = path.listFiles();
		fileRead(arrFile);
	  }
	}
