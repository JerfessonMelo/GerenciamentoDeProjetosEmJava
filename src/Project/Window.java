package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window {

    public static void main(String[] args) {
        JFrame window = new JFrame("Test");
        window.setSize(640,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Home");
        JButton button2 = new JButton("Configurações");

        panel.add(button1);    
        panel.add(button2);
        window.add(panel);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Arquivos");
        menuBar.add(menu);
        window.setJMenuBar(menuBar);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(window, "Deseja realmente fechar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    window.dispose(); 
                }
            }
        });

        window.setVisible(true);
    }
}
