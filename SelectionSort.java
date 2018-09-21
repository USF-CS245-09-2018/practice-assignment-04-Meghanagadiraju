
public class SelectionSort implements SortingAlgorithm
{
	public void sort (int [] a)
	{
		//find the lowest value and move to the next available element in new arr 
		int min;
		for (int i = 0; i <= a.length; i++)
		{
			min = i;
			for (int j = i+1; j<a.length; j++)
			{
				if (a[j]<a[min])
				{
					min = j;
				}
			}

			if (min != i)
			{
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}

	}
}