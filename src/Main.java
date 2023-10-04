import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //makes and prints new Galgjeword
        GalgjeWord new_word = new GalgjeWord();
        String x = new_word.wordToBeGuessed;
        System.out.println(x);



        //Update galgjewoord with new letter
        new_word.updateDisplayGalgjeWord();



    }



    //create new galgjewoord
//    public String getWordToBeGuessed() {
//        GalgjeWord new_word = new GalgjeWord();
//        String wordToBeGuessed = GalgjeWord.createGalgjeword();
//        return wordToBeGuessed;
//    }

}
