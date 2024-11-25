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
public class TourManagement extends ArrayList<Tour>{
    Scanner sc = new Scanner(System.in);
    public void createNewTourPackage()
    {
         System.out.println("Tour ID:");
                String TourID = sc.nextLine();
                System.out.println("Name");
                String name = sc.nextLine();
                System.out.println("Destination");
                String destination = sc.nextLine();
                System.out.println("Duration");
                String duration = sc.nextLine();
                System.out.println("Description");
                String description = sc.nextLine();
                System.out.println("Price (VND)");
                int price = sc.nextInt();
                Tour tour = new Tour(TourID,name,destination,duration,description,price);
                this.add(tour);
    }
    public void deleteTourPackage()
    {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
        System.out.println("Ban muon xoa tour nao?");
        int choice = sc.nextInt();
        sc.nextLine();
        this.remove(choice);
    }
    public void editTourInfomation()
    {    for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
        System.out.println("Nhap id tour");
        String Id = sc.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (isSame(Id, this.get(i).getTourID()))
            {
                System.out.println("1.name,2.destination,3.duration,4.description,5.price");
                int choice =sc.nextInt();
                sc.nextLine();
                switch (choice) {
                case 1 :
                System.out.println("New Name:");
                String newName = sc.nextLine();
                this.get(i).setName(newName);
                break;
                case 2:
                System.out.println("New destination");
                String newDes = sc.nextLine();
                this.get(i).setDestination(newDes);                break;

                case 3 :
                System.out.println("duration");
                String dura = sc.nextLine();
                this.get(i).setDuration(dura);                break;

                case 4 : 
                System.out.println("description");
                String scrip = sc.nextLine();
                this.get(i).setDescription(scrip);                break;

                case 5 :
                System.out.println("price");
                int pri = sc.nextInt();
                sc.nextLine();
                this.get(i).setPrice(pri);                break;
                default:
                    System.out.println("wrong");
            }
        }
        
    }
    
    
}
    public void removeTour ()
    {
        System.out.println("Nhap Id tour remove");
        String s1 = sc.nextLine();
        for (int i = 0; i < this.size(); i++) {
            if (isSame(this.get(i).getTourID(), s1))
            {
                this.remove(this.get(i));
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
    public void searchTours ()
    {   System.out.println("Ban muon nhap thong tin gi \n"
            + "1. destination\n2. duration\n3. price");
        int choice =sc.nextInt();
        sc.nextLine();
        if (choice == 1){
           System.out.println("destination : ");
        String s1 = sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (isSame(this.get(i).getDestination(),s1))
                    System.out.println(this.get(i).toString());
            }
        }
         if (choice == 2){
             System.out.println("duration : ");
            String s2 = sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (isSame(this.get(i).getDuration(),s2))
                    System.out.println(this.get(i).toString());
            }
        }
         if(choice == 3) {
                System.out.println("price");
         int pri = sc.nextInt();
         sc.nextLine();
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getPrice() == pri) {
                    System.out.println(this.get(i).toString());
                }
                    
                    
            }
        }  
    }
}


