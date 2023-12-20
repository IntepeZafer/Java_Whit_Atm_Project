package com.mycompany.atmproject;

import java.util.Scanner;

public class AtmProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 10000;
        int miktar;
        int secim;
        System.out.println("*****************************************************************************");
        System.out.println("1-) Bakiye Öğrenme \n2-) Para Çekme \n3-) Para Yatırma \n4-) İşlemi Sonlandır");
        System.out.println("*****************************************************************************");
        while(true){
            System.out.print("\nİşleminizi Seçiniz: ");
            secim = scanner.nextInt(); 
            if(secim == 1){
                System.out.print("\nMevcut Bakiyeniz: " + bakiye);
            }else if(secim == 2){
                System.out.print("\nÇekmek İstediğiniz Miktarı Giriniz: ");
                miktar = scanner.nextInt();
                bakiye -= miktar;
                System.out.print("\nMevcut Bakiyeniz: " + bakiye);
            }else if(secim == 3){
                System.out.print("\nYatırmak İstediğiniz Miktarı Giriniz: ");
                miktar = scanner.nextInt();
                bakiye += miktar;
                System.out.print("\nMevcut Bakiyeniz: " + bakiye);
            }else{
                System.out.print("\nİşlem Sonlandırıldı.");
                break;
            }
        }
        
        
    }
}
