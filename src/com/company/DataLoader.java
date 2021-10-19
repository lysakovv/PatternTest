package com.company;

import java.awt.*;
import java.io.*;
import java.net.URL;

public class DataLoader {

    private static String[] answers = {
            "Наблюдатель(Observer)",
            "Состояние(State)",
            "Шаблонный метод(Template Method)",
            "Посетитель(Visitor)",
            "Абстрактная фабрика(Abstract factory)"
    };

    public static Pattern loadPatternByIndex(int index) {
        if (index - 1 > answers.length){
            return null;
        }
        URL url = DataLoader.class.getResource("Patterns/Pattern" + index + ".jpg");
        File file = new File(url.getPath());

        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException e) {
            System.out.println("Паттерна под данным индексом не существует");
            return null;
        }

        return new Pattern(getPatternNameByIndex(index));
    }

    public static void printAnswers() {
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + answers[i]);
        }
        System.out.println();
    }

    public static String getPatternNameByIndex(int index) {
        if (index - 1 > answers.length || index <= 0) {
            return "";
        } else {
            return answers[index - 1];
        }
    }
}
