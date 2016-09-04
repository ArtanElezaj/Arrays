package nyc.c4q.nesada;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.print(Arrays.toString(sTa("Hello there!")));

    }

    public static char[] sTa(String in){

            char [] input = new char[in.length()];
            int i = 0;
                while (i<in.length()){

                    input[i]=in.charAt(i);
                    i++;
                }

        return input;
    }

}
