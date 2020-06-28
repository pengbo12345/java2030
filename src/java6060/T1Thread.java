package java6060;
class  TT2hread extends Thread{
	public void run() {
		for (int i=0;i<=2000;i++) {
			System.out.println(i+"麼�潦漫�。。。。。。。");
		}
	}
	
	
}
public class T1Thread {
	public static void main(String[] args) {
		TT2hread a=new TT2hread();
		a.start();
		
	}

}
