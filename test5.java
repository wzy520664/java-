package test;

public class test5 {

	public static void main(String[] args) {
		//1������1000��100���ڵ�����

				int a[]=new int[1000];

				for(int i=0 ; i<a.length ; ++i)

				{

					a[i]=(int)(Math.random()*100);

				}

				//2��������ͳ�Ƴ��ֵĴ���

				int b[]=new int[100];

				//�������ʼ��Ϊ0

				for(int i=0 ; i<b.length ; ++i)

				{

					b[i]=0;

				}

				//ͳ��

				for(int i=0 ; i<a.length ; ++i)

				{

					b[a[i]]++;

				}

				//���

				for(int i=0 ; i<b.length ; ++i)

				{

					System.out.println(i+"������:"+b[i]+" ��");

				}
	}

}
