public class BubbleSort implements SortingAlgorithm
{
	public void sort(int[]a)
	{
		int temp = 0;
		for (int i = 1; i<a.length; i++)
		{
			for (int j = 1; j < (a.length); j++)
			{	
				if (a[j]<a[j-1])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}	
		}

	}
		
}
