package string_array;

public class find_missingno_in_array {
public static void main(String[] args) {
	

	int[] a=new int[]{1,2,3,4,6};
	
	int total_no=6;
	
	int expec_no=total_no * ((total_no+1)/2);
	
	System.out.println(expec_no);
	int num_sum=0;
	
	for(int i:a){
		num_sum+=i;//1 1+2=3, 
		//
	}System.out.println(num_sum);
	System.out.println(expec_no-num_sum);
	
}
	
}
