import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Scheduler {
	
	//instance variables & global instances
	static int [] tat = new int[10];
	static int totalBurstTime=0;
	static int bursttime=0;
	static int [] wt = new int[10];
	

	public static void FCFS (ArrayList <Process> list){			
		//sorting using arrival time comparator						
		Collections.sort(list, new ProcessArrivalTimeComparator());

	}
	
	public static void SJF (ArrayList <Process> list){	
		//sorting using arrival time comparator						
		Collections.sort(list, new ProcessBurstTimeComparator());

	}
//--------------------------------------------------------------------------------------------------------------------		
	public static void findTurnAroundTime(ArrayList <Process> list){
		System.out.println("\n");
		int totalBurstTime=0;
		int bursttime=0;
		
		for(int i=0; i<list.size();i++){
			
			bursttime= list.get(i).getBurstTime();
			totalBurstTime+=bursttime;
			tat[i]=totalBurstTime;
			System.out.println("The Turn Around time for Process " + (i+1) + ": " + tat[i]);
		}
	}//end of find turn around time
	
	public static void findWaitTime(ArrayList <Process> list){
		System.out.println("\n");
		int totalBurstTime=0;
		int bursttime=0;
		wt[0] = 0;
		System.out.println("The wait time for Process 1: " + wt[0]);		
		int j=2;
		
		
		for(int i=1; i<list.size();i++){
			
			bursttime= list.get(i-1).getBurstTime();
			totalBurstTime+=bursttime;
			wt[i]=totalBurstTime;
			
			System.out.println("The wait time for Process " + j + ": " + wt[i]  );
			j++;			
			}				
	}//end of find wait time
//----------------------------------------------------------------------------------------------------------------------	
	public static void AverageWaitTime (){
		double total=0;
		double average=0;
		for (int i=0; i<wt.length; i++){
			total+=wt[i];
			average=total/wt.length;
			
		}
		System.out.println("\nThe average wait time is: " + average);
		
	}
	public static void AverageTurnaroundTime (){
		double total=0;
		double average=0;
		for (int i=0; i<tat.length; i++){
			total+=tat[i];
			average=total/tat.length;
			
		}
		System.out.println("\nThe average wait time is: " + average);
		
	}
	
}


