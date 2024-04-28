import javax.swing.*;
import java.io.IOException;

public class WithdrawButton extends JButton {
    public WithdrawButton(int cash) throws IOException {
        setFocusable(false);
        setFont(Main.font);
        addActionListener(Main.actionListener);
        setText(String.valueOf(cash));
    }
}
