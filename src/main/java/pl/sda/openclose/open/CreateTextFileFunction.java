package pl.sda.openclose.open;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@AdnotacjeIfunction
public class CreateTextFileFunction extends JFrame implements IFunction {
    private JTextField targetFile = new JTextField(20);
    private JTextArea fileContent = new JTextArea();
    private JButton saveButton = new JButton("SAVE");


    @Override
    public void launch() {
        setVisible(true);
    }

    public CreateTextFileFunction() throws HeadlessException {
        setLayout(new FlowLayout());
        setSize(500, 500);
        setLocation(300, 300);
        add(targetFile);
        add(fileContent);
        fileContent.setColumns(20);
        fileContent.setRows(3);
        add(saveButton);
        saveButton.addActionListener(e -> {
            try {
                createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

    }

    public void createNewFile() throws IOException {
        try {
            FileOutputStream outputStream = new FileOutputStream(targetFile.getText(), true);
            outputStream.write(fileContent.getText().getBytes());
            outputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "CreateTextFileFunction{}";
    }
}
