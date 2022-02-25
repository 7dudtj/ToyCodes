/*
<en>
This code provides message encryption!
After executing the 'MessageEncryptor.java' code, please enter the message you want to encrypt.
A text file with a specified name is created in the path specified by the user.
The message is converted into a hexa code and written to the text file.

Encrypt message and send it to your friends who are major in engineering.
They will have fun decrypting!

Please don't forget the basic sense of teaching them Ascii code table. :)
A: 65, Z: 90, a: 97, z: 122, /s: 32


<kr>
�� �ڵ�� �޽��� ��ȣȭ ����� �����մϴ�!
MessageEncryptor.java �ڵ带 ������ ��, ��ȣȭ�ϰ��� �ϴ� �޽����� �Է����ּ���.
����ڰ� ������ ��ο� ������ �̸��� �ؽ�Ʈ ������ �����Ǹ�
�޽����� ��� �ڵ�� ��ȯ�Ǿ �ؽ�Ʈ ���Ͽ� ��ϵ˴ϴ�.

�Ʒüҿ� �� ���� ģ������ ���� ������ ��ȣȭ�ؼ� ����������.
������ �ð��� ������ �ִ� ģ���鿡�� ���� ��̸� ������ �� �ֽ��ϴ�!

�⺻���� �ƽ�Ű �ڵ嵵 ���� �˷��ִ� ������ ���� �����ּ��� :)
A: 65, Z: 90, a: 97, z: 122, /s: 32
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class MessageEncryptor {
	public static void main(String args[]) throws IOException	{
    // Change directory address where you want to store text file
    // �ؽ�Ʈ������ �����ϱ⸦ ���ϴ� ���丮 �ּҷ� �����ϼ���
    File file = new File("C:/Users/Username/Desktop/encmsg.txt"); // example

    // set needed variables and get values
    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter contents of message: ");
    String msg = br.readLine();
    char[] c = msg.toCharArray();

    // make encrypted message
    for (int i = 0; i < c.length; i++){
         writer.write(Integer.toHexString((int)c[i])+" ");
    }
    writer.close();
    br.close();
    return;
  }
}