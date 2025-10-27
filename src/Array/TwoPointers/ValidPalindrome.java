package Array.TwoPointers;

/**
 * Problem: Valid Palindrome (LeetCode 125)
 *
 * Goal:
 * - Determine if a string is a palindrome, considering only alphanumeric characters
 *   and ignoring cases.
 *
 * Core Idea (Two Pointers with Filtering):
 * - Use left and right pointers; move them inward while skipping non-alphanumeric characters.
 * - Compare lowercase versions of characters.
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(1)
 *
 * Examples:
 * 1) s = "A man, a plan, a canal: Panama" -> true
 * 2) s = "race a car" -> false
 * 3) s = " " -> true (empty after filtering)
 *
 * Edge Cases:
 * - Strings with punctuation and spaces
 * - Mixed case characters
 * - Empty or single-character strings
 *
 * Tips:
 * - Character.isLetterOrDigit and Character.toLowerCase help normalization.
 */
// LeetCode 125. Valid Palindrome
public class ValidPalindrome {
    boolean valid(String str){
        str=str.toLowerCase();
        int left=0,right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                if (!Character.isLetterOrDigit(str.charAt(left))){
                    left++;
                }
                else if (!Character.isLetterOrDigit(str.charAt(right))){
                    right--;
                }
                else
                    return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        String str = "A man, a plan, a canal: Panama";
        boolean result = obj.valid(str);
        System.out.println("Is the string a valid palindrome? " + result);
    }
}
