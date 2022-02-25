/*
<en>
This code provides random times table problem generation!
After executing the 'Random9x9Generator.java' code, 
please enter the number of problems you want to create.
After that, please enter how many columns you want to print out.
A text file with a specified name is created in the path specified by the user.
Random times table problems are written in a text file.

Create many problems through easy and fast randomized multiplication tables.
You can make times table homeworks and exams easily and quickly!

It doesn't create the first level, but it looks good if you create it in three rows.
I don't attach the answer separately! :)


<kr>
이 코드는 무작위 구구단 문제 생성 기능을 제공합니다!
Random9x9Generator.java 코드를 실행한 후, 만들고자 하는 문제 수를 입력해주세요.
그 후, 몇 열로 출력할 것인지 입력해주세요.
사용자가 지정한 경로에 지정한 이름의 텍스트 파일이 생성되며
무작위 구구단 문제들이 텍스트 파일에 기록됩니다.

쉽고 빠른 무작위 구구단 생성을 통해 많은 문제를 만들어보세요.
쉽고 빠르게 구구단 숙제와 시험을 만들 수 있습니다!

1단은 생성하지 않으며, 3열로 생성하면 보기에 좋습니다.
정답은 따로 첨부해드리지 않습니다! :)
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Random9x9Generator {
    static Random rand;
    public static void main(String args[]) throws IOException	{
        // Change directory address where you want to store text file
        // 텍스트파일을 저장하기를 원하는 디렉토리 주소로 변경하세요
        File file = new File("C:/Users/Username/Desktop/rand99.txt"); // example

        // set needed variables and get values
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of questions: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns: ");
        int col = Integer.parseInt(br.readLine());

        // make random 9x9
        for (int i = 1; i <= n; i++){
            writer.write(rand99()+"    ");
            if (i%col == 0) writer.write('\n');
        }
        writer.close();
        br.close();
        return;
    }

    // function for generating random times table
    private static String rand99(){
        rand = new Random();
        int first = rand.nextInt(8) + 2;
        int second = rand.nextInt(8) + 2;
        String answer = first+"×"+second+"=";
        return answer;
  }
}
