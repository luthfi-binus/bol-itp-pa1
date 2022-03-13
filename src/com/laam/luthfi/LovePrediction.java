package com.laam.luthfi;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LovePrediction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Diprogram Ramalan Cupu");
        System.out.println("*************************************\n");

        // Your data
        System.out.println("Data Anda");

        System.out.print("Masukkan Nama Anda : ");
        String yourName = input.next();

        System.out.print("Masukkan Umur Anda : ");
        int yourAge = input.nextInt();

        // Partner data
        System.out.println("\nData Pasangan Anda");

        System.out.print("Masukkan Nama Pasangan Anda : ");
        String yourPartnerName = input.next();

        System.out.print("Masukkan Umur Pasangan Anda : ");
        int yourPartnerAge = input.nextInt();

        System.out.println();

        System.out.println(yourName + "[" + yourAge + "] tahun");
        System.out.println("X");
        System.out.println(yourPartnerName + "[" + yourPartnerAge + "] tahun");

        System.out.println("\nLoading...");
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DecimalFormat df = new DecimalFormat("0.00");
        Random rand = new Random();
        int max = 100;
        int min = 50;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        String suitablePercentage = df.format(randomNum / 1.1);

        System.out.println("\nKecocokan  anda ddengan pasangan anda adalah : " + suitablePercentage + "%");
        System.out.println("\nTerima Kasih karena anda telahh menggunakan jasa ramalan kami... ^^v");
    }
}
