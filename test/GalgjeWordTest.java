import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;



public class GalgjeWordTest {

    public String wordToBeGuessed;

    @BeforeAll
    public void setup(){
        wordToBeGuessed = "appeltjes";
    }

    @Test
    public void testDisplayGalgjeWord() {
        String[] something = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
        Assertions.assertArrayEquals(something, GalgjeWord.displayGalgjeWord(wordToBeGuessed));
    }


}
