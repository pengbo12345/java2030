package java6060;



class TThread extends Thread{
	public void run() {
		for (int i=0;i<=2000;i++) {
			System.out.println(i+"麼�潦漫�。。。。。。。");
		}
	}
	
	
}
public class AThread {
	public static void main(String[] args) {
		TThread a=new TThread();
		a.start();
		
	}

}