import java.util.*;
interface Exam{
    void showQuestion();
    void showScore();
}
public class OnlineExam implements Exam{
    Scanner sc=new Scanner(System.in);
    char ans;
    int score=0;
    @Override
    public void showQuestion(){
        System.out.println("Number of primitive data types in Java are?");
        System.out.println("a. 6");
        System.out.println("b. 7");
        System.out.println("c. 8");
        System.out.println("d. 9");
        System.out.println();
        ans=sc.next().charAt(0);
        if(ans=='c'){
            score++;
        }
        System.out.println();
        System.out.println("What is the size of float and double in java?");
        System.out.println("a. 32 and 64");
        System.out.println("b. 32 and 32");
        System.out.println("c. 64 and 64");
        System.out.println("d. 64 and 32");
        System.out.println();
        ans=sc.next().charAt(0);
        if(ans=='a'){
            score++;
        }
        System.out.println();
        System.out.println("Automatic type conversion is possible in which of the possible cases?");
        System.out.println("a. Byte to int");
        System.out.println("b. Int to long");
        System.out.println("c. Long to int");
        System.out.println("d. Short to int");
        System.out.println();
        ans=sc.next().charAt(0);
        if(ans=='b'){
            score++;
        }
        System.out.println();
        System.out.println("When an array is passed to a method, what does the method receive?");
        System.out.println("a. The reference of the array");
        System.out.println("b. A copy of the array");
        System.out.println("c. Length of the array");
        System.out.println("d. Copy of first element");
        System.out.println();
        ans=sc.next().charAt(0);
        if(ans=='a'){
            score++;
        }
        System.out.println();
    }
    @Override
    public void showScore(){
        System.out.println("Your Total Score: "+ score);
    }
    public static void main(String args[]){
        OnlineExam e=new OnlineExam();
        e.showQuestion();
        e.showScore();
    }
}