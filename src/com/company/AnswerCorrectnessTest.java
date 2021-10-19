package com.company;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnswerCorrectnessTest {
    @Test
    public void checkAnswerCorrectness(){
        SurveyManager surveyManager = new SurveyManager();
        int patternNumber = 2;
        Pattern pattern = new Pattern(DataLoader.getPatternNameByIndex(2));
        boolean isCorrect = surveyManager.GetPatternCorrectness(patternNumber, pattern);

        assertEquals(isCorrect, true);
    }
}

