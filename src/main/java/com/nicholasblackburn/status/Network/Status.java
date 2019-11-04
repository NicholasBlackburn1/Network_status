package com.nicholasblackburn.status.Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Status {

    public boolean reachable; 

    public String addr = "10.57.40.2"; // ip address of the roborio on the robot

    public String status;



    // runs a ping to provided ip for 100 ms to calculate the tps
    public void status() throws UnknownHostException {

        try {

            InetAddress address = InetAddress.getByName(addr);
            reachable = address.isReachable(10000);

            if(reachable == true){
                status = "is reachable";

            }else{
                status = "Not reachable";

            }

    } 
    catch (Exception e){
        
        e.printStackTrace();
    }

    }

}