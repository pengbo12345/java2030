package java6060;
 abstract class T3{
	 abstract void fun();
	 String a;String b;
public void sun(String a,String b ) {
	this.a=a;
	this.b=b;
	
}
}
   class T4 extends T3{
	 void fun(){
		 for(int i=1;i<=4;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
 }
 
public class T2 {
	public static void main(String[] args) {
		T4 c=new T4();
		c.fun();
	}

}
