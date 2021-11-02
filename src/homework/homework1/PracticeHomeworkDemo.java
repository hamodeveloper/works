package homework.homework1;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {


        PracticeHomework converter = new PracticeHomework();
        System.out.println(converter.convert(4));
        System.out.println(converter.calcAge(3));
        System.out.println(converter.nextNumber(1254));
        System.out.println(converter.isSameNum(1,1));
        System.out.println(converter.lessThanOrEqualToZero(-1));
        System.out.println(converter.reverseBool(false));

        int[] array1 = {2,2,2};
        int[] array2 = {2,2,2,2};

        System.out.println(converter.maxLength(array1,array2));


    }

}
