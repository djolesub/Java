package basicGUI;
import java.awt.Frame;
import java.awt.event.*;

public class MyGUI extends Frame implements ActionListener{
	private Lable labelCount;
	private TextField tfCount;
	private Button btnCount;
	private int count;
	
	public MyGUI(){
		setLayout(new FlowLayout());
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
		
	}

}
