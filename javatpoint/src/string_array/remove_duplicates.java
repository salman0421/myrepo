package string_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class remove_duplicates {
	
	public static void remdup(int[] a)
	{
		Set<Integer> set=new HashSet(Arrays.asList(a));
		
		/*for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}*/
		System.out.println("1:"+set);
	}
	
	public static void ls(Integer[] a)
	{
		Set<Integer> set=new TreeSet(Arrays.asList(a));
		System.out.println(set);
		
		List<Integer> ls=new ArrayList(set);
		int largest=ls.get(ls.size()-1);
		int small=ls.get(0);
		System.out.println("Largest : "+largest+"  Smallest : "+small);
//		for(int i=0;i<a.length;i++)
//		{
//			
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,2,3,6,4,5};
		remdup(arr);
		int[] arr1=new int[arr.length];
		//ls(arr);
Arrays.sort(arr);
int j=0;
for(int i=0;i<arr.length-1;i++){
	
	if(arr[i]!=arr[i+1])
	{
		arr1[j]=arr[i];
		j++;
	}
		
		
	}
arr1[j++]=arr[arr.length-1];
//int[] arr1=Arrays.copyOf(arr, j);

System.out.println(Arrays.toString(arr1));
}

	



	

}
