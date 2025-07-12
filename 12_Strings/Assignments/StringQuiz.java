public class StringQuiz {
    public static void quiz1() {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }

    public static void quiz2() {
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }

    public static void main(String args[]) {
        quiz1(); // output : false true
        quiz2(); // output : ApnaCoege
    }

}