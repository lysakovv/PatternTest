package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SurveyManager surveyManager = new SurveyManager();
        System.out.println("Опрос из скольки паттернов желаете получить?");
        Scanner scanner = new Scanner(System.in);
        surveyManager.startSurvey(scanner.nextInt());
    }
}
