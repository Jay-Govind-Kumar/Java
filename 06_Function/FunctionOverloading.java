import java.util.*;

public class FunctionOverloading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.0f,2.0f));
        System.out.println(add(1.0f,2.0f,3.0f));

        sc.close();
    }

    public static int add(int num1, int num2){                      // 1
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3){            // 2
        return num1 + num2 + num3;
    }

    public static float add(float num1, float num2){                // 3
        return num1 + num2;
    }

    public static float add(float num1, float num2, float num3){    // 4    
        return num1 + num2 + num3;
    }
}

/* 1 & 2 are function overloading with different number of parameters. But 3 & 4 are function overloading with different data type. */