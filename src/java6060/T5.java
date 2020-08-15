package java6060;

abstract class T6{
	 abstract void fun();
	 String a;String b;
public void sun(String a,String b ) {
	this.a=a;
	this.b=b;
	
}
}
  class T7 extends T6{
	 void fun(){
		 for(int i=1;i<=4;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
}

public class T5 {
	public static void main(String[] args) {
		T7 c=new T7();
		c.fun();
	}

}

