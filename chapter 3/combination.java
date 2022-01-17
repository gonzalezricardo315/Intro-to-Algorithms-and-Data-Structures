import java.util.Scanner;

class combination {
	private int x = 3;
	private int y = 8;
	private int a = 1;
	
	boolean lockopened = false;
	
	
	public boolean isLockopened() {
		return lockopened;
	}

	public void setLockopened(boolean lockopened) {
		this.lockopened = lockopened;
	}

	public combination(int x, int y, int a) {
		this.x = x;
		this.y = y;
		this.a = a;
	}
	
	public void Opened(int x, int y, int a) {
		if(x == 3 && y == 8 && a == 1) {
			System.out.println("correct! you opend the lock.");
			lockopened = true;
		}
		else {
			System.out.println("wrong combination");
		}
	}
	
	public void changeCombo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the new 3 combination you would like? ");
		x = sc.nextInt();
		y = sc.nextInt();
		a = sc.nextInt(); 
		System.out.println("new code is: " + x + " " + y + " " + a);
	}
}
