import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();
		String[] names = new String[n];
		int[] scores = new int[n];
		for(int i=0;i<n;i++){
			System.out.print(i+1+"人目の名前>>");
			names[i] = new Scanner(System.in).nextLine();
			System.out.print(i+1+"人目の点数>>");
			scores[i] = new Scanner(System.in).nextInt();
		}
		for(int i=0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]<scores[j]){
					int tempS=scores[i];
					scores[i]=scores[j];
					scores[j]=tempS;
					String tempN=names[i];
					names[i]=names[j];
					names[j]=tempN;
				}
			}
		}
		System.out.println("--結果--");
		for(int i=0;i<n;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i],scores[i]);
		}
	}
}
