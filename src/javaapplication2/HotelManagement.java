/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toila
 */
public class HotelManagement extends ArrayList <Hotel> {
    Scanner sc = new Scanner(System.in);
    public void AddNewHoltel ()
    {
        System.out.println("hotelID");
        String hotelID = sc.nextLine();
        System.out.println("name");
        String name = sc.nextLine();
        System.out.println("location");
        String location = sc.nextLine();
        System.out.println("avaliableRooms");
        String avaliableRooms = sc.nextLine();
        System.out.println("amenities");
        String amenities = sc.nextLine();
        System.out.println("pricing");
        String pricing = sc.nextLine();
        Hotel a = new Hotel(hotelID, name, location, avaliableRooms, amenities, pricing);
        this.add(a);
    }
    public void searchHotel ()
    {   System.out.println("Ban muon nhap thong tin gi \n"
            + "1. location\n2. amenities\n3. room availability.");
        int choice =sc.nextInt();
        sc.nextLine();
        if (choice == 1){
           System.out.println(" location: ");
        String s1 = sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (isSame(this.get(i).getLocation(),s1))
                    System.out.println(this.get(i).toString());
            }
        }
         if (choice == 2){
             System.out.println("amenities : ");
            String s2 = sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (isSame(this.get(i).getAmenities(),s2))
                    System.out.println(this.get(i).toString());
            }
        }
         if(choice == 3) {
               System.out.println("room availability : ");
            String s3 = sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (isSame(this.get(i).getAvaliableRooms(),s3))
                    System.out.println(this.get(i).toString());
        }  
    }
    }
     private boolean isSame (String s1, String s2)
    {   
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
     public void UpdateHotel()
     {  
         System.out.println("Nhap Id Hotel");
         String s1 = sc.nextLine();
         for (int i = 0; i < this.size(); i++) {
             if(isSame(this.get(i).getHotelID(), s1))
             {
                 System.out.println("Ban muon update cai gi ? \n 1.room availability \n2.change pricing\n3. amenities.");
         int choice = sc.nextInt();
         if(choice == 1)
         {
             System.out.println("Nhap room availability");
             String st = sc.nextLine();
             this.get(i).setAvaliableRooms(sc.nextLine());
         }
         if(choice == 2 )
         {
             System.out.println("Nhap change pricing");
             String st = sc.nextLine();
             this.get(i).setPricing(sc.nextLine());
         }
         if(choice == 3 )
         {
             System.out.println("Nhap amenities");
             String st = sc.nextLine();
             this.get(i).setAmenities(sc.nextLine());
         }
             }
             
         }
         
     }
     public void removeHotel ()
     {
         System.out.println("Nhap Id hotel");
         String str = sc.nextLine();
         for (int i = 0; i < this.size(); i++) {
             if (isSame(this.get(i).getHotelID(), str))
             {
                 this.remove(this.get(i));
             }
             
         }
     }
}
