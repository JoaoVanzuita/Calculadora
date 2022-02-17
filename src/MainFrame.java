import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() throws HeadlessException {

        this.setLayout(null);
        this.setSize(416, 539);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

        JPanel panelResult = new JPanel();
        JPanel panelButtons = new JPanel(new GridLayout(4,4));

        this.add(panelResult(panelResult));
        panelResult.setBounds(0,0, 400,100);

        this.add(panelButtons(panelButtons));
        panelButtons.setBounds(0,100,400,400);


    }



    private JPanel panelButtons(JPanel panel){

        JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btDel, btEqual, btMulti, btDiv, btSum, btSub, btDot;
        Font font = new Font("Courier", Font.PLAIN, 25);

        //TODO: adicionar fonte maior aos botões

        btDel = new JButton();
            btDel.setText("DEL");
            btDel.setFont(font);
        panel.add(btDel);

        bt7 = new JButton();
            bt7.setText("7");
            bt7.setFont(font);
        panel.add(bt7);

        bt8 = new JButton();
            bt8.setText("8");
            bt8.setFont(font);
        panel.add(bt8);

        bt9 = new JButton();
            bt9.setText("9");
            bt9.setFont(font);
        panel.add(bt9);

        btMulti = new JButton();
            btMulti.setText("*");
            btMulti.setFont(font);
        panel.add(btMulti);

        bt4 = new JButton();
            bt4.setText("4");
            bt4.setFont(font);
        panel.add(bt4);

        bt5 = new JButton();
            bt5.setText("5");
            bt5.setFont(font);
        panel.add(bt5);

        bt6 = new JButton();
            bt6.setText("6");
            bt6.setFont(font);
        panel.add(bt6);

        btDiv = new JButton();
            btDiv.setText("/");
            btDiv.setFont(font);
        panel.add(btDiv);

        bt1 = new JButton();
            bt1.setText("1");
            bt1.setFont(font);
        panel.add(bt1);

        bt2 = new JButton();
            bt2.setText("2");
            bt2.setFont(font);
        panel.add(bt2);

        bt3 = new JButton();
            bt3.setText("3");
            bt3.setFont(font);
        panel.add(bt3);

        btSum = new JButton();
            btSum.setText("+");
            btSum.setFont(font);
        panel.add(btSum);

        btSub = new JButton();
            btSub.setText("-");
            btSub.setFont(font);
        panel.add(btSub);

        btDot = new JButton();
            btDot.setText(",");
            btDot.setFont(font);
        panel.add(btDot);

        btEqual = new JButton();
            btEqual.setText("=");
            btEqual.setFont(font);
        panel.add(btEqual);

        return panel;
    }

    private JPanel panelResult(JPanel panel){

        JLabel lbResult = this.lbResult();
        this.add(lbResult);

        return panel;
    }

    private JLabel lbResult(){

        JLabel lbResult = new JLabel("resultado");
        Font font = new Font("Courier", Font.PLAIN, 50);

        lbResult.setBounds(0,0, 400, 100);
        lbResult.setFont(font);;
        lbResult.setBorder(new EmptyBorder(10,10,10,10));
        lbResult.setHorizontalAlignment(SwingConstants.RIGHT);

        return lbResult;
    }

}