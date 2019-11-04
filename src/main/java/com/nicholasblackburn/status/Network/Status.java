package com.nicholasblackburn.status.Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Status {

    // runs a ping to provided ip for 100 ms to calculate the tps
public static void status() throws UnknownHostException{

    String addr = "10.57.40.2"; // ip address of the roborio on the robot
     
    try{
        InetAddress address = InetAddress.getByName(addr);
        boolean reachable = address.isReachable(10000);

        System.out.println("Is host reachable? " + reachable);

    } 
    catch (Exception e){
        
        e.printStackTrace();
    }

    }

}