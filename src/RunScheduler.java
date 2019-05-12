import java.util.ArrayList;
import java.util.Collections;

public class RunScheduler {

	public static void main(String[] args) {
		
		ArrayList<Process> list = new ArrayList<Process> ();
		
		Process process01 = new Process(1, 2, 3, 4);
		Process process02 = new Process(2, 5, 2, 1);
		Process process03 = new Process(3, 8, 16, 3);
		Process process04 = new Process(4, 1, 7, 2);
		Process process05 = new Process(5, 3, 5, 1);
		Process process06 = new Process(6, 2, 3, 4);
		Process process07 = new Process(7, 5, 2, 1);
		Process process08 = new Process(8, 8, 14, 3);
		Process process09 = new Process(9, 1, 7, 2);
		Process process10 = new Process(10, 3, 5, 1);
	
		list.add(process01);
		list.add(process02);
		list.add(process03);
		list.add(process04);
		list.add(process05);
		list.add(process06);
		list.add(process07);
		list.add(process08);
		list.add(process09);
		list.add(process10);
		
		//prints hardcoded arraylist of processes
		System.out.println("Original list of processes to be scheduled: \n");
		System.out.println(list);
		System.out.println("------------------------------------------------------------------------------------");
		
		//FCFS algorithm
		System.out.println("\nFirst come first serve scheduling algorithm: \n ");
		Collections.sort(list, new ProcessArrivalTimeComparator());
		System.out.println(list);
		Scheduler.findWaitTime(list);
		Scheduler.findTurnAroundTime(list);
		Scheduler.AverageWaitTime();
		Scheduler.AverageTurnaroundTime();
		System.out.println("------------------------------------------------------------------------------------");
		
		
		//SJF-shortest Job First algorithm 
		System.out.println(" \nShort Job First scheduling algorithm: \n");
		Collections.sort(list, new ProcessBurstTimeComparator());
		System.out.println(list);
		Scheduler.findWaitTime(list);
		Scheduler.findTurnAroundTime(list);
		Scheduler.AverageWaitTime();
		Scheduler.AverageTurnaroundTime();
	}

	

}
