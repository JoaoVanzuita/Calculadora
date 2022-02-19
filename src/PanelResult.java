import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelResult extends JPanel {

    public PanelResult() {
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.add(lbResult());

        this.setVisible(true);
    }

    private JLabel lbResult(){

        JLabel lbResult = new JLabel("resultado");
        Font font = new Font("Courier", Font.BOLD, 45);

        lbResult.setBounds(0,0, 400, 100);
        lbResult.setFont(font);
        lbResult.setBorder(new EmptyBorder(10,10,10,10));
        lbResult.setHorizontalAlignment(SwingConstants.RIGHT);

        return lbResult;
    }

}
