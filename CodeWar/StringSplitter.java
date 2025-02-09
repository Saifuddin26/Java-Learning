import java.util.ArrayList;
import java.util.List;

public class StringSplitter{
    public static String[] stringSplit(String str)
    {
        if(str == null || str.isEmpty())
        {
            return new String[0];
        }
        List<String> result = new ArrayList<>();
        for(var i = 0; i < str.length(); i+=2)
        {
            if(i + 1 < str.length())
            {
                result.add(str.substring(i, i+2));
            }
            else{
                result.add(str.substring(i) + "_");
            }
        }
        return result.toArray(new String[0]);
    }
    public static void main (String [] args)
    {
        String[] output1 = stringSplit("abc");
        String[] output2 = stringSplit("abcde");
        String[] output3 = stringSplit("");
        System.out.println(java.util.Arrays.toString(output1));
        System.out.println(java.util.Arrays.toString(output2));
        System.out.println(java.util.Arrays.toString(output3));

    }

}

// HERE I USED LIST RETURN TYPE AND LEARNED HOW TO USE LIST<STRING> AND RETURN NEW ARRAYLIST<>();
/*
public class StringSplitter {
    public static List<String> splitString(String str) {
        // Step 1: Check if the input is null or empty
        if (str == null || str.isEmpty()) {
            return new ArrayList<>(); // Return an empty array if input is invalid
        }

        // Step 2: Create a list to store the pairs
        List<String> result = new ArrayList<>();

        // Step 3: Iterate over the string in steps of 2
        for (int i = 0; i < str.length(); i += 2) {
            // Step 4: Check if there's a next character available
            if (i + 1 < str.length()) {
                result.add(str.substring(i, i + 2)); // Add a pair of characters
            } else {
                result.add(str.substring(i) + "_"); // If it's the last single character, add "_"
            }
        }

        // Step 5: Convert the list into an array and return
        return result;

    }

    public static void main(String[] args) {
        // Testing the function
        List<String> output1 = splitString("abc");

        // Printing the results
        System.out.println(output1); // Expected: ["ab", "c_"]
    }
}
*/

/*
short logic/clever coding but now fully optimized.U
if(str.length % 2 == 1) s+ = "_";
int n = s.length/2;
String [] sub = new String[n];
for( var i = 0; i < n; ++i)
sub[i] =  "" + s.CharAt(i*2) + s.CharAt(1+i*2);
return sub;
 */
