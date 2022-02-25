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
�� �ڵ�� ������ ������ ���� ���� ����� �����մϴ�!
Random9x9Generator.java �ڵ带 ������ ��, ������� �ϴ� ���� ���� �Է����ּ���.
�� ��, �� ���� ����� ������ �Է����ּ���.
����ڰ� ������ ��ο� ������ �̸��� �ؽ�Ʈ ������ �����Ǹ�
������ ������ �������� �ؽ�Ʈ ���Ͽ� ��ϵ˴ϴ�.

���� ���� ������ ������ ������ ���� ���� ������ ��������.
���� ������ ������ ������ ������ ���� �� �ֽ��ϴ�!

1���� �������� ������, 3���� �����ϸ� ���⿡ �����ϴ�.
������ ���� ÷���ص帮�� �ʽ��ϴ�! :)
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
        // �ؽ�Ʈ������ �����ϱ⸦ ���ϴ� ���丮 �ּҷ� �����ϼ���
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
        String answer = first+"��"+second+"=";
        return answer;
  }
}
