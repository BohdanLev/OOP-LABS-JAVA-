package demo;

import java.util.Scanner;

public class Point 
{
  public static void main(String[] args) 
  {
	  int debug = 0;
	  
	  if(args[0].equals("-d") || (args.length>1 && args[1].equals("-d")))
	  {
		  debug = 1;
		  System.out.println("³���� � ����� 'debug' ");
	  }
	  
	  if (args[0].equals("-h") || (args.length>1 && args[1].equals("-h")))
	  System.out.println("�����,��� ��� ����\n"
			        + "�������: ����� ǳ����, ��-108 \n\n"
			        + "����:\n"
			        + "������ �����.����� ������� �� ������� \n"
			        + "� ������ ������� ��������\n"
			        + "���� ����� �� ������� ����� �������,������� �����\n"
			        + "ϳ��� ������� ����� ������� ��������� �����\n"
			        + "ϳ��� ���� ������� ������� ��������� ������ � �����.� ���� ��������� ������ �������� ������\n\n"
			        + "������� ����:\n"
			        + "��� ������ ����������� ������ ������ \"l\" \n"
			        + "��� ������ ��� ������ \"w\" \n"
			        + "��� ����� ������ ������ \"n\"");
	  System.out.println("\n\n������ ����� ��� ������������:"); 
	  
	  
	  Scanner in = new Scanner(System.in);
	  String joke = in.nextLine();
	  StrEditor.settings(joke);
	  System.out.print("�������� �������: ");
	  String k = in.nextLine();
	  
	  
	  for(;;System.out.print("�������� �������: "),k = in.nextLine())
	  {
		  switch(k.charAt(0))
		  {
			  case 'n': 
			  { 
				  System.out.println("����� �����: "); 
				  joke = in.nextLine(); 
				  StrEditor.settings(joke); 
				  break;
			  }  
			  case 'l':
			  {
				  StrEditor.tut();
				  break;
			  }
			  case 'w': 
			  {
				  StrEditor.WordChecker(debug);
				  break;
			  }
			  default: 
			  {
				  System.out.println("�����!"); 
				  return;
			  }
		  }
	  }
  }
  
}