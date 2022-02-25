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
이 코드는 메시지 암호화 기능을 제공합니다!
MessageEncryptor.java 코드를 실행한 후, 암호화하고자 하는 메시지를 입력해주세요.
사용자가 지정한 경로에 지정한 이름의 텍스트 파일이 생성되며
메시지가 헥사 코드로 변환되어서 텍스트 파일에 기록됩니다.

훈련소에 간 공대 친구들을 위해 인편을 암호화해서 보내보세요.
무료한 시간을 보내고 있는 친구들에게 작은 재미를 선사할 수 있습니다!

기본적인 아스키 코드도 같이 알려주는 센스도 잊지 말아주세요 :)
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
    // 텍스트파일을 저장하기를 원하는 디렉토리 주소로 변경하세요
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