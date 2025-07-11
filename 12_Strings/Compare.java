public class Compare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if (s1 == s2) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        /* s1 and s2 are same */

        if (s1 == s3) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        /* s1 and s3 are not same */

        if (s1.equals(s3)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
        /* s1 and s3 are same */
    }
}

/*
 * == compares the reference. Thus s1 and s2 are same but s1 and s3 are not
 * same. If we use .equals() then both s1 and s3 are same because it compares
 * the content(values).
 */