/**
 * Created by Gjvon on 8/31/16.
 */
public class Palindromes {

    public boolean doSort(char[] array, int start, int end)
    {
        /*If statement is also our base case.
        If the start of the array is equal to the end of the array, return true. We remember that
        palindromes have equal sides left and right. So there will be an index where they meet at equal values.
        We imagine the word "eevee." The 'v' is where start and finish will equal 3. If the recursion has come this
        far, we should return true because this character will determine if we have a palindrome. */
        if(start == end)
        {
            return true;
        }
        /*This if statement makes sure the value at the starting index is equal to the value at the ending index.
         * If this is true, a recursion is implemented. If this is not true, we instantly return false.
         * Notice that our start and ending values change. As we search through our array for comparisons,
         * we must make sure we have a recursive case that keeps building upon towards our solution.
         * What is meant by "building upon the solution":
         * In the example I gave for a string "eevee" we start at 1 and end at 5. We start at element 1 and end at
         * element 5. We want to hit the base case, so we need the start and end to equal 3.
         * To achieve this logic, we add to start and subtract from end.
          * */
        if(array[start - 1] == array[end - 1])
        {
            return doSort(array, start + 1, end - 1);
        }
        else{
            ///Also a base case. If relevant, false will be returned when elements are not equal; breaking the
            ///breaking the recursion.
            return false;
        }
    }
}
