import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ReturnButton extends JButton {
    public ReturnButton() throws IOException {
        setFocusable(false);
        setFont(Main.font);
        addActionListener(Main.actionListener);
        Image img = ImageIO.read(getClass().getResource("home.png"));
        Image resizeImage = img.getScaledInstance(32,32, Image.SCALE_DEFAULT);
        setIcon(new ImageIcon(resizeImage));
    }
}
