import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int number = new Scanner(System.in).nextInt();
		int[] points = new int[number];
		String[] names = new String[number];

		for(int i=0;i<number;i++){
			System.out.printf("%d人目の名前>>",i+1);
			names[i] = new Scanner(System.in).nextLine();
			System.out.printf("%d人目の点数>>",i+1);
			points[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("--結果--");
		for(int i=0;i<number-1;i++){
			for(int j=i+1;j<number;j++){
				if(points[i] < points[j]){
					int temp = points[i];
					points[i] = points[j];
					points[j] = temp;
					String tempname = names[i];
					names[i] = names[j];
					names[j] = tempname;
				}
			}
		}
		for(int i=0;i<number;i++){
			System.out.printf("(%d)%s(%d)%n",i+1,names[i],points[i]);
		}
	}
}
