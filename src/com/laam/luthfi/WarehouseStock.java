package com.laam.luthfi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class WarehouseStock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat indonesianRate = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols idrFormat = new DecimalFormatSymbols();

        idrFormat.setCurrencySymbol("Rp. ");
        idrFormat.setMonetaryDecimalSeparator('.');
        indonesianRate.setDecimalFormatSymbols(idrFormat);

        System.out.print("Masukkan nama anda : ");
        String userName = input.next();

        System.out.println("\nStok Gudang Input Barang");
        System.out.println("##########################\n");

        System.out.println("Selamat datang " + userName);

        System.out.print("\nMasukkan nama barang yang mau ditambah : ");
        String productName = input.next();

        System.out.print("\nMasukkan jumlah barang yang mau ditambah : ");
        int productQty = input.nextInt();

        System.out.print("\nMasukkan harga beli untuk barang yang mau ditambah : ");
        float productBuyPrice = input.nextFloat();

        System.out.print("\nMasukkan harga jual untuk barang yang mau ditambah : ");
        float productSellPrice = input.nextFloat();

        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("#############################\n");

        System.out.println("Nama Barang : " + productName);
        System.out.println("Jumlah Barang : " + productQty);
        System.out.println("Harga Beli : " + indonesianRate.format(productBuyPrice));
        System.out.println("Harga Jual : " + indonesianRate.format(productSellPrice));
    }
}
