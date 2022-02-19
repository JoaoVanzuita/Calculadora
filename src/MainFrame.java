import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{

    JPanel panelResult, panelButtons;
    JLabel lbResult;

    public MainFrame() throws HeadlessException {

        this.setLayout(null);
        this.setSize(416, 539);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

        panelResult = new PanelResult();
        panelButtons = new JPanel(new GridLayout(4,4));

        this.add(panelResult);
        panelResult.setBounds(0,0, 400,100);

        this.add(panelButtons(panelButtons));
        panelButtons.setBounds(0,100,400,400);

        lbResult = (JLabel) panelResult.getComponent(0);
    }


    private JPanel panelButtons(JPanel panel){

        JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btDel, btEqual, btMulti, btDiv, btSum, btSub, btDot;
        Font font = new Font("Courier", Font.PLAIN, 25);

        btDel = new JButton();
            btDel.setText("DEL");
            btDel.setFont(font);
            btDel.addActionListener(this);

        panel.add(btDel);

        bt7 = new JButton();
            bt7.setText("7");
            bt7.setFont(font);
            bt7.addActionListener(this);

        panel.add(bt7);

        bt8 = new JButton();
            bt8.setText("8");
            bt8.setFont(font);
            bt8.addActionListener(this);

        panel.add(bt8);

        bt9 = new JButton();
            bt9.setText("9");
            bt9.setFont(font);
            bt9.addActionListener(this);

        panel.add(bt9);

        btMulti = new JButton();
            btMulti.setText("*");
            btMulti.setFont(font);
            btMulti.addActionListener(this);

        panel.add(btMulti);

        bt4 = new JButton();
            bt4.setText("4");
            bt4.setFont(font);
            bt4.addActionListener(this);

        panel.add(bt4);

        bt5 = new JButton();
            bt5.setText("5");
            bt5.setFont(font);
            bt5.addActionListener(this);

        panel.add(bt5);

        bt6 = new JButton();
            bt6.setText("6");
            bt6.setFont(font);
            bt6.addActionListener(this);

        panel.add(bt6);

        btDiv = new JButton();
            btDiv.setText("/");
            btDiv.setFont(font);
            btDiv.addActionListener(this);

        panel.add(btDiv);

        bt1 = new JButton();
            bt1.setText("1");
            bt1.setFont(font);
            bt1.addActionListener(this);

        panel.add(bt1);

        bt2 = new JButton();
            bt2.setText("2");
            bt2.setFont(font);
            bt2.addActionListener(this);

        panel.add(bt2);

        bt3 = new JButton();
            bt3.setText("3");
            bt3.setFont(font);
            bt3.addActionListener(this);

        panel.add(bt3);

        btSum = new JButton();
            btSum.setText("+");
            btSum.setFont(font);
            btSum.addActionListener(this);

        panel.add(btSum);

        btSub = new JButton();
            btSub.setText("-");
            btSub.setFont(font);
            btSub.addActionListener(this);

        panel.add(btSub);

        btDot = new JButton();
            btDot.setText(",");
            btDot.setFont(font);
            btDot.addActionListener(this);

        panel.add(btDot);

        btEqual = new JButton();
            btEqual.setText("=");
            btEqual.setFont(font);
            btEqual.addActionListener(this);

        panel.add(btEqual);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == panelButtons.getComponent(2)){

            lbResult.setText("8");
        }
    }



}