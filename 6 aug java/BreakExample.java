// public class BreakExample {
//     public static void main(String[] args) {
//         for (int i = 1; i < 3; i++) {
//             for (int j = 1; j < 10; j++) {
//                 System.out.println("j= " + j);
//                 if (j == 5) {
//                     break;
//                 }
//             }
//         }
//     }
// }

// labelled break
public class BreakExample {
    public static void main(String[] args) {
        first: for (int i = 1; i < 3; i++) { // first is a label
            for (int j = 1; j < 10; j++) {
                System.out.println("j= " + j);
                if (j == 5) {
                    break first; // it will get out of the code block which is labelled 'first'
                }
            }
        }
    }
}