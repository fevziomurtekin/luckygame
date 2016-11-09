import javax.swing.*;

public class PushCounter {
  public static void main(String args[])
  {
	  JFrame jf=new JFrame("Push Counter");
	  jf.getContentPane();
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  jf.add(new pushPanel());
	  jf.pack();
	  jf.setVisible(true);
  }
}
