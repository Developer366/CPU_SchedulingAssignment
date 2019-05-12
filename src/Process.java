
public class Process implements Comparable<Process>{
	private int pid;
	private int burstTime;
	private int arrivalTime;
	private int priority;
	private int waitTime;
	
	public Process(int pid, int burstTime, int arrivalTime, int priority) {
		this.pid = pid;
		this.burstTime = burstTime;
		this.arrivalTime = arrivalTime;
		this.priority = priority;
		this.waitTime = 0;
	}
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @return the burstTime
	 */
	public int getBurstTime() {
		return burstTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public int getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the waitTime
	 */
	public int getWaitTime() {
		return waitTime;
	}
	
	public void waiting(){
		waitTime++;
	}
		
	public String toString(){
		String str= " pid : " + pid + "\t burstTime :" + burstTime + "\t arrivalTime :" + arrivalTime + " \t priority :" + priority + "\n";  
		return str;
		
	}


	public int compareTo(Process o) {
		int CompareArrivalTime = o.getArrivalTime();
		//ascending order
		return this.arrivalTime - CompareArrivalTime;				
	}

	

}