package pl.sda.openclose.open;

import javafx.scene.shape.ClosePath;

import javax.swing.*;
import java.awt.*;
@AdnotacjeIfunction
public class QuitFunction extends JFrame implements IFunction {
    private JButton quitButton = new JButton("quit button");
    @Override
    public void launch() {
        setVisible(true);
    }

    public QuitFunction() throws HeadlessException {
        setLayout(new BorderLayout());
        setSize(300,300);
        setLocation(600,600);
        add(quitButton);
        quitButton.addActionListener(e -> System.exit(0));
    }

    @Override
    public String toString() {
        return "QuitFunction{}";
    }
}
