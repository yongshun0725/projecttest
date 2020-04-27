package edu.zzu.project26;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo02_Receive {

	public static void main(String[] args) throws Exception{
       DatagramSocket socket = new DatagramSocket(5555);
       DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
       while(true) {
    	   socket.receive(packet);
    	   byte[] arr = packet.getData();
    	   int len = packet.getLength();
    	   if("0000".equals(new String(arr,0 ,len))) {
    		   socket.close();
    		   break;
    	   }
    	   String ip = packet.getAddress().getHostAddress();
    	   int port = packet.getPort();
    	   System.out.println("IPÊÇ£º"+ip+"  ¶Ë¿Ú£º"+port+"   "+new String(arr,0 ,len));
       }
       
	}

}

