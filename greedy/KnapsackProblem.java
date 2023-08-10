// Java program to solve fractional Knapsack Problem

import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;

// Greedy approach
class FractionalKnapSack {
	
	// Function to get maximum value
	private static double getMaxValue(ItemValue[] arr,
									int capacity)
	{
		Arrays.sort(arr, new Comparator<ItemValue>(){
            public int compare(ItemValue item1,ItemValue item2){
                double cpr1= new Double((double)item1.profit/(double)item1.weight);
                double cpr2= new Double((double)item2.profit/(double)item2.weight);
                if(cpr1<cpr2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        Double total =0d;
        for(int i=0;i<arr.length;i++){
            int curwt= (int)arr[i].weight;
            int curval=(int)arr[i].profit;
            if(capacity-curwt>=0){
                capacity=capacity- curwt;
                total+=curval;
            }else{
                double fraction=((double)capacity/(double)curwt);
                total+= curval*fraction;
                capacity=(int)(capacity-(curwt*fraction));
                break;
            }
        }
        return total;
	}

	// Item value class
	static class ItemValue {

		int profit, weight;

		// Item value function
		public ItemValue(int val, int wt)
		{
			this.weight = wt;
			this.profit = val;
		}
	}

	// Driver code
	public static void main(String[] args)
	{

		ItemValue[] arr = { new ItemValue(60, 10),
							new ItemValue(100, 20),
							new ItemValue(120, 30) };

		int capacity = 50;

		double maxValue = getMaxValue(arr, capacity);

		// Function call
		System.out.println(maxValue);
	}
}
