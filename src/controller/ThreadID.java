package controller;

public class ThreadID extends Thread{
	
	public ThreadID(){
		super();
	}
	
	@Override
	public void run() {
		int tid = (int) threadId();
		System.out.println("#"+tid);
	}
	
}
