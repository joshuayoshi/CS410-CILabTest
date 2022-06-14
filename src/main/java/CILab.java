public class CILab implements CILabInterface {
    private String myString;

    /**
     * Returns the current string. If the string is null, it should return null.
     *
     * @return Current string
     */
    @Override
    public String getString() {
        return myString;
    }

    /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    @Override
    public void setString(String string) {
        myString = string;
    }

    /**
     *  We define the usage of capitals in a word to be right when one of the following cases holds:
     *  All letters in this word are capitals, like "USA".
     *  All letters in this word are not capitals, like "leetcode".
     *  Only the first letter in this word is capital, like "Google".
     * @return  Given a string word, return true if the usage of capitals in it is right.
     */
    @Override
    public boolean detectCapitalUse() {
    	boolean hasUppercaseAfterFirstCharacter = false;
    	boolean hasLowercaseAfterFirstCharacter = false;
    	boolean firstCharacterIsCapital = false;
    	//Return true if length of string is 1
    	if(myString.length() <= 1) return true;
    	for(int i = 1; i < myString.length(); i++) {
    		if(Character.isUpperCase(myString.charAt(i))) hasUppercaseAfterFirstCharacter = true;
    		if(Character.isLowerCase(myString.charAt(i))) hasLowercaseAfterFirstCharacter = true;
    	}
    	if(Character.isUpperCase(myString.charAt(0))) firstCharacterIsCapital = true;

    	//All capitals
    	if(firstCharacterIsCapital && !hasLowercaseAfterFirstCharacter) return true;
    	//Only first character capital 
    	else if (firstCharacterIsCapital && !hasUppercaseAfterFirstCharacter) return true;
    	//No capitals
    	else if (!firstCharacterIsCapital && !hasUppercaseAfterFirstCharacter) return true;
    	else return false;
    }

}

