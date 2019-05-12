import java.util.Collections;
import java.util.Comparator;

public class ProcessBurstTimeComparator implements Comparator <Process>{
	
	public int compare(Process p1, Process p2) {
		if(p1.getBurstTime()==p2.getBurstTime())	
			return 0;
		else if(p1.getBurstTime()>p2.getBurstTime())
			return 1;
		else
			return -1;
	}
	
	
	
}
