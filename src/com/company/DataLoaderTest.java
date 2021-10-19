package com.company;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataLoaderTest {
    @Test
    public void checkPatternExistence(){
        Pattern pattern = DataLoader.loadPatternByIndex(50);
        assertEquals(pattern, null);
    }
}
