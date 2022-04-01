import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.print("何人?>>");
		int number = new Scanner(System.in).nextInt();
		String[] n= new String[number];
		int[] scores=new int[number];

		for(int i=0; i<number;i++){
			System.out.print(i+1+"人目の名前>>");
			n[i] = new Scanner(System.in).nextLine();
			System.out.print(i+1+"人の点数>>");
			scores[i] = new Scanner(System.in).nextInt();
		}
		for(int i=0; i<scores.length-1;i++){
			for(int j=i+1; j<scores.length;j++){
				if(scores[i]<scores[j]){
					int tmp=scores[i];
					String tmps=n[i];
					scores[i]=scores[j];
					n[i]=n[j];
					scores[j]=tmp;
					n[j]=tmps;
				}

			}
		}
		System.out.println("--結果--");
		for(int i=0; i<number;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,n[i],scores[i]);
		}
	}
}

