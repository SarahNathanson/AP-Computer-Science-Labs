import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.text.*;
import java.util.Random;
	
public class Calculator extends Applet implements ActionListener {
	private String x;
	private String operator;
	private String y;
	private TextField display = new TextField("0", 20);//textfield display of size 20 starts displaying 0
	private ArrayList<Button> numbers = new ArrayList<Button>();//makes array of number buttons
	private ArrayList<Button> operators = new ArrayList<Button>();//makes array of operation buttons
	private Button off, clr, fun, point, plusminus, equals;
	private double[] funArray={3.1415926535,6.2831853071,2.7182818284,1.4142135623,1.6180339887};
	//constants: pi, tau, e, sqrt(2), the golden ratio
	public void init(){
		x="0";
		operator="";
		y="0";
		setSize(250,220);//sets size of screen
		Font Courier = new Font("Courier",Font.BOLD,12);//initializes font object
		display.setEditable(false);
		add(display); //adds TextField display to the screen
		addline();//adds a newline
		
		for(int i=0;i<10;i++){
			numbers.add(new Button(" "+i+" "));//adds button objects to array
			numbers.get(i).addActionListener(this);
			numbers.get(i).setFont(Courier);//sets font
		}
		
		operators.add(new Button(" + "));//adds button objects to array //0
		operators.get(0).setFont(Courier);//sets font
		operators.get(0).addActionListener(this);
		operators.add(new Button(" - "));//adds button objects to array //1
		operators.get(1).setFont(Courier);//sets font
		operators.get(1).addActionListener(this);
		operators.add(new Button(" * "));//adds button objects to array //2
		operators.get(2).setFont(Courier);//sets font
		operators.get(2).addActionListener(this);
		operators.add(new Button(" / "));//adds button objects to array //3
		operators.get(3).setFont(Courier);//sets font
		operators.get(3).addActionListener(this);
		
		off=(new Button("OFF"));//adds button objects to array //0
		off.setFont(Courier);//sets font
		off.addActionListener(this);
		add(off);
		clr=(new Button("CLR"));//adds button objects to array //0
		clr.setFont(Courier);//sets font
		clr.addActionListener(this);
		add(clr);
		fun=(new Button("FUN"));//adds button objects to array //0
		fun.setFont(Courier);//sets font
		fun.addActionListener(this);
		add(fun);
		add(operators.get(3));//adds division
		addline();
		for(int i=3;i>0;i--){
			for(int j=2;j>=0;j--){
				add(numbers.get((i*3)-j));//adds button to screen
			}
			add(operators.get(i-1));//adds operator buttons to screen
			addline();
		}
		
		add(numbers.get(0));
		point=(new Button(" . "));//adds button objects to array //0
		point.setFont(Courier);//sets font
		point.addActionListener(this);
		add(point);
		plusminus=(new Button("+/-"));//adds button objects to array //0
		plusminus.setFont(Courier);//sets font
		plusminus.addActionListener(this);
		add(plusminus);
		equals=(new Button(" = "));//adds button objects to array //0
		equals.setFont(Courier);//sets font
		equals.addActionListener(this);
		add(equals);
		
		//END OF INITIALIZATIONS
		
	}
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
		DecimalFormat format1 = new DecimalFormat("###"); // This will have no commas and no decimal.
		DecimalFormat format2 = new DecimalFormat("###.##########"); // 10 decimal places
		for(int i=0;i<4;i++){//operators pressed
			if (e.getSource() == operators.get(i)){
				
				if(!((operator.equals("")||operator.equals("=")))){
					//update x
					if(operator.equals("+")){
						x=Double.toString(Double.parseDouble(x)+Double.parseDouble(y));
					}
					else if(operator.equals("-")){
						x=Double.toString(Double.parseDouble(x)-Double.parseDouble(y));
					}
					else if(operator.equals("*")){
						x=Double.toString(Double.parseDouble(x)*Double.parseDouble(y));
					}
					else if(operator.equals("/")){
						//what if they divide by 0?
						x=Double.toString((Double.parseDouble(x)/Double.parseDouble(y)));
					}
					y="0";
					if(i==0){
						operator="+";
					}
					else if(i==1){
						operator="-";
					}
					else if(i==2){
						operator="*";
					}
					else if(i==3){
						operator= "/" ;
					}
					break;
				}
				else if(operator.equals("") || operator.equals("=")){
					if(i==0){
						operator="+";
					}
					else if(i==1){
						operator="-";
					}
					else if(i==2){
						operator="*";
					}
					else if(i==3){
						operator= "/" ;
					}
					break;
					
				}
				break;
			}
		}
		
