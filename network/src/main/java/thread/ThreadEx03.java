package thread;

public class ThreadEx03 {

	public static void main(String[] args) {
		Thread thread01 = new DigitThread();
		Thread thread02 = new AlphabetThread();
		
		Thread thread03 = new Thread(new UppercaseAlphabetRunnableImpl());
		
		
		thread02.start();
		thread01.start();
		thread03.start();
	}

}
