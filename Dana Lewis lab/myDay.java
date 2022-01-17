import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class myDay {
	
	private insulin[] a;
	private int size;

	public myDay() {
		this.a = new insulin[10];
		size = 0;
	}
	
	public insulin[] doubleArr(insulin[] a) {
		insulin[] b = new insulin[a.length*2];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	
	public void addData(insulin d) {
		if(size >= a.length) {
			a = doubleArr(a);
		}
		a[size] = d;
		size++;
	}
	
	public int getAverageInsulin() {
		int sum = 0;
		for(int i = 0; i< size; i++) {
			sum+= a[i].getInsulin();
		}
		return sum/size;
	}
	
	public int getAverageBPM() {
		int sum = 0;
		for(int i = 0; i< size; i++) {
			sum+= a[i].getHrate();
		}
		return sum/size;
	}
	
	public static myDay readFile(String filename) {
		myDay a = new myDay();
		try {
			Scanner in = new Scanner(new File(filename));
			while(in.hasNext()) {
				String s = in.nextLine();
				
				String time = in.next();
				s = in.next(); //comma, but through away
				int bpm = in.nextInt();
				s = in.next(); //comma, but through away
				int level = in.nextInt();
				
				insulin d = new insulin(time, level, bpm);
				a.addData(d);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public static void main(String[] args) {
		//average for insulin level
		System.out.println("the average Insulin level: ");
		myDay d = readFile("0100Points.txt");
		System.out.println(d.getAverageInsulin());
		
		d = readFile("1000Points.txt");
		System.out.println(d.getAverageInsulin());
		
		d = readFile("Unknown_Points.txt");
		System.out.println(d.getAverageInsulin());
		
		//average for bpm
		System.out.println("the average BPM: ");
		myDay b = readFile("0100Points.txt");
		System.out.println(b.getAverageBPM());
		
		b = readFile("1000Points.txt");
		System.out.println(b.getAverageBPM());
		
		b = readFile("Unknown_Points.txt");
		System.out.println(b.getAverageBPM());
	}
	
}
