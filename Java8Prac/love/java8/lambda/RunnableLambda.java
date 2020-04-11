package love.java8.lambda;

public class RunnableLambda {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++)
				{
					System.out.println("Hello World from thread ["+Thread.currentThread().getName()+"]");
				}
			}
		};
		
		Runnable runnable2=() -> {
			for(int i=0;i<3;i++)
			{
				System.out.println("Hello World from thread ["+Thread.currentThread().getName()+"]");
			}
			
		};
		
		//Thread t=new Thread(runnable);
		Thread t=new Thread(runnable2);
		t.start();
		t.join();
	}

}
