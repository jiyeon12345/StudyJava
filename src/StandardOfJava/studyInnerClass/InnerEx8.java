package StandardOfJava.studyInnerClass;
import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("start");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		}
		);
	}

}
