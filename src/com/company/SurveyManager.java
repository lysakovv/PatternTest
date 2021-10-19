package com.company;

import java.util.Scanner;

public class SurveyManager {

    public void startSurvey(int count){

        if (CheckSurveyCreationPossibility(count) == false){
            System.out.println("Недопустимое количество вопросов");
            return;
        }

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= count; i++) {
            Pattern pattern = DataLoader.loadPatternByIndex(i);

            if (pattern == null){
                return;
            }

            System.out.println("Выберите название паттерна из списка(0 - для выхода):");
            DataLoader.printAnswers();

            int id = in.nextInt();

            while (GetPatternCorrectness(id, pattern) == false){
                if (id == 0){
                    return;
                }
                System.out.println("Неверно, подумайте еще");
                id = in.nextInt();
            }

            System.out.println("Верно");
        }
    }

    public boolean CheckSurveyCreationPossibility(int count){
        return count > 0;
    }

    public boolean GetPatternCorrectness(int id, Pattern pattern){
        return DataLoader.getPatternNameByIndex(id).equals(pattern.getName());
    }
}
