package arrays;

public class Example1 {

	public static void main(String[] args) {
	int[] j= {9,32,6,7,8};
	System.out.println(j[1]);
int i=0;
while(i<j.length) {
	System.out.println(j[i]);
	i++;
}
System.out.println("next example");
int[] k=new int[] {1,2,3,4,5,0};
System.out.println(k.length);
for(int a=0;a<k.length;a++) {
	System.out.println(k[a]);
}
	}

}
