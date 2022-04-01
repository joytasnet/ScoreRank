import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		//人数を聞いて、名前と点数を入れるための配列を作る
		System.out.print("何人のスコアを比べますか？>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];
		String[] names = new String[n];
		
		//名前と点数を順番に入力してもらうfor
		for(int i=0 ; i<n ; i++){
			System.out.printf("%d人目の名前を入力>>",i+1);
			String name = new Scanner(System.in).next();
			names[i] = name;
			System.out.printf("%d人目の点数を入力>>",i+1);
			int score = new Scanner(System.in).nextInt();
			scores[i] = score;
		}
		//名前と点数を同時に入れ替え
		for(int i=0 ; i<scores.length-1 ; i++){
			for(int j=i+1 ; j<scores.length ; j++){
				if(scores[i]<scores[j]){
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					String keep = names[i];
					names[i] = names[j];
					names[j] = keep;
				}
			}
		}
		//結果表示names:(scores)
		System.out.println("--　結果　--");
		for(int i=0; i<n ;i++){
			System.out.printf("(%d):%s (%d)%n",i+1,names[i],scores[i]);
		}
	}
}
