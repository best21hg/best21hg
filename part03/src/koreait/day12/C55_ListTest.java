package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListTest {
//sort �� ���õ� �������̽� ���.
	public static void main(String[] args) {
	//List�� �������̽� , ArrayList�� ����ü
	//������ : List�� ����Ÿ������ �Ͽ� �����մϴ�. ������ ��� ���̺귯������ ListŸ������ ���մϴ�.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);		//�ε���  0
		ilist.add(77);		//		1
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort ���� : " + ilist);
		//����:��������
		ilist.sort(null);    //���ڷ� �ʿ��Ѱ��� ���� Comparator ����ü �ʿ��մϴ�.
							 //�⺻��,String�� null �� �Ҽ� �ֽ��ϴ�.(�������� �⺻)
		System.out.println("sort ���� : " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse:����(��������), 
							//Comparator�������̽���  static�޼ҵ�
		System.out.println("�������� sort : " + ilist);
		
		slist.add("Ʈ���̽�");
		slist.add("�����̰�");
		slist.add("�������");
		slist.add("�����");
		slist.add("�ҳ�ô�");
		slist.add("�극�̺����");
		
		System.out.println("sort ���� : " + slist);
		slist.sort(null);
		System.out.println("sort ���� (ASCEnding): " + slist);
		slist.sort(Comparator.reverseOrder());
		System.out.println("�������� sort(DESCending) : " + slist);
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo",23));
		mlist.add(new Member("nana",27));
		mlist.add(new Member("nayeon",25));
		mlist.add(new Member("dahyeon",29));
		mlist.add(new Member("sooni",26));
		mlist.add(new Member("jenny",27));
		
		System.out.println("member ����Ʈ ���� : " + mlist);
		mlist.sort(null);   //����:Member ��ü�� ���Ҽ� ���� ��ü -> ���� �������̽��� ���ڷ� �ؾ���.
		System.out.println("member sort Ȯ�� : " + mlist);
		
	}

}









