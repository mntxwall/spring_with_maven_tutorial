package com.wei.test;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Hello world!
 *
 */

/*class User{

}*/

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //int i = 0;
        final int JOB_QUEUE_SIZE = 10;

        //10 jobList
        List<Job> jobList = new ArrayList<>(JOB_QUEUE_SIZE);
        //List<Job> primList = new ArrayList<>(JOB_QUEUE_SIZE);

        Queue<Job> priorityQueue = new LinkedBlockingQueue<>(JOB_QUEUE_SIZE);
        Queue<Job> secondaryQueue = new LinkedBlockingQueue<>(JOB_QUEUE_SIZE);
        Queue<Job> tertiaryQueue = new LinkedBlockingQueue<>(JOB_QUEUE_SIZE);


        Thread jobProducter2 = new Thread(() ->{

            Job tmp;
            while (true){

                Scanner reader = new Scanner(System.in);
                System.out.println("Enter a priority");

                int n = reader.nextInt();

                switch (n){
                    case 1:
                        tmp = new Job("Priority Job");
                        priorityQueue.add(tmp);
                        break;
                    case 2:
                        tmp = new Job("Secondary Job");
                        secondaryQueue.add(tmp);
                        break;
                    default:
                        tmp = new Job("Thirdary Job");
                        tertiaryQueue.add(tmp);
                        break;
                }

                //call job schedule
            }
        });


        //List<String> l = new ArrayList<>(Arrays.asList("bee", "lion", "apple", "pie"));

        //System.out.println(String.format("l size is %d, and first ele is %s", l.size(), l.get(0)));

        //l.remove(0);

        //System.out.println(String.format("l size is %d, and first ele is %s", l.size(), l.get(0)));

        //List<Job> jobWaitingList = new ArrayList<>(10);

        ////Scanner reader = new Scanner(System.in);

        //System.out.println("Enter a number:");
        //int n = reader.nextInt();

        //System.out.println(n);

        ///m.run();
        //t2.run();

 /*       Thread p = new Thread(() ->{

            while (true){
                System.out.println("product a goods");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }

        });

        Thread p2 = new Thread(() ->{

            while (true){
                System.out.println("consume a goods");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        p.start();
        p2.start();
/*
        while (true){
            System.out.println(p.isAlive());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

*/


        //final int[] jobIndex = {1};


        //Job Producer
        Thread jobProudcer = new Thread(() ->{
            int jobIndex = 1;
            while (true){
                synchronized (jobList){
                    if(jobList.size() < JOB_QUEUE_SIZE){
                        Job a = new Job("job" + jobIndex);
                        jobList.add(a);
                        System.out.println("job" + jobIndex + " is added");
                        jobIndex = (++jobIndex) % JOB_QUEUE_SIZE ;
                    }

                }
                //wait for 10s to add another job;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        //jobProudcer.run();

        Thread customer = new Thread(() -> {


            while (true) {
            synchronized (jobList) {
                // System.out.println("Waiting for job");
                if (!jobList.isEmpty()) {
                    Job tmp = jobList.get(0);
                    Thread threadTmp = new Thread(tmp);
                    threadTmp.start();

                    while (threadTmp.isAlive()) {
                        //System.out.println("Wait job to finish!!");
                    }
                    System.out.println(tmp.getContent() + "is removed!");
                    jobList.remove(0);

                }
                //tmp.run();
            }

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }




        }

        });

        jobProudcer.start();
        customer.start();

       // customer.run();


    /*    List<User> l = new ArrayList<>();

        Runnable r = () ->{


            //i = i++;
            l.add(new User("John", 40));

            System.out.println("Hello");

        };

        Thread t = new Thread(() ->{System.out.println("BB");});

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("QQQQ");

            }
        };

        r.run();

        t.start();

        r2.run();*/
    }
}
