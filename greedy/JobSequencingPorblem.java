// Java code for the above approach

import java.util.*;

class Job {

	// Each job has a unique-id,profit and deadline
	char id;
	int deadline, profit;

	// Constructors
	public Job() {}

	public Job(char id, int deadline, int profit)
	{
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

	// Function to schedule the jobs take 2 arguments
	// arraylist and no of jobs to schedule
	void printJobScheduling(ArrayList<Job> arr, int t)
	{
		int n=arr.size();
        char[] job= new char[t];
        boolean[] f= new boolean[n];
        Collections.sort(arr,(a,b)->b.profit-a.profit);
        for(int i=0;i<n;i++){
            for(int j=Math.min(n, arr.get(i).deadline-1);j>=0;j--){
                if(f[j]==false){
                    f[j]=true;
                    job[j]= arr.get(i).id;
                    break;
                }
            }
        }
        for(int i=0;i<job.length;i++){
            System.out.println(job[i]);
        }
	}

	// Driver's code
	public static void main(String args[])
	{
		ArrayList<Job> arr = new ArrayList<Job>();
		arr.add(new Job('a', 2, 100));
		arr.add(new Job('b', 1, 19));
		arr.add(new Job('c', 2, 27));
		arr.add(new Job('d', 1, 25));
		arr.add(new Job('e', 3, 15));

		System.out.println(
			"Following is maximum profit sequence of jobs");

		Job job = new Job();

		// Function call
		job.printJobScheduling(arr, 3);
	}
}

// This code is contributed by Aditya Kumar (adityakumar129)
