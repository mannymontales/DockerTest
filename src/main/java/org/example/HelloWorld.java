package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello docker: ");
        int count = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("still here iterating through: " + count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Hello docker run pls");
    }
}

//review this link no src code in images?
//https://forums.docker.com/t/best-practices-for-git-clone-make-etc-via-dockerfile-run/79152/3

//for reference 
//https://learn.microsoft.com/en-us/windows/wsl/install
//https://learn.microsoft.com/en-us/windows/wsl/setup/environment
//https://learn.microsoft.com/en-us/windows/wsl/basic-commands
//https://learn.microsoft.com/en-us/windows/wsl/tutorials/wsl-containers 
