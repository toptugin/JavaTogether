package slackHomeWork;

public class Task1 {

	public static void main(String[] args) {
		int [] num = new int[10];
		for(int i = 0;i<num.length;i++){
			num[i]=0;
			System.out.print(num[i]+",");
		}
		System.out.println("");
		
		
		String [] w = new String[10];
		for(int i = 0;i<w.length;i++){
			w[i]="a";
			System.out.print(w[i]+",");
		}
		System.out.println("");
		
		
		int [] num1 = new int[10];
		for(int i = 0;i<num1.length;i++){
			num1[i] = (int)(Math.random()*100);
		System.out.print(num1[i]+",");
		}

	}

}
