package pl.sda.openclose.open;

import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("pl.sda.openclose.open");
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(AdnotacjeIfunction.class);


        SwissArmyKnifeWindow swissArmyKnifeWindow = new SwissArmyKnifeWindow();
        CopyFileFunction copyFileFunction= new CopyFileFunction();
        QuitFunction quitFunction= new QuitFunction();
        DelateFileFunction delateFileFunction = new DelateFileFunction();
        CreateTextFileFunction createTextFileFunction = new CreateTextFileFunction();

        for (Class<?> aClass : typesAnnotatedWith){
            swissArmyKnifeWindow.addFunction((IFunction)aClass.newInstance());
        }
        swissArmyKnifeWindow.setVisible(true);




        swissArmyKnifeWindow.addFunction(new CopyFileFunction());
        swissArmyKnifeWindow.addFunction(new CreateTextFileFunction());
        swissArmyKnifeWindow.addFunction(new DelateFileFunction());
        swissArmyKnifeWindow.addFunction(new QuitFunction());



    }
}
