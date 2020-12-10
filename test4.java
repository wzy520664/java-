package test;
import java.util.Arrays;
public class test4 {

	public static void main(String[] args) {
		int i;
		int a[]=new int [100];
		for(i=0;i<100;i++)
		{
			a[i]=(int) (Math.random()*200);
		}
		Arrays.sort(a);
		for(i=0;i<100;i++)
		{
			System.out.println(a[i]);
		}

	}

}
