package slackHomeWork;

public class Task2 {

	public static void main(String[] args) {
		String s = "����� ����� ������������ ������� ������ �� �������� ������. ��� ������� ���������, ����������� �������, �������.";
		int sentences = 0;
		int words = 0;
		int words1 = 0;
		int words2 = 0;
		int chars = 0;
		int dlina = s.length();

		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) {
			if (st[i].length() > 2) {
				words++;
			}
		}

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				chars++;
			}
			if (ch[i] == '.') {
				sentences++;
			}
		}

	
		for (String str:s.split(" ")) {
			System.out.println(str);
		}

		System.out.println("����� ������: " + dlina + " ��������, " + chars + " ��� ����� ��������.");
		System.out.println("���������� ����: " + words);
		System.out.println("���������� �����������: " + sentences);
	}

}
