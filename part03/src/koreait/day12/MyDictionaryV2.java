package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		List<Word> mywords = new ArrayList<>();	
//		read(mywords,"D:\\iclass05\\���ǿ��ѻ���.txt");			//���Ͽ��� ���� ���� �о���� �� ������ mywords ����Ʈ�� ����
		
		
		String sel, eng, kor;
		int level;
		System.out.println("���� ��� ??   1. �ܾ�����     2. �ܾ�˻�     3. ��ü����   4.������ �˻�  5.���α׷� ������");
		boolean run = true;
		while (run) {		
			System.out.print("���� ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		
				System.out.print("English -> ");
				eng = sc.nextLine();  
				System.out.print("�ѱ� �� -> ");
				kor = sc.nextLine();
				System.out.print("���� -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);		//����
				break;
			case "2":
				System.out.print("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
						System.out.println("�ܾ��� �˻��߽��ϴ�. ��� =>" + w);
				break;
			case "3":
//				System.out.println("�ܾ��� ��ü���� :" + mywords);
				all(mywords);		//�����ϰ� ����ϱ�
				break;
			case "4":
				System.out.print("�˻��� ���� �Է�(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("�߸� �Էµ� �����Դϴ�.1~4 �Է��Դϴ�.");
				break;
			}
		}	//while end
		
		try {
					//mywords ����Ʈ�� ������ ���Ͽ� �����ϱ�
			save(mywords,"D:\\iclass05\\���ǿ��ѻ���.txt");
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �߿� ������ ������ϴ�.-" + e.getMessage());
		}
		
		System.out.println("::::  ���� �ܾ��� �����մϴ�. ::::");
		
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		//���Ͽ� ����ϱ�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}

	private static void read(List<Word> mywords,String filename) {
		
	}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {   //mywords �� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English","Korean","Level"));
		System.out.println("----------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
	}   
	
}




