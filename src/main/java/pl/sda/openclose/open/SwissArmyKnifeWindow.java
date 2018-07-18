package pl.sda.openclose.open;

import javax.swing.*;
import java.awt.*;

public class SwissArmyKnifeWindow extends JFrame {
    private JList<IFunction> functionJList = new JList<IFunction>();
    private DefaultListModel<IFunction> functionListModel = new DefaultListModel<>();
    private JButton useSelectedFunction = new JButton("PRZYCISK");

    public void addFunction(IFunction function) {
    functionListModel.addElement(function);
    }

    public SwissArmyKnifeWindow() throws HeadlessException {
        functionJList.setModel(functionListModel);
        setSize(800,800);
        setLocation(100,100);
        setLayout(new BorderLayout());
        add(functionJList,BorderLayout.CENTER);
        add(useSelectedFunction,BorderLayout.PAGE_END);
        useSelectedFunction.addActionListener(e -> functionJList.getSelectedValue().launch());

    }
}
