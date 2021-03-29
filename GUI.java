import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class GUI implements ActionListener{

    BorderLayout border = new BorderLayout();
    GridLayout grid = new GridLayout(3,2);
    JFrame frame = new JFrame();
    JPanel textpane = new JPanel(new GridLayout(9,2));
    JPanel labelpane = new JPanel(new GridLayout(9,1));

    JPanel buttonpanel = new JPanel();

    int amount200;
    int amount100;
    int amount50;
    int amount20;
    int amount10;
    int amount5;
    int amount2;
    int amount1;

    JLabel Label200 = new JLabel(string200);
    JLabel Label100 = new JLabel(string100);
    JLabel Label50 = new JLabel(string50);
    JLabel Label20 = new JLabel(string20);
    JLabel Label10 = new JLabel(string10);
    JLabel Label5 = new JLabel(string5);
    JLabel Label2 = new JLabel(string2);
    JLabel Label1 = new JLabel(string1);
    JLabel obliczenia = new JLabel(resultString);

    NumberFormat amountFormat = NumberFormat.getNumberInstance();

    JFormattedTextField Field200 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field100 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field50 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field20 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field10 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field5 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field2 = new JFormattedTextField(amountFormat);
    JFormattedTextField Field1 = new JFormattedTextField(amountFormat);

    JFormattedTextField resultField = new JFormattedTextField();

    JButton button = new JButton("Oblicz");

    private static final String string200 = "Ilosc banknotow 200zl: ";
    private static final String string100 = "Ilosc banknotow 100zl: ";
    private static final String string50 = "Ilosc banknotow 50zl: ";
    private static final String string20 = "Ilosc banknotow 20zl: ";
    private static final String string10 = "Ilosc banknotow 10zl: ";
    private static final String string5 = "Ilosc monet 5zl: ";
    private static final String string2 = "Ilosc monet 2zl: ";
    private static final String string1 = "Ilosc monet 1zl: ";
    private static final String resultString = "Wynik: ";

    private static final String amount = "Podaj ilosc banknotow: ";


    public GUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(border);
        frame.setVisible(true);
        frame.setResizable(true);
        //frame.pack();
        frame.setSize(650,600);

        setNull();

        frame.add(labelpane, BorderLayout.WEST);
        labelpane.add(Label200);
        labelpane.add(Label100);
        labelpane.add(Label50);
        labelpane.add(Label20);
        labelpane.add(Label10);
        labelpane.add(Label5);
        labelpane.add(Label2);
        labelpane.add(Label1);
        labelpane.add(obliczenia);

        //labelpane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //textpane.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        frame.add(textpane);
        textpane.add(Field200);
        Field200.setValue(amount200);

        textpane.add(Field100);
        Field200.setValue(amount100);

        textpane.add(Field50);
        Field200.setValue(amount50);

        textpane.add(Field20);
        Field200.setValue(amount20);

        textpane.add(Field10);
        Field200.setValue(amount10);

        textpane.add(Field5);
        Field200.setValue(amount5);

        textpane.add(Field2);
        Field200.setValue(amount2);

        textpane.add(Field1);
        Field200.setValue(amount1);

        textpane.add(resultField);

        resultField.setEditable(false);

        frame.add(buttonpanel, BorderLayout.SOUTH);
        buttonpanel.add(button);
        button.setBounds(450, 450, 100, 20);
        button.addActionListener(this);

    }

    public int Calculate(){

        amount200 += Integer.parseInt(Field200.getText());
        amount100 += Integer.parseInt(Field100.getText());
        amount50 += Integer.parseInt(Field50.getText());
        amount20 += Integer.parseInt(Field20.getText());
        amount10 += Integer.parseInt(Field10.getText());
        amount5 += Integer.parseInt(Field5.getText());
        amount2 += Integer.parseInt(Field2.getText());
        amount1 += Integer.parseInt(Field1.getText());

        int result;
        result = amount200 * 200 + amount100 * 100 + amount50 * 50 + amount20 * 20 + amount10 * 10 + amount5 * 5 + amount2 * 2 + amount1;

        return result;
    }

    public void actionPerformed(ActionEvent e){
        resultField.setText(String.valueOf(Calculate()));
        setNull();
    }

    public void setNull(){
        Field200.setText("0");
        Field100.setText("0");
        Field50.setText("0");
        Field20.setText("0");
        Field10.setText("0");
        Field5.setText("0");
        Field2.setText("0");
        Field1.setText("0");
    }

}
