package org.example;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) {
        String url = "www.youtube.com";

        InetAddress address = null;

        try{
            address = Inet4Address.getByName(url);
            System.out.println("Address : "+ Arrays.toString(address.getAddress()));

            System.out.println("Host Address : "+address.getHostAddress());

            System.out.println("isANyLocalAddress : "+address.isAnyLocalAddress());

            System.out.println("isLinkLocalAddress : "+address.isLinkLocalAddress());

            System.out.println("is LoopBackAddress : "+address.isLoopbackAddress());

            System.out.println("isSiteLocalAddress : "+address.isSiteLocalAddress());

            System.out.println("hashCode : "+address.hashCode());
        }catch (UnknownHostException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }

    }
}