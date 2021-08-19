
/**
 * Write a description of class LoopsChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopsChallenge
{
    /**
     * Given a string and a non-negative integer n, return a larger string 
     * that is n copies of the original string.
     * 
     * Examples:
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */
    public static String stringTimes(String str, int n) {
        String retVal = "";
        for(int i = 0; i < n; i++) {
            retVal += str;
        }
        return retVal;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that 
     * overlapping is allowed, so "xxx" contains 2 "xx".
     * 
     * Examples:
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     */
    public static int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Return true if the given string contains a "bob" string, but where the 
     * middle 'o' char can be any char.
     * 
     * Examples:
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     */
    public static boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in 
     * the given string, except we'll accept any letter for the 'd', so 
     * "cope" and "cooe" count.
     * 
     * Examples:
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */
    public static int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 3; i++) {
            if(str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
                i = i + 3;
            }
        }
        return count;
    }

    /**
     * We'll say that a string is xy-balanced if for all the "x" characters 
     * in the string, there exists a "y" character somewhere later in the 
     * string. So "xxy" is balanced, but "xyx" is not. One "y" can balance 
     * multiple "x"s. A string without any "x"s is balanced by default, since 
     * there are no "x"s to unbalance it. Return true if the given string is 
     * xy-balanced.
     * 
     * Examples:
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("bbb") → true
     */
    public static boolean xyBalance(String str) {
        boolean balanced = true;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') {
                balanced = false;
            } else if(str.charAt(i) == 'y') {
                balanced = true;
            }
        }
        return balanced;
    }
}
