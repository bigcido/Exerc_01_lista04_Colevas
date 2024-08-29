package view;
import controller.ThreadID;
public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			ThreadID Tid = new ThreadID();
			Tid.start();
		}

	}

}
