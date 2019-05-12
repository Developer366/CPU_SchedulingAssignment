import java.util.Collections;
import java.util.Comparator;


public class ProcessArrivalTimeComparator implements Comparator <Process> {
	
	public int compare(Process p1, Process p2) {
		if(p1.getArrivalTime()==p2.getArrivalTime())	
			return 0;
		else if(p1.getArrivalTime()>p2.getArrivalTime())
			return 1;
		else
			return -1;
	}
	

}
