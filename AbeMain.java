import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];
		String[] names = new String[n];

		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の名前>>",i+1);
			String name = new Scanner(System.in).nextLine();
			names[i] = name;
			System.out.printf("%d人目の点数>>",i+1);
			int score = new Scanner(System.in).nextInt();
			scores[i] = score;
		}

		for(int i=0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]<scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
					String keep=names[i];
					names[i]=names[j];
					names[j]=keep;
				}
			}
		}
		System.out.println("--結果--");
		for(int i=0;i<scores.length;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i],scores[i]);
		}
	}
}
