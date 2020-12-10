package test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		test3();
	}
	private static void test3() {
		int maxDay = 0;	
		int firstDay = 0;	
		int currentDay = 0;		
		
		System.out.println("������һ�����ڣ���ʽΪ��2020-10-05");	
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();	//�����������ڸ�ʽ���ַ���
 
		try {
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(str);	//���ַ���ת��Ϊָ�������ڸ�ʽ
			
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);	//������ת��Ϊ����
 
			maxDay = calendar.getActualMaximum(Calendar.DATE);	//��ǰ�����е�ǰ�¶�Ӧ���������
 
			currentDay = calendar.get(Calendar.DATE);	//��ǰ�����еĵ�ǰ��
			calendar.set(Calendar.DATE, 1); // ����Ϊ��ǰ�µĵ�һ��
 
			firstDay = calendar.get(Calendar.DAY_OF_WEEK);	//��ǰ�����е�ǰ�µ�һ���Ӧ��������
 
		} catch (ParseException e) {
			e.printStackTrace();
		}
 
		System.out.println("��\tһ\t��\t��\t��\t��\t��\n");
		for (int j = 1; j < firstDay; j++) {
			System.out.print("\t");
		}
 
		for (int i = 1; i <= maxDay; i++) {
			if (i == currentDay) {
				System.out.print("#");
			}
			System.out.print(i + "\t");
			if ((i - (8 - firstDay)) % 7 == 0) {
				System.out.println("\n");
			}
 
		}
	}

		
}
