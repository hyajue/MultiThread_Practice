package concurrent.base;

//Army Thread
//Simulating how 2 parties participate in war 

public class ArmyRunnable implements Runnable {
	//volatile保证了thread可以正确的读取其他线程写入的值
	//可见性的问题 ref JMM, happens-before原则
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while(keepRunning){
			//5 attacks in a row
			for(int i=0; i<5; i++){
				System.out.println(Thread.currentThread().getName()+"Attack["+i+"]");
				//A hint to the shceduler. 下次该谁进攻还不一定呢
				Thread.yield();				
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"Battle Accomplished!");

	}

}
