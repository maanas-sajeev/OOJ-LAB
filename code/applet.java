import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class IntegerDivisionApplet extends Applet implements ActionListener {
private TextField num1Field, num2Field, resultField;
public void init() {
setLayout(new GridLayout(4, 2));
add(new Label("Num1:"));
num1Field = new TextField(10);
add(num1Field);
add(new Label("Num2:"));
num2Field = new TextField(10);
add(num2Field);
Button divideButton = new Button("Divide");
divideButton.addActionListener(this);
add(divideButton);
add(new Label("Result:"));
resultField = new TextField(10);
resultField.setEditable(false);
add(resultField);
}
public void actionPerformed(ActionEvent e) {
try {
int num1 = Integer.parseInt(num1Field.getText());
int num2 = Integer.parseInt(num2Field.getText());
if (num2 == 0) {
throw new ArithmeticException("Division by zero!");
}
resultField.setText(String.valueOf(num1 / num2));
} catch (NumberFormatException | ArithmeticException ex) {
showStatus("Error: " + ex.getMessage());
}
}}