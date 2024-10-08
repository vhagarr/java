 // SERVER Side
 import java.net.*;  
import java.io.*;  
class MyServer{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String str="",str2="";  
while(!str.equals("stop")){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();  
}}
 // CLIENT Side 
import java.net.*;  
import java.io.*;  
class MyClient{  
public static void main(String args[])throws Exception{  
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String str="",str2="";  
while(!str.equals("stop")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  
dout.close();  
s.close();  
}}
