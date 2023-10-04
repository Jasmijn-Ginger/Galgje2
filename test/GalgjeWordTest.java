import org.junit.jupiter.api.*;

import java.util.Arrays;



public class GalgjeWordTest {

    public String wordToBeGuessed;

    @BeforeEach
    public void setup(){
        wordToBeGuessed = "appeltjes";
    }

    @Test
    public void testDisplayGalgjeWord() {
        //Given
         char[] something = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
         GalgjeWord someone = new GalgjeWord(wordToBeGuessed);
        //When
        char[] result = someone.displayGalgjeWord();
        //Then
        Assertions.assertArrayEquals(something, result);
    }

//    @Test
//    public void


}
