package pl.sda.openclose.open;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
@AdnotacjeIfunction
public class CopyFileFunction extends JFrame implements IFunction {
    private JTextField sourceFile = new JTextField(20);
    private JTextField targetFile = new JTextField(20);
    private JButton copyButton = new JButton("COPY");




    @Override
    public void launch() {
    setVisible(true);
    }

    public CopyFileFunction() throws HeadlessException {
        setSize(300,300);
        setLocation(300,200);
        setLayout(new FlowLayout());
        add(sourceFile);
        add(targetFile);
        add(copyButton);
        copyButton.addActionListener(e -> copyFiles());

    }

    private void copyFiles() {
        try {
            Files.copy(Paths.get(sourceFile.getText()),Paths.get(targetFile.getText()),REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CopyFileFunction{}";
    }
}
