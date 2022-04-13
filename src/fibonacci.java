import java.util.Arrays;

public class fibonacci{

    /*
This program executes fibonacci sequence of a given number and sum the even numbers that appeared in the sequence
 */
        public static void main(String[]args){
            int[]fibeven = new int[30];
            fibonacciSequence(fibeven);
            System.out.println("The Fibonacci for the input number are :"+ Arrays.toString(fibeven));
            //lets print all the even numbers..
            int count = 0;
            for (int j : fibeven) {
                if (j % 2 == 0) {
                    count += j;
                }
            }
            System.out.println("The Sum of even numbers appeared in the fibonacci sequence is :"+count);
        }
        public static void fibonacciSequence(int[]fibbo){
            fibbo[0]=0;
            fibbo [1]=1;
            for(int i= 2; i<fibbo.length;i++){
                fibbo[i] = fibbo[i-1] + fibbo[i - 2];
            }
        }
    }
    
