public class GalgjeWord {

    private static final String wordToBeGuessed = createGalgjeword();
    private static final char[] arrayWordToBeGuessed = wordToBeGuessed.toCharArray();

    //Creates the word that needs to be guessed
    public static String createGalgjeword() {
        String[] listOfWords = {"Adequate", "Anywhere", "Approach", "Activity", "Anything", "Approval", "Advanced", "Although", "Academic", "Advocate", "Accident", "Athletic", "Aircraft", "Activist", "Actually", "Accurate", "Apparent", "Argument", "Analysis", "Audience", "Announce", "Alliance", "Artistic", "Addition", "Absolute", "Attitude", "Birthday", "Behavior", "Bathroom", "Boundary", "Building", "Business", "Capacity", "Champion", "Campaign", "Convince", "Conflict", "Changing", "Ceremony", "Clothing", "Category", "Complain", "Complete", "Computer", "Coverage", "Creative", "Confront", "Conclude", "Civilian", "Concrete", "Critical", "Criminal", "Clinical", "Collapse", "Customer", "Contract", "Consumer", "Consider", "Cultural", "Criteria", "Constant", "Creature", "Creation", "Continue", "Contrast", "Delivery", "Discover", "Directly", "Darkness", "Document", "Dramatic", "Daughter", "Describe", "Division", "Distinct", "Distance", "Decision", "District", "Decrease", "Director", "Dominant", "Dominate", "Designer", "Disorder", "Dialogue", "Detailed", "Disagree", "Disaster", "Exchange", "Everyday", "Exciting", "Exposure", "Exercise", "Existing", "External", "Employer", "Employee", "Emphasis", "Economic", "Everyone", "Evidence", "Electric", "Entirely", "Educator", "Evaluate", "Estimate", "Entrance", "Enormous", "Emission", "Engineer", "Earnings", "Frequent", "Facility", "Fighting", "Friendly", "Favorite", "Familiar", "Football", "Function", "Graduate", "Generate", "Greatest", "Historic", "Hospital", "Headline", "Heritage", "Identify", "Involved", "Industry", "Identity", "Incident", "Investor", "Indicate", "Instance", "Increase", "Innocent", "Interest", "Internal", "Internet", "Judgment", "Lifetime", "Literary", "Language", "Location", "Learning", "Magazine", "Majority", "Movement", "Military", "Minority", "Moreover", "Multiple", "Mortgage", "Musician", "Marriage", "Moderate", "Material", "Mountain", "Maintain", "Neighbor", "Normally", "Negative", "Northern", "Numerous", "National", "Organize", "Official", "Overlook", "Overcome", "Observer", "Opponent", "Ordinary", "Occasion", "Opposite", "Operator", "Original", "Physical", "Probably", "Publicly", "Powerful", "Purchase", "Possibly", "Properly", "Property", "Province", "Platform", "Perceive", "Prospect", "Provider", "Practice", "Priority", "Preserve", "Producer", "Proposed", "Positive", "Previous", "Proposal", "Presence", "Possible", "Politics", "Painting", "Pregnant", "Progress", "Persuade", "Planning", "Personal", "Pleasure", "Portrait", "Position", "Prisoner", "Pressure", "Question", "Recovery", "Remember", "Recently", "Research", "Resemble", "Romantic", "Relative", "Relevant", "Resource", "Response", "Reporter", "Reaction", "Regulate", "Resident", "Register", "Regional", "Religion", "Relation", "Sequence", "Specific", "Somewhat", "Somebody", "Shopping", "Slightly", "Survival", "Survivor", "Software", "Schedule", "Supposed", "Suddenly", "Security", "Shoulder", "Strongly", "Strength", "Strategy", "Straight", "Spending", "Shooting", "Southern", "Standard", "Scenario", "Surprise", "Separate", "Struggle", "Sentence", "Standing", "Sanction", "Stranger", "Surround", "Solution", "Thinking", "Teaching", "Tendency", "Tomorrow", "Together", "Thousand", "Threaten", "Transfer", "Terrible", "Teaspoon", "Teenager", "Training", "Unlikely", "Universe", "Ultimate", "Vacation", "Valuable", "Variable", "Workshop", "Withdraw", "Whatever", "Whenever", "Yourself"};
        int random_int = (int) Math.floor(Math.random() * (listOfWords.length - 0 + 1));
        return listOfWords[random_int].toUpperCase();
    }
    //ToDo: change Math.random to suggestion Glen


    //Displaying word that needs to be guessed
    public static String[] displayGalgjeWord(String word) {
        String[] displayedWord = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            displayedWord[i] = "_";
        }
        return displayedWord;
    }

    //Checking where in the word the letter is and filling it in the display word
    public char[] updateDisplayGalgjeWord() {
        InputUser inputUser = new InputUser();
        String chosenLetter = inputUser.getChosenLetter();
        char charChosenLetter = chosenLetter.charAt(0);
        for (int i = 0; i < arrayWordToBeGuessed.length; i++) {
            if (arrayWordToBeGuessed[i] == charChosenLetter) {
                displayGalgjeWord(wordToBeGuessed)[i] = chosenLetter;
            }
        }
        return arrayWordToBeGuessed;
    }




}
