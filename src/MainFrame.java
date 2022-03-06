import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    JPanel panelResult, panelButtons;
    JLabel lbResult;

    public MainFrame() throws HeadlessException {

        this.setLayout(null);
        this.setSize(416, 539);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelResult = new PanelResult();
        panelButtons = new JPanel(new GridLayout(4, 4));

        this.add(panelResult);
        panelResult.setBounds(0, 0, 400, 100);

        this.add(panelButtons(panelButtons));
        panelButtons.setBounds(0, 100, 400, 400);

        lbResult = (JLabel) panelResult.getComponent(0);
    }


    private JPanel panelButtons(JPanel panel) {

        JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btDel, btEqual, btMulti, btDiv, btSum, btSub, btDot;
        Font font = new Font("Courier", Font.PLAIN, 25);

        btDel = new JButton("DEL");
        btDel.setFont(font);
        btDel.addActionListener(this);

        panel.add(btDel);

        bt7 = new JButton("7");
        bt7.setFont(font);
        bt7.addActionListener(this);

        panel.add(bt7);

        bt8 = new JButton("8");
        bt8.setFont(font);
        bt8.addActionListener(this);

        panel.add(bt8);

        bt9 = new JButton("9");
        bt9.setFont(font);
        bt9.addActionListener(this);

        panel.add(bt9);

        btMulti = new JButton("*");
        btMulti.setFont(font);
        btMulti.addActionListener(this);

        panel.add(btMulti);

        bt4 = new JButton("4");
        bt4.setFont(font);
        bt4.addActionListener(this);

        panel.add(bt4);

        bt5 = new JButton("5");
        bt5.setFont(font);
        bt5.addActionListener(this);

        panel.add(bt5);

        bt6 = new JButton("6");
        bt6.setFont(font);
        bt6.addActionListener(this);

        panel.add(bt6);

        btDiv = new JButton("/");
        btDiv.setFont(font);
        btDiv.addActionListener(this);

        panel.add(btDiv);

        bt1 = new JButton("1");
        bt1.setFont(font);
        bt1.addActionListener(this);

        panel.add(bt1);

        bt2 = new JButton("2");
        bt2.setFont(font);
        bt2.addActionListener(this);

        panel.add(bt2);

        bt3 = new JButton("3");
        bt3.setFont(font);
        bt3.addActionListener(this);

        panel.add(bt3);

        btSum = new JButton("+");
        btSum.setFont(font);
        btSum.addActionListener(this);

        panel.add(btSum);

        btSub = new JButton("-");
        btSub.setFont(font);
        btSub.addActionListener(this);

        panel.add(btSub);

        btDot = new JButton(".");
        btDot.setFont(font);
        btDot.addActionListener(this);

        panel.add(btDot);

        btEqual = new JButton("=");
        btEqual.setFont(font);
        btEqual.addActionListener(this);

        panel.add(btEqual);

        return panel;
    }

    //Contador para botão .
    int clicado = 0;

    Boolean operacaoAnterior = false;

    @Override
    public void actionPerformed(ActionEvent e) {

            //Botão 7
        if (e.getSource() == panelButtons.getComponent(1)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "7");

            //Botão 8
        } else if (e.getSource() == panelButtons.getComponent(2)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "8");


            //Botão 9
        } else if (e.getSource() == panelButtons.getComponent(3)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "9");

            //Botão 4
        } else if (e.getSource() == panelButtons.getComponent(5)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "4");

            //Botão 5
        } else if (e.getSource() == panelButtons.getComponent(6)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "5");

            //Botão 6
        } else if (e.getSource() == panelButtons.getComponent(7)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "6");

            //Botão 1
        } else if (e.getSource() == panelButtons.getComponent(9)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "1");

            //Botão 2
        } else if (e.getSource() == panelButtons.getComponent(10)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "2");

            //Botão 3
        } else if (e.getSource() == panelButtons.getComponent(11)) {

            verificaOperacaoAnterior();

            lbResult.setText(lbResult.getText() + "3");

            //Botão .
        } else if (e.getSource() == panelButtons.getComponent(14)) {

            verificaOperacaoAnterior();

            if (clicado == 0) {


                if(lbResult.getText().length() > 0) {

                    char ultimoCaractere = lbResult.getText().charAt(lbResult.getText().length() - 1);

                    if(ultimoCaractere == '*' ||
                            ultimoCaractere == '/' ||
                            ultimoCaractere == '+' ||
                            ultimoCaractere == '-'){

                        lbResult.setText(lbResult.getText() + "0.");


                    }
                }

                if(lbResult.getText().length() == 0 ){


                    lbResult.setText(lbResult.getText() + "0.");

                }else{

                    lbResult.setText(lbResult.getText()+ ".");

                }
                clicado++;
            }

            //Botão Del
        } else if (e.getSource() == panelButtons.getComponent(0)) {

            if (lbResult.getText().length() > 0) {

                String numero = lbResult.getText();
                int apagar = numero.length() - 1;

                if (numero.charAt(apagar) == '.') {
                    clicado = 0;
                }

                numero = numero.substring(0, apagar);

                lbResult.setText(numero);
            }

            //Botão *
        } else if (e.getSource() == panelButtons.getComponent(4)) {

            if (lbResult.getText().length() > 0) {

                char ultimoCaractere = lbResult.getText().charAt(lbResult.getText().length() - 1);

                if (ultimoCaractere != '+' && ultimoCaractere != '-' && ultimoCaractere != '*' && ultimoCaractere != '/') {

                    if (ultimoCaractere == '.') {

                        lbResult.setText(lbResult.getText() + "0*");

                    } else {
                        lbResult.setText(lbResult.getText() + "*");
                    }

                    clicado = 0;

                }
            }

            //Botão /
        } else if (e.getSource() == panelButtons.getComponent(8)) {

            if (lbResult.getText().length() > 0) {

                char ultimoCaractere = lbResult.getText().charAt(lbResult.getText().length() - 1);

                if (ultimoCaractere != '+' && ultimoCaractere != '-' && ultimoCaractere != '*' && ultimoCaractere != '/') {

                    if (ultimoCaractere == '.') {

                        lbResult.setText(lbResult.getText() + "0/");

                    } else {
                        lbResult.setText(lbResult.getText() + "/");
                    }

                    clicado = 0;

                }
            }

            //Botão +
        } else if (e.getSource() == panelButtons.getComponent(12)) {

            if (lbResult.getText().length() > 0) {

                char ultimoCaractere = lbResult.getText().charAt(lbResult.getText().length() - 1);

                if (ultimoCaractere != '+' && ultimoCaractere != '-' && ultimoCaractere != '*' && ultimoCaractere != '/') {

                    if (ultimoCaractere == '.') {

                        lbResult.setText(lbResult.getText() + "0+");

                    } else {
                        lbResult.setText(lbResult.getText() + "+");
                    }

                    clicado = 0;

                }
            }

            //Botão -
        } else if (e.getSource() == panelButtons.getComponent(13)) {

            if (lbResult.getText().length() > 0) {

                char ultimoCaractere = lbResult.getText().charAt(lbResult.getText().length() - 1);

                if (ultimoCaractere != '+' && ultimoCaractere != '-' && ultimoCaractere != '*' && ultimoCaractere != '/') {

                    if (ultimoCaractere == '.') {

                        lbResult.setText(lbResult.getText() + "0-");

                    } else {
                        lbResult.setText(lbResult.getText() + "-");
                    }

                    clicado = 0;

                }
            }

            //Botão =
        } else if (e.getSource() == panelButtons.getComponent(15)) {

            operacaoAnterior = true;
            clicado = 0;

            String expressao = lbResult.getText();
            lbResult.setText(calcular(expressao));

        }
    }

    public static String calcular(String expressao) {
        Boolean resultadoObtido = false;
        Double resultadoParcial;


        while (resultadoObtido == false) {

            String[] numeros = expressao.split("[^0-9.]");


            String numero1 = numeros[0];

            if (numeros.length < 2) {

                return expressao;

            }

            String numero2 = numeros[1];

            int indexRestante = numero1.length() + numero2.length() + 1;

            String restante = expressao.substring(indexRestante);

            char operacao = expressao.charAt(numero1.length());

            switch (operacao) {

                case '+':

                    resultadoParcial = Double.parseDouble(numero1) + Double.parseDouble(numero2);

                    expressao = resultadoParcial + restante;

                    break;

                case '-':

                    resultadoParcial = Double.parseDouble(numero1) - Double.parseDouble(numero2);

                    expressao = resultadoParcial + restante;

                    break;

                case '*':


                    resultadoParcial = Double.parseDouble(numero1) * Double.parseDouble(numero2);

                    expressao = resultadoParcial + restante;

                    break;

                case '/':

                    resultadoParcial = Double.parseDouble(numero1) / Double.parseDouble(numero2);

                    expressao = resultadoParcial + restante;

                    break;

                default:

                    resultadoObtido = true;

                    break;

            }

        }


        return expressao;
    }

    public void verificaOperacaoAnterior(){

        if(operacaoAnterior == true){

            lbResult.setText("");
            operacaoAnterior = false;
        }

    }
}
