/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * ReclamationProject class is used to solve something.
 */
public class ReclamationProject {
    /**
     *
     * @param a is a string input.
     * @param b is a string input.
     * @return a string as result
     */
    static String doit(final String a, final String b) {
        String a1;
        String b1;
        if (a.length() > b.length()) {
            a1 = b;
            b1 = a;
        } else {
            a1 = a;
            b1 = b;
        }
        String r = "";

        /*
         * For loop with i
         */
        for (int i = 0; i < a1.length(); i++) {
            for (int j = a1.length() - i; j > 0; j--) {
                for (int k = 0; k < b1.length() - j; k++) {
                    if (a1.regionMatches(i, b1, k, j) && j > r.length()) {
                       r = a1.substring(i, i + j);
                    }
                 }
            }
        }
        return r;
    }
}
