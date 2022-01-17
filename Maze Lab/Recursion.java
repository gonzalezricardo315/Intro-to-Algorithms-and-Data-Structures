import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author
 * @version
 *
 */

public class Recursion {
	
	public static void main(String[] args){
		
		
		solveMaze("Maze1-easy.txt");
		solveMaze("Maze2-manyChoices.txt");
		solveMaze("Maze3-Large.txt");
		solveMaze("Maze4-No_Solution.txt");
		solveMaze("Maze5-Larger.txt");
	}
	
	//Probably not void, or 0 arguments
	public static String[][] readMazeFromFile(String filename) {
		try {
			Scanner in = new Scanner(new File(filename));
			int rows = in.nextInt();
			int cols = in.nextInt();
			
			String[][] maze = new String[rows][cols];
			for(int i =0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					maze[i][j] = in.next();
				}	
			}
			return maze;
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			return null;
		}
	}

	//Probably not 0 arguments
	public static void printMaze(String[][] m) {
		int rows=m.length;
		int cols=m[0].length;
		
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	
	//This method is what the book calls the "driver" method
	public static void solveMaze(String filename){
		//setup all the variables correctly
		System.out.println("Working on maze " + filename);
		
		
		String[][] maze = readMazeFromFile(filename);
		printMaze(maze);
		int[] array = start(maze);
		System.out.println("The starting location is: " + array[0] +", " + array[1]);
		//trying to find start position by going through the loop
		
		
		
		//For sure pass the x and y for the "S" location, and whatever data structure you are using to represent the maze
		//System.out.println(j);
		mazeTraversal(maze, array[0], array[1]);
		
		
		System.out.println("\n\n");
	}
	
	public static int[] start(String[][] maze) {
		int[] arr = new int[2];
		int rows=maze.length;
		int cols=maze[0].length;
		int i;
		int j = 0;
		for(i =0; i < rows; i++) {
			for(j = 0; j < cols; j++) {
				if(maze[i][j].equals("S")) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}

	/**
	 * You get to set the parameters to this method
	 * Think about what you need.
	 * A few suggestions:
	 * How does the method represent the maze
	 * How does the method know which square to look at?
	 * 
	 * Also - this is not just a single base case and a single recursive case.
	 * If the maze is solved by going left - there is a solution
	 * If the maze is solved by going right - there is a solution
	 * If the maze is solved by going up - there is  a solution
	 * If the maze is solved by going down - there is  a solution
	 * 
	 * Also, depending on how you go up, down, left, and right
	 * there might be several base cases, like, on a wall,
	 * on the start, on the end, on a trail already marked...
	 */

	public static boolean mazeTraversal(String[][] maze, int x, int y){
		if (x<0 || y<0 || x >= maze.length || y >= maze[0].length){
			return false;
		}
		if(maze[x][y].equals("#")) {
			return false;
		}
		if(maze[x][y].equals("?")) {
			return false;
		}
//		if(maze[x][y].equals("X")) {
//			return false;
//		}
		if(maze[x][y].equals("E")){
			printMaze(maze);
			return true;
		}
		if(maze[x][y].equals("S")) {
			maze[x][y] = "?";
		}
		if(maze[x][y].equals(".")) {
			maze[x][y] = "?";
		}

		//goes right 
		boolean foundTheEnd = mazeTraversal(maze, x+1, y);
		//goes up 
		foundTheEnd = mazeTraversal(maze, x, y+1);
		//goes down
		foundTheEnd = mazeTraversal(maze, x, y-1);
		//goes left
		foundTheEnd = mazeTraversal(maze, x-1, y);
		
		if (foundTheEnd ==true) {
			return true;
		}
//		else {
//			maze[x][y] = "X";
//		}
		//will need an "X" which means that every option doesn't work and they have given up (like a dead end)
//		if(false) {
//			
//			return false;
//		}
		//Note, you should not need any loops.  Your first instinct might be to add them, but ignore that instinct
		//Loops are for iteration, not recursion
		return false;
	}


}