import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise10
{
   /* Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
    odd length from the set. */

    public static void main(String[] args)
    {
        String [] tilfældigeStrings = {"Emilie","ost","abekat","sne er lort", "Sneen holder mig indenfor"};

        Set<String> set = new HashSet<>(Arrays.asList(tilfældigeStrings));

        System.out.println("Mine strings: " + set);

        System.out.println("Mine strings efter metoden er blevet kaldt: " + removeOddLength(set));
    }

    private static Set removeOddLength (Set<String> set)
    {
        Iterator iterator = set.iterator();

        String ordet;

        while (iterator.hasNext())
        {
            ordet = iterator.next().toString();

            if (ordet.length() % 2 == 1)
            {
                iterator.remove();
            }
        }
        return set;
    }
}
