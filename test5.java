package test;

public class test5 {

	public static void main(String[] args) {
		//1、生成1000个100以内的整数

				int a[]=new int[1000];

				for(int i=0 ; i<a.length ; ++i)

				{

					a[i]=(int)(Math.random()*100);

				}

				//2、用数组统计出现的次数

				int b[]=new int[100];

				//吧数组初始化为0

				for(int i=0 ; i<b.length ; ++i)

				{

					b[i]=0;

				}

				//统计

				for(int i=0 ; i<a.length ; ++i)

				{

					b[a[i]]++;

				}

				//输出

				for(int i=0 ; i<b.length ; ++i)

				{

					System.out.println(i+"出现了:"+b[i]+" 次");

				}
	}

}
