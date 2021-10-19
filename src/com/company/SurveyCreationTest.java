package com.company;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SurveyCreationTest {
    @Test
    public void checkSurveyCreation(){
        SurveyManager surveyManager = new SurveyManager();
        boolean isAbleToCreate = surveyManager.CheckSurveyCreationPossibility(-3);
        assertEquals(isAbleToCreate, false);
    }
}