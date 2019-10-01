package stringpractice;

public class find_maximume_lenghth_name {
public static void main(String[] args) {
	String[] a={"defg","hijkwdadsadlm","nopqrst"};
	String t=a[0];
	//System.out.println(t);
	for(int i=0;i<a.length;i++){
		if (a[i].length()>t.length()) {//2>2 4>2 5>2 6>2
			t=a[i];
		}
		
		
	}System.out.println(t);
	
	
}
}
