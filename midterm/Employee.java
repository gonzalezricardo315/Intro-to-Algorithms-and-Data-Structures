import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int [] lapsPerDay;
	
	public Employee(String name, int[] lapsPerDay) {
		super();
		this.name = name;
		this.lapsPerDay = lapsPerDay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int[] getLapsPerDayArray() {
		return lapsPerDay;
	}
	public void setLapsPerDayArray(int[] lapsPerDay) {
		this.lapsPerDay = lapsPerDay;
	}
	
	@Override
	public String toString() {
		return name + " " + getNumberOfLaps(lapsPerDay);
	}

	//No need to change things above this line
	

	

	public static Employee readFile(String filename) {
		int [] temp = null;
		Employee a = new Employee(null, temp);
		try {
			Scanner in = new Scanner(new File(filename));
			while(in.hasNext()) {
				String name = in.next();
				int numLap = in.nextInt();
				int size = 90;
				int [] arr = new int[90];
				
				//arr[] = numLap;
				
				System.out.println(name);
				a = new Employee(name, arr);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return a;
	}
	
	public int getNumberOfLaps(int [] lapsPerDay) {
		int sum = 0;
		for (int i = 0; i < lapsPerDay.length; i++) {
			sum += lapsPerDay[i];
		}
		return sum;
	}

	@Override
	public int compareTo(Employee e) {
	//	if(Empolyye )
		return 0;
	}
	
	public static void main(String[] args) {
		Employee d = readFile("UnluckyJoe.txt");
		
		System.out.println("Big O time is linear even if it was twice as long");
		
	}

	
}