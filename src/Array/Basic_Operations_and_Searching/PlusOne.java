package Array.Basic_Operations_and_Searching;

/*
 Problem: Plus One (LeetCode #66)

 Goal
 - Given a non-empty array of decimal digits representing a non-negative integer, increment the integer by one and return the resulting digits array.
 - The most significant digit is at the head of the list, and each element contains a single digit.

 Contract
 - Input: int[] digits (length n ≥ 1), digits[i] ∈ [0..9]. No leading zeros unless the number is 0 itself.
 - Output: int[] (may be the same array if no reallocation needed, or a new array when carrying over increases length).
 - Time: O(n). Space: O(1) extra (ignoring a potential new output array when overflow occurs).

 Examples
 - Example 1: [1,2,3] → [1,2,4]
 - Example 2: [9] → [1,0]
 - Example 3: [9,9] → [1,0,0]
 - Example 4: [4,3,2,1] → [4,3,2,2]

 Approach (Process from End with Carry)
 - Start from the last digit and add one.
 - If the result is < 10, write back and return.
 - If it becomes 10, set current digit to 0 and carry 1 to the next higher digit; continue leftwards.
 - If all digits were 9 (carry remains after processing the most significant digit), allocate a new array of length n+1 with leading 1 followed by zeros.

 Edge Cases
 - Single zero input [0] → [1].
 - All nines: produces a longer result (n+1 digits).

 Pitfalls
 - Don’t convert to integer type (risk overflow for large n). Operate on digits directly.
 - Avoid unnecessary allocations; only allocate if carry remains after the most significant digit.
*/

// (LeetCode #66)
public class PlusOne {
    int[] plus(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]+=1;
            if(arr[i]!=10)
                break;
            arr[i]=0;
        }
        if(arr[0]==0) {
            int[] temp = new int[arr.length + 1];
            for (int i = temp.length-1; i>0  ; i--) {
                temp[i]=arr[i-1];
            }
            temp[0]=1;
            temp[1]=0;
            return temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={9,9,9};
        int[] temp=new PlusOne().plus(arr);
        System.out.println(temp.length);
        for(int a:temp){
            System.out.println(a);
        }
    }
}
