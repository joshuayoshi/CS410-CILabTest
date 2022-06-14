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
    	boolean flag = true;
    	//Check for all capitals
    	for(int i = 1; i < myString.length(); i++) {
    		if(Character.isLowerCase(myString.charAt(0))) {
    			flag = false;
    			break;
    		}
    	}
    	if(flag) return true;
    	//Check for all lowercase
    	for(int i = 1; i < myString.length(); i++) {
    		if(Character.isUpperCase(myString.charAt(0))) {
    			flag = false;
    			break;
    		}
    	}
    	if(flag) return true;
    	//Check for first character capitalized and remaining characters uncapitalized
    	if(Character.isUpperCase(myString.charAt(0))) {
    		for(int i = 1; i < myString.length(); i++) {
    			if(Character.isUpperCase(myString.charAt(0))) return false;
    		}
    	}
    	return true;
    }

}

