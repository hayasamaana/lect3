import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import POne.*;

public class TestClient {
	public int x,y;

    Object e=new Object();
    JTextArea t=new JTextArea();
    
    TestClient(){
    	
    	
    }
	
//	public String toString() {
//		return "x="+x+"y="+y;
//	}
	public static void main(String[] args) {
		int []m=new int[5];
		
		TestClient[]tc=new TestClient[6];
		//tc[0].x=6;// EXception
		System.out.println(tc);
		tc[0]=new TestClient();
		System.out.println(tc[0]);
		tc[0]=new TestClient();
		System.out.println(tc[0]);
		tc[0].x=6;
		Integer []wrap=new Integer[8];
		wrap[0]=new Integer(4);
		wrap[1]=48;// boxing
		wrap[0]=new Integer(6);
		System.out.println(wrap[0]);
		System.out.println(wrap[1]);
		//TestClient obj=new TestClient();
		//System.out.println(obj);
		System.out.println(tc[0]);
		//System.out.println(tc[1]);
		
		
	}

}

	


