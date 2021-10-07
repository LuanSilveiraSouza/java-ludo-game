import javax.swing.JFrame;

public class MainWindow extends JFrame{
    public MainWindow(){
        super("Ludo");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);        
    }
}
