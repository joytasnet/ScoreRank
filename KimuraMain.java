import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();

		String[] names= new String[n];
		int[] scores= new int[n];
		for(int i=0;i<n;i++){
			System.out.printf("%d人目の名前>>",i+1);
			String name = new Scanner(System.in).next();
			names[i] = name;
			System.out.printf("%d人目の点数>>",i+1);
			int score = new Scanner(System.in).nextInt();
			scores[i] = score;
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(scores[i]<scores[j]){
					int temp_s = scores[j];
					scores[j] = scores[i];
					scores[i] = temp_s;
					String temp_n = names[j];
					names[j] = names[i];
					names[i] = temp_n;
				}
			}
		}
		System.out.println("--結果--");
		for(int i=0;i<n;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i],scores[i]);
		}
	}
}
