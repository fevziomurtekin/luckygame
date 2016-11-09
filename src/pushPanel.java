import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pushPanel extends JPanel {

	private int count;
	private JButton push;
	private JLabel jl;
	
	public pushPanel()
	{
		count=0;
		push=new JButton("Push me");
		jl=new JLabel("-----");
		
		//we will now add an actionListener to the button by means of a temporary inner class
		
		push.addActionListener(new myTemp());
		add(push);   add(jl);
	}	
	private class myTemp implements ActionListener
	{
	  public void actionPerformed(ActionEvent e)
	   {
          count++;
          jl.setText("Pushes "+count);
	   }
	}	
}


