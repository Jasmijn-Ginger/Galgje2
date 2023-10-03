public class Main {
    public static void main(String[] args) {
        //create new galgjewoord
        GalgjeWord new_word = new GalgjeWord();
        String wordToBeGuessed = GalgjeWord.createGalgjeword();
        System.out.println(wordToBeGuessed);

        //display the word with empty spaces
        String[] progressWordToBeGuessed = GalgjeWord.displayGalgjeWord(wordToBeGuessed);
        System.out.println(String.join("", progressWordToBeGuessed));

        //GetInput
        InputUser new_input = new InputUser();
        String letter = new_input.getChosenLetter();
        System.out.println(letter);

        //Update galgjewoord with new letter
        char[] updated_word = new_word.updateDisplayGalgjeWord();
        System.out.println(updated_word);


    }
}