		for(int i=0;i<10;i++){//numbers pressed
			if (e.getSource() == numbers.get(i)){
				if(operator.equals("")||operator.equals("=")){
					if(x.indexOf(".")!=-1 && (x.length()-x.indexOf(".")>10)){
						break;
					}
					if(x.equals("0")||operator.equals("=")){
						x=Integer.toString(i);
						//change display
					}
					else{
						x+=Integer.toString(i);
						//change display
					}
					display.setText(x);
					operator="";
				}
				else{
					if(y.indexOf(".")!=-1 && (y.length()-y.indexOf(".")>10)){
						break;
					}
					//operator has been selected
					if(y.equals("0")){
						y=Integer.toString(i);
						//change display
					}
					else{
						y+=Integer.toString(i);
						//change display
					}
					display.setText(y);
				}
				break;
			}
		}
		if (e.getSource() == equals) {
			if(operator.equals("+")){
				x=Double.toString(Double.parseDouble(x)+Double.parseDouble(y));
			}
			else if(operator.equals("-")){
				x=Double.toString(Double.parseDouble(x)-Double.parseDouble(y));
			}
			else if(operator.equals("*")){
				x=Double.toString(Double.parseDouble(x)*Double.parseDouble(y));
			}
			else if(operator.equals("/")){
				x=Double.toString(Double.parseDouble(x)/Double.parseDouble(y));
			}
			if(Double.parseDouble(x)%1==0){
				display.setText(format1.format(Double.parseDouble(x)));//no decimal
			}
			else{
				display.setText(format2.format(Double.parseDouble(x)));//10 decimals
			}
			operator="=";
			y="0";
		}
		if (e.getSource() == clr) {
			x="0";
			y="0";
			operator="";
			display.setText("0");
		}
		if (e.getSource() == off) {
			System.exit(0);
		}
		if (e.getSource() == fun) {
			//fun thing happens
			//sets x or y to a random math constant
			if(operator.equals("")||operator.equals("=")){
				if(y.indexOf(".")==-1){
					x=Double.toString(funArray[new Random().nextInt(funArray.length)]);
					operator="";
					display.setText(x);
				}
				
			}
			else{
				if(y.indexOf(".")==-1){
					y=Double.toString(funArray[new Random().nextInt(funArray.length)]);
					display.setText(y);
				}
			}
		}
		
		if (e.getSource() == point) {
			if(operator.equals("")||operator.equals("=")){
				if(display.getText().indexOf(".")==-1){
					x=display.getText()+".";
					operator="";
					display.setText(x);
				}
				
			}
			else{
				if(y.indexOf(".")==-1){
					y=display.getText()+".";
					display.setText(y);
				}
			}	
			
		}
		if (e.getSource() == plusminus) {
			if(operator.equals("")||operator.equals("=")){
				x=Double.toString(Double.parseDouble(x)*-1);
				operator="";
				if(Double.parseDouble(x)%1==0){
					display.setText(format1.format(Double.parseDouble(x)));//no decimal
				}
				else{
					display.setText(format2.format(Double.parseDouble(x)));//10 decimals
				}
			}
			else{
				y=Double.toString(Double.parseDouble(y)*-1);
				if(Double.parseDouble(y)%1==0){
					display.setText(format1.format(Double.parseDouble(y)));//no decimal
				}
				else{
					display.setText(format2.format(Double.parseDouble(y)));//10 decimals
				}
				
			}
		}
		
		//if (e.getSource() == button) {}
		//display.setText()
		//display.append();
		
	}
}
