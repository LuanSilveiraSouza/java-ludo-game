import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGame extends JPanel {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Ludo");

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
