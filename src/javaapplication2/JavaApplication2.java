/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author toila
 */
import java.util.*;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       TourManagement tourManagement = new TourManagement();
       HotelManagement hotelManagement = new HotelManagement();
        for(;;)
        {   System.out.println("Input choice \n 1.Create a new tour package \n 2.View and update existing tours  \n 3.Delete a tour package"
                + "\n 4.Add new hotels  \n 5.Update and manage hotels \n 6.Remove a hotel ");
            int choice = sc.nextInt();
            if (choice == 1){
                tourManagement.createNewTourPackage();
            }
                if (choice == 2){
                    System.out.println("1.Search tours by destination, duration, or price.\n2."
                            + "Edit tour information: modify details, change pricing, or update inclusions/exclusions.");
                            int choice2 =sc.nextInt();
                            if (choice2 == 1)
                            {
                                tourManagement.searchTours();
                            }
                            if (choice2 == 2)
                            {
                                tourManagement.editTourInfomation();
                            }
                                
                    
                }
                if (choice == 3)
                {
                    tourManagement.removeTour();
                }
                if (choice == 4)
                {
                    hotelManagement.AddNewHoltel();
                }
                if(choice == 5)
                {
                    System.out.println("1.Search tours by location, amenities, or room availability.\n2."
                            + "Edit tour information: update room availability, change pricing, or edit amenities.");
                    int choice3 = sc.nextInt();
                    sc.nextLine();
                    if (choice3 == 1)
                    {
                        hotelManagement.searchHotel();
                    }
                    if(choice3 == 2)
                    {
                        hotelManagement.UpdateHotel();
                    }
                }
                if (choice == 6 )
                {
                    hotelManagement.removeHotel();
                }
        }
    }
//                if (choice == "3"){
//                f1();
//                
//            }
//                if (choice == "4"){
//                f1();
//            }
//                if (choice == "5"){
//                f1();
//                
//            }
//                if (choice == "6"){
//                f1();
//            }
//                if (choice == "7"){
//                f1();
//            }
//                if (choice == "8"){
//                f1();
//            }
//            
//                
//                if (choice == "9"){
//                f1();
//            }
//                if (choice == "10"){
//                f1();
//            }
//                else 
//                    System.out.println(" wrong");
//        }
//    }
//    public static void f1 ()
//    {
//        System.out.printf("Tour ID :");
//        
//    }
//    public static void f2 ()
//    {
//    }
//    public static void f3 ()
//    {
//    }
//    public static void f4 ()
//    {
//    }
//    public static void f5 ()
//    {
//    }
//    public static void f6 ()
//    {
//    }
//    public static void f7 ()
//    {
//    }
//    public static void f8 ()
//    {
//    }
//    public static void f9 ()
//    {
//    }
//    public static void f10 ()
//    {
//    }
    

    
}

