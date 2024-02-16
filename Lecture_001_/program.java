package Lecture_001_;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        int s= 11_222_3333;
        String str = "qrqeq1";
        // boolean bb = str.length() >= 6 && str.charAt(5) == '1';
        // boolean bb = str.length() >= 6 & str.charAt(5) == '1';
        // boolean bb = str.length() >= 6 || str.charAt(5) == '1';
        boolean bb = str.length() >= 6 | str.charAt(5) == '1';

        System.out.println(bb);
        char ch = 'e';
        System.out.println(ch);
        System.out.println(++s); // ? = a-- - --a, ? = --a-a--
        System.out.println(getType(s));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(str);
        int a = 5;
        int b = 2;
        System.out.println(a | b);
        boolean c = true;
        boolean d = true;
        System.out.println(c & d);
        System.out.println(c && d);
//массив
        int[] arr = new int[10]; // int[] arr; int brr[];
        arr[3] = 8;
        System.out.println(arr[3]);
//2d массивы        
        int[] brr[] = new int[3][5];
        for (int[] line : brr) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }
// ввод из консоли
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Enter you name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        String adf = "2tttt";
        int x = 123;
        String q = adf+x;
        System.out.println(q);

        int p = 1, o = 2;
        int l = p + o;
        String res = String.format("%d + %d = %d \n", p, o, l);
        System.out.printf("%d + %d = %d \n", p, o, l);
        System.out.println(res);

        satHi();
        lib.satHi();

        int u = 1;
        int y = 2;
        int min = u < y ? y : u;
        System.out.println(min);

//цикл
       
        for (int i = 1; i < 10; i++) {
            if(i%2 == 0)
                continue;
            System.out.println(i);
        }
        

    }
    static void satHi(){
        System.out.println("hi");
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
