import java.util.Scanner;

public class InputUser {


    //Player chooses letter: chosenLetter
    public String getChosenLetter() {
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("\nWhich letter do you want to guess? ");
        String chosenLetter = ChooseALetter.next().toUpperCase();
        return chosenLetter;
    }


}
