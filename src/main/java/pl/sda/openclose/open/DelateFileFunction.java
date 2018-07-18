package pl.sda.openclose.open;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@AdnotacjeIfunction
public class DelateFileFunction extends JFrame implements IFunction {
   private JTextField targetFile = new JTextField(20);
   private JButton delateButton = new JButton("DELATE");

    @Override
    public void launch() {
        setVisible(true);
    }

    public DelateFileFunction() throws HeadlessException {
        setLayout(new FlowLayout());
        setSize(300,300);
        setLocation(300,300);
        add(targetFile);
        add(delateButton);
        delateButton.addActionListener(e -> {
            try {
                Files.delete(Paths.get(targetFile.getText()));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

    @Override
    public String toString() {
        return "DelateFileFunction{}";
    }
}
