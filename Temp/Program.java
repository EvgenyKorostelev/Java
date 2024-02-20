public class Program {
    public static void main(String[] args) {
    for (int i = 2; i <= 1000; i++) {
        int count = 1 + i;
        int countNext = count;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                countNext++;
            }
            
        }
        if (count == countNext)
            System.out.println(i);
    }
}



//         int z = 0;
//         System.out.println(countNTriangle(z));

//     }

    // static int countNTriangle(int n){

    //     int result = (n*(n + 1))/2;
    //     return n < 1 ? -1 : result;
    //     }


}




//=========================================================
// class Answer {
//     public void printPrimeNums() {
//         // Напишите свое решение ниже
//         for (int i = 2; i <= 1000; i++) {
//             int count = 1 + i;
//             int countNext = count;
//             for (int j = 2; i <= i / 2; j++) {
//                 if (i % j == 0) {
//                     countNext++;
//                 }
//             }
//             if (count == countNext)
//                 System.out.println(i);
//         }
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer {
//     public static void main(String[] args) {

//         Answer ans = new Answer();
//         ans.printPrimeNums();
//     }
// }    
