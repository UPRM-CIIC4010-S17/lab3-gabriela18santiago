import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Gabriela Santiago ");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 400);
		myFrame.setSize(300, 200);
		myFrame.setVisible(true);
		 MyPanelClass myPanel = new MyPanelClass();
         myFrame.getContentPane().add(myPanel);
         myFrame.setVisible(true);
	}
}