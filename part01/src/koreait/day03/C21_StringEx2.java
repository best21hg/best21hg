package koreait.day04;

import java.util.Scanner;


public class C21_StringEx2 {
//�ۼ��� ��ȭ��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		String domain = "gmail.com";
		String account;
		
		System.out.print("����� �̸����� �Է��ϼ���: ");
		email = sc.nextLine(); //Ű���� �Է��� ���ڿ��� ó��
		
		if(!(email.indexOf("@") == email.lastIndexOf("@")) || (email.indexOf("@") == -1)) {//@�� �� �� ���ԵǾ��ִ��� Ȯ��
			System.out.println("�޽���: �̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		else {
			if(!(domain.equals(email.substring(email.indexOf("@") + 1)))) {//@�ڰ� gmail.com���� Ȯ��
				System.out.println("�޽���: ������ �̸��� Ʋ���ϴ�.");
				isValid = false;
			}
			else {
				account = email.substring(0,email.indexOf("@")); //�����̸� ����
				System.out.println(account);
				if(account.length() < 6) { //�����̸� ���̴� 6�̻�
					System.out.println("�����̸��� 6���� �̻��̾�� �մϴ�.");
					isValid = false;
				}
				else if(account.indexOf("$") != -1) {
					System.out.println("Ư������ $�� ���Ұ����մϴ�.");
					isValid = false;
				}
				else if(account.indexOf("%") != -1) {
					System.out.println("Ư������ %�� ���Ұ����մϴ�.");
					isValid = false;
				}
			}
		}
		if(isValid == false) {
			System.out.println("��ȿ���� ���� �����Դϴ�.");
		}
		else {
			System.out.println("��ȿ�� �����Դϴ�.");
			System.out.println("�̸���: " + email);
		}
	}

}
/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
 *  
 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ��(length()-1)���� substring ������ ���ڿ��� equals ��
 *  
 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
 *  
 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
 *  		�� 3���� ���ڿ��� length() �� 6���� ��
 *  
 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
 */


