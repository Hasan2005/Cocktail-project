
package com.mycompany.cocktail;
import basaeclasses.Ingredient;
import colors.RGB;
import container.*;
import exceptions.blender.*;
import fruits.*;
import liquids.Milk;
import interfaces.MixtureInfo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cocktail {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        ArrayList<Ingredient>ing = new ArrayList<>();
        Apple a = new Apple();
        Mango m = new Mango();
        ing.add(a);
        ing.add(m);
        Blender blender = new Blender(ing);
        blender.getInfo();
        
//        System.out.println("welcome to our restaurant,  please place your order" );
//        while(true){
//            
//            System.out.println("enter 1 to start with your order");   
//            int choice = read.nextInt();
//            
//            
//            switch(choice)
//            {
//                case 1:
//                    System.out.println("choose the cups size:\n"
//                            + "1. small (100 ml)\n"
//                            + "2. medium (200 ml)\n"
//                            + "3. large (300 ml)\n");
//                    
//                    int cupsize = read.nextInt();
//                    switch(cupsize)
//                    {
//                        case 1:
//                            System.out.println("enter the number of cups, you can choose at maximmum 12 cup");
//                            int numberOfCups = read.nextInt();
//                            while(numberOfCups <0 && numberOfCups >12 )
//                            {
//                                System.out.println("please choose a number in range 1-12");
//                                numberOfCups = read.nextInt();
//                            }
//       
//                             System.out.println(" fruits menu:\n"
//                                                                + "1. Apple\n"
//                                                                + "2. Banana\n"
//                                                                + "3. Mango\n"
//                                                                + "4. peach\n"
//                                                                + "5. strawberry\n");
//                            System.out.println("choose the ingredients for eachCup, enter 0 to make the cocktail:\n ex(1 2 4) the cups will contain Apple, Banana and peach\n");
//                            int ingredientNumber = read.nextInt();
//                            while(true)
//                            {
//                                  switch(ingredientNumber)
//                                  {
//                                      case 1: 
//                                          if(blender.getVolumeInMilliLiter() == Blender.getCapacityInMilliLiter())
//                                          {
//                                               Apple apple = new Apple();
//                                                try {
//                                                    blender.addIngredient(apple);
//                                                } catch (BlenderOverflowException ex) {
//                                                       ex.getMessage();
//                                                }
//                                              
//                                          }
//                                          
//                                  }
//                            }
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                                                             
//                    }
//                   
//            }
//        }
//        
      
    }
}
