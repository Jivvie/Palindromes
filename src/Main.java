public class Main {

    public static void main(String[] args) {
        String pokemon = "eevee";
        /// build array based on string characters
        char[] array = pokemon.toCharArray();
        Palindromes pali = new Palindromes();
        boolean isPali = pali.doSort(array, 1, array.length);
        if(isPali)
        {
            System.out.println(pokemon + " is a Palindrome.");
        }
        else {
            System.out.println(pokemon + " is not a Palindrome.");

        }
    }
}
