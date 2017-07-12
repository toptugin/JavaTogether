package slackHomeWork;

public class Task2 {

	public static void main(String[] args) {
		String s = "Слово казак заимствовано русским языком из тюркских языков. Оно значило свободный, независимый человек, бродяга.";
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

		String[] w = s.split(".");
		for (int i = 0; i < w.length; i++) {
			System.out.println(w[i]);
		}

		System.out.println("Длина текста: " + dlina + " символов, " + chars + " без учета пробелов.");
		System.out.println("Количество слов: " + words);
		System.out.println("Количество предложений: " + sentences);
	}

}
