import java.util.*;
public class NaganoMain{
	public static void main(String[] args){
		System.out.print("人数>");
		int num =new Scanner(System.in).nextInt();
		String[] name =new String[num];
		int[] score =new int[num];
		for(int i =0;i<num;i++){
			System.out.print((i+1)+"人目の名前>");
			String names =new Scanner(System.in).next();
			System.out.print((i+1)+"人目の点数>");
			int scores =new Scanner(System.in).nextInt();
			name[i] = names;
			score[i] =scores;
		}
		for(int i =0;i<score.length-1;i++){
			for(int j =i+1;j<score.length;j++){
				if(score[i]<score[j]){
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
					String temp2=name[i];
					name[i]=name[j];
					name[j]=temp2;
				}
			}
		}
		System.out.println("--結果--");
		for(int i =0;i<num;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,name[i],score[i]);
		}

	}
}
