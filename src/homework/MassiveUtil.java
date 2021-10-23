package homework;

public class MassiveUtil {

    public static void main(String[] args) {


//   #1     char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//

//        for (int i = 0; i < bolola.length; i++) {
//            char c = 'o';
//            if (c == 'o') {
//                int count = 1;
//                count++;
//
//
//                System.out.print("Кол-во переменной c: " + count);
//                break;
//            }
//
//
//        }


// #2      char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//        char a = 'l';
//        char b = 'o';
//        for (int i = 0; i < bolola.length; i++) {
//            if (a == 'l') {
//                if (b == 'o') {
//                    System.out.println(a + " " + b);
//                    break;
//                }
//
//            }
//        }


// #3        int c = 'a';
//        char[] bolola = {'b','o','l','o','l','a'};
//
//            do{
//                System.out.println("false");
//
//            }while(c == 'j');
//


//  #4      char[] bolola = {'b','a','b','o','l','a'};
//        for (int i = 0; i < bolola.length; i++) {
//            char a = 'b';
//            char c = 'o';
//            if (c == 'o') {
//                int count = 1;
//                count++;
//                if(a == 'b'){
//                    int secondcount = 1;
//                    count++;
//
//                    System.out.println("true");
//                    break;
//                }
//
//            }
//
//        }

        char[] text = {' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' '};

        for (int i = 0; i < text.length; i++) {

            for (int j = 0; j < text.length; j++) {
                if (i != ' ') {
                    System.out.print(text[i]);
                    break;
                }

            }


        }
    }
}

