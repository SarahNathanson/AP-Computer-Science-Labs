	import java.applet.*;
	import java.awt.*;
	import java.awt.event.*;

	public class LittleApplet extends Applet implements ActionListener {
		private Button button1, button2, button3;
		private TextArea answers = new TextArea("This space intentionally left blank.");
		private TextField howMany = new TextField(10);

		public void init() {
			Font TimesNew = new Font("Times New Roman",Font.PLAIN,12);
			Font Courier = new Font("Courier",Font.BOLD,12);

			add(new Label("How many times should we print things? Give me an integer!"));

			addline();
			add(howMany);
			addline();

			add(new Label("Press a button!"));
			addline();

			button1 = new Button("Button 1");
			button1.setFont(Courier);
			
			button2 = new Button("Button 2");
			button3 = new Button("Button 3");

			add(button1);
			button1.addActionListener(this);

			add(button2);
			button2.addActionListener(this);
			
			add(button3);
			button3.addActionListener(this);

			addline();

			answers.setEditable(false);
			add(answers);
		}
		/*
		 * addline() adds a blank, white line to the screen to force a newline.
		 */
		public void addline(){
			/* 
			 * A Canvas component represents a blank rectangular area of the screen onto 
			 * which the application can draw or from which the application can trap input 
			 * events from the user.  Here, we're making one just 1 pixel tall (and 10000
			 * pixels wide) for the sole purpose of forcing everything to move to a new line.
			 */
			Canvas line = new Canvas( );
			line.setSize(10000,1);
			line.setBackground(Color.white);
			add(line);
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				answers.setText("I'm button one!, number is " + Integer.parseInt(howMany.getText()));
				System.out.println("Button 1 was pressed");
			}
			else if (e.getSource() == button2) {
				answers.append("\nDon't forget button two!!!!" + howMany.getText());
				System.out.println("Button 2 was pressed");
			}
			else{
				answers.append("\nDon't forget button three!!!!" + howMany.getText());
				System.out.println("Button 3 was pressed");
			}
		}
	}


