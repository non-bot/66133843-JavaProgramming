package application;

import javafx.event.ActionEvent;
import java.lang.classfile.instruction.OperatorInstruction;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{
	@FXML
	private TextField smalltext;
	@FXML
	private TextField bigtext;
	Boolean check = false;
	double ans;
	double num1;
	double num2;
	String opt = "";
	public void Ans() {
		if(opt.equals("+")) {
			num1 += num2;
		}
		else if(opt.equals("-")) {
			num1 -= num2;
		}
		else if(opt.equals("*")) {
			num1 *= num2;
		}
		else if(opt.equals("/")) {
			if (num2 != 0)
				num1 /= num2;
			else
				bigtext.setText("Khong chia het duoc cho 0");
		}
	}
	public void Clear(ActionEvent c) {
		bigtext.setText("");
	}
	public void AllClear(ActionEvent ac) {
		smalltext.setText("");
		bigtext.setText("");
		num1 = 0;
	}
	public void Equal(ActionEvent eq) {
		push();
		bigtext.setText(num1+"");
		smalltext.setText("");
		ans = num1;
		num1 = 0;
	}
	public void Answer(ActionEvent an) {
		bigtext.setText(bigtext.getText()+ans);
	}
	public void Opcheck() {
		if (check == true) {
			String text = smalltext.getText();
			smalltext.setText(text.substring(0, text.length()-1) + opt);
			check = false;
		}
		else {
			smalltext.setText(smalltext.getText() + opt);
		}
	}
	@FXML
	public void Number(ActionEvent num) {
		String no = ((Button)num.getSource()).getText();
		bigtext.setText(bigtext.getText() + no);
	}
	public static Double tryParseDouble(String s) {
	    try {
	        return Double.parseDouble(s);
	    } catch (Exception e) {
	        return null;
	    }
	}
	public void push() {
		if(tryParseDouble(bigtext.getText()) != null) {
			
			double num = Double.parseDouble(bigtext.getText());
			if (smalltext.getText().isEmpty())
				num1 = num;
			else {
				num2 = num;
				Ans();
			}
			smalltext.setText(num1+"");
			bigtext.setText("");
		}
		Opcheck();
	}
	public void Operators(ActionEvent op) {
		opt = ((Button)op.getSource()).getText();
			if ((opt == "*" ||  opt == "/")&&(smalltext.getText() == "" || smalltext.getText() == null)) {
					bigtext.setText("Thieu toan hang truoc toan tu");
					return;
				}
			push();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
