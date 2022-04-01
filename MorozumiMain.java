import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		//人数を聞く
		System.out.println("人数>");
		int n = new Scanner(System.in).nextInt();
		//int型配列を人数分で初期化する
		int[] numbers = new int[n];
		//名前の配列を初期化する
		String[] names = new String[n];

		//for文を使い、名前と点数を聞き、名前と点数を配列に格納していく。
		for(int i=0; i<n; i++){
			System.out.println("名前>");
			names[i]= new Scanner(System.in).nextLine();
			System.out.println("点数>");
			numbers[i]= new Scanner(System.in).nextInt();
		}
		for(int i=0; i<numbers.length-1; i++){
			for(int j=i+1; j<numbers.length; j++ ){
				if(numbers[i]<numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					String temp2 = names[i];
					names[i] = names[j];
					names[j]= temp2;
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i], numbers[i]);
		}

	}
}
