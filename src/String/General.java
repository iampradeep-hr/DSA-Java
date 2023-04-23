package String;

public class General {

    //reverse a string
    public static void reverseString1(String str){
        //1) convert to char[]
//        char[] c=str.toCharArray();
//        for (int i=c.length-1;i>=0;i--){
//            System.out.print(c[i]);
//        }

        //2) using charAt()
//        for (int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }

        //3) using StringBuffer
//        StringBuffer stringBuffer=new StringBuffer(str);
//        System.out.println(stringBuffer.reverse());

        //4) using StringBuilder
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

    public static void main(String[] args) {

        reverseString1("hello");

    }
}
