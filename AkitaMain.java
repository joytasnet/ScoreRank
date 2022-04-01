import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();
		String[] names = new String[n];
		int [] scores = new int[n];
		for(int i =0;i<n;i++){
			System.out.printf("%d人目の名前>>",i+1);
			names[i] = new Scanner(System.in).nextLine();
			System.out.printf("%d人目の点数>>",i+1);
			scores[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("--結果--");
		for(int i =0;i<n;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i],scores[i]);
		}
	}
}
