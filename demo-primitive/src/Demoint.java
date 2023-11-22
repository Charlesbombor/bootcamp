public class DemoInt {
    public static void main(String[] args) {
        //"  " -> String
        // number
            System.out.println("2 abc");
            System.out.println(2);
            System.out.println(2.3);

        // monthlySalary and i are both "variable" 變量
            int monthlySalary = 2000;
        // If we do not use monthlySalary, VS shows underline. But still can run the code

            int i = 4;
        // "int age" --> Declaration, int -> "integer"
        // age = 30 -> Assignment, assign the integer value 30 to the variable
        int age = 30;
            int sum;

            int level; // Declaration
            level = 1; // Assignment
            level = 10; // Re-assignment
            sum = age / level - i;
            System.out.print("monthly\nSalary: "+ monthlySalary);
        // \n also can change line    
            System.out.println (" Level: " + level);
            System.out.println(sum);

            level = level +3; // 13
            level += 3; // 16

            level = level - 7; // 9
            level -= 7; // 2

            level = level * 3; // 6
            level *= 3; // 18

            level = level / 2; //9
            level /= 2; // 4, skip all number after 小數點

            int num;
            num =10;
            //num = num + 2 - num--; // 2
            System.out.print("num:");
            System.out.println(num +2 - num--);
            System.out.println(num + 2 - num--);
            System.out.println("numnum:" + num);
            System.out.println(level); //4

            level = level + 1; 
            System.out.println(level);
            level++;
            System.out.println(level);
            ++level;
            System.out.println(level);

            level =level -1;
            level --;
            --level; 

            //the remainder of 5/2 -> 1
            int remainder = 5 % 2; // 1
            System.out.println(remainder);

            int result = 5 + 3 / 2 % 3;
            System.out.println("result=" + result);

            float ans = ++result + 3 / 2f % 3;
            System.out.println("ans:" + ans);

            // There are 4 ways to store 整數
            // byte, short, int, long (primitive)
            byte b = -128; // from -128 to 127
            byte b2 = 127;
            //byte b3 = 128; // 128 is out of range of integer value that can be stored in byte

            short s = -32768;
            short s2 = 32767;
            // short s3 = 32768;

            // int range (-2147483648 to 2147483647)
            int i1 = -2147483648;
            int i2 = 2147483647;
            // int i3 = 2147483648; 

            // long l0 = 2147483648; // 2147482648 is int presentation, but out of range
                                    //  Java assume the right hand side is int, 
                                    // in this case, the value is out of range
            long l1 = -9223372036854775808L;  // notation L -> long value
            int i5 = 100; // The value 100 has no notation -> default it is an in value
            byte b4 = 100;  // Java implicitly convert the int to byte
            short s4 = 100; // Java implicitly convert the int to short


            l1 = l1 + 10L;
            System.out.println(l1); // -9223372036854775798
    }
}
