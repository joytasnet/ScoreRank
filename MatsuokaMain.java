import java.util.*;
public class MatsuokaMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int student=new Scanner(System.in).nextInt();
		String[] names=new String[student];
		int[] scores=new int[student];
		for(int i=0;i<student;i++){
			System.out.printf("%d人目の名前>>",i+1);
			names[i]=new Scanner(System.in).nextLine();
			System.out.printf("%d人目の点数>>",i+1);
			scores[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<student-1;i++){
			for(int j=i+1;j<student;j++){
				int tmp;
				String nametmp;
				if(scores[i]<scores[j]){
					tmp=scores[i];
					scores[i]=scores[j];
					scores[j]=tmp;
					nametmp=names[i];
					names[i]=names[j];
					names[j]=nametmp;
				}
			}
		}
		System.out.println("--結果--");
		for(int i=0;i<student;i++){
			System.out.printf("(%d)%s(%d)\n",i+1,names[i],scores[i]);
		}
	}
}
