
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
import GUIcomponents.*;


public class Cocktail {

    public static void main(String[] args) {
        new WelcomeFrame().setVisible(true);
        Blender blender = new Blender();
        Scanner read = new Scanner(System.in);
        System.out.println("welcome to our restaurant" );
            
          int start= 0;
          int numberOfCups = 0;
          int cupCapacity = 0;
          while(start != 5)
          {
              
              System.out.println("1. Start your order" +
                                     "\n2. Blend the cocktail" +
                                     "\n3. Pour the cocktail" +
                                     "\n4. Get the blender information" +
                                     "\n5. Exit the program");  
              start = read.nextInt();
                    switch(start){
                              case 1:
                                  blender.clearIngredients();
                                      System.out.println("\nchoose the cups size:\n"
                                                               + "1. small (100 ml)\n"
                                                               + "2. medium (200 ml)\n"
                                                               + "3. large (300 ml)\n");
                                                int cupsize = read.nextInt();
                                                while(cupsize < 0 || cupsize > 3 )
                                               {
                                                   System.out.println("invalid choice , please choose a number in range 1 - 3 ");
                                                   cupsize = read.nextInt();
                                               } 
                                       switch(cupsize)
                                       {
                                           case 1:
                                               Cup smallCup = new Cup(100);
                                               cupCapacity = smallCup.getCapacity();
                                               System.out.println("enter the number of cups, you can choose at maximmum 12 cups");
                                               numberOfCups = read.nextInt();
                                               while(numberOfCups < 0 || numberOfCups > 12 )
                                               {
                                                   System.out.println("please choose a number in range 1-12");
                                                   numberOfCups = read.nextInt();
                                               } 
                                               addToCocktail(smallCup.getCapacity(), numberOfCups, blender);
                                               break;
                                           case 2:
                                               Cup medCup = new Cup(200);
                                               cupCapacity = medCup.getCapacity();
                                               System.out.println("enter the number of cups, you can choose at maximmum 6 cups");
                                                numberOfCups = read.nextInt();
                                               while(numberOfCups < 0 || numberOfCups > 6 )
                                               {
                                                   System.out.println("please choose a number in range 1-6");
                                                   numberOfCups = read.nextInt();
                                               }
                                               addToCocktail(medCup.getCapacity(), numberOfCups, blender);
                                               break;
                                           case 3:
                                               Cup largeCup = new Cup(400);
                                               cupCapacity = largeCup.getCapacity();
                                               System.out.println("enter the number of cups, you can choose at maximmum 3 cups");
                                               numberOfCups = read.nextInt();
                                               while(numberOfCups < 0 || numberOfCups > 3 )
                                               {
                                                   System.out.println("please choose a number in range 1-3");
                                                   numberOfCups = read.nextInt();
                                               } 
                                               addToCocktail(largeCup.getCapacity(), numberOfCups, blender);
                                               break;

                                                
                                      }
                                   break;

                              case 2:
                              try 
                              {
                                  blender.blend();
                              }
                              catch (EmptyBlenderException ex)
                              {
                                  System.out.println(ex.getMessage());
                              }
                                   break;
                              case 3:
                      
                          try
                          {
                              blender.pour(numberOfCups, cupCapacity);
                          }
                          catch (EmptyBlenderException ex) {
                              System.out.println(ex.getMessage());
                          }
                          catch (NotBlendedException ex) 
                          {
                              System.out.println(ex.getMessage());
                          }
                                    break;
                              case 4:
                                if(blender.getVolumeInMilliLiter() != 0)
                                        System.out.println(blender.getInfo());
                                else
                                        System.out.println("The blender is empty");
                    }  
       
          }
           
    }
    public static void addToCocktail(int cupSize, int numberOfCups, Blender blender){
          Scanner read = new Scanner(System.in);
       
          int i = 1;
          System.out.println("Do you want to add Milk to the Cocktail? Milk will take 25% of the total Capacity of the Cup\n Enter 1 for Yes or 0 for no");
                                int MilkAdd = read.nextInt();
                                while(MilkAdd != 1 && MilkAdd != 0)
                                {
                                    System.out.println("Please Enter a valid choice");
                                    MilkAdd = read.nextInt();
                                }
                                if(MilkAdd == 1)
                                {
                                    double quarterCupSize = cupSize*0.25;
                                    double milkQ = numberOfCups*quarterCupSize;
                                    Milk milk = new Milk(numberOfCups*cupSize*0.25, numberOfCups*cupSize*0.25);
                                    try 
                                    {
                                        blender.addIngredient(milk, cupSize, numberOfCups);
                                    }
                                    catch (BlenderOverflowException ex)
                                    {
                                        System.out.println(ex.getMessage());
                                    }
                                }
        
           while(blender.getVolumeInMilliLiter() < cupSize*numberOfCups) 
           {
                     if(cupSize*numberOfCups - blender.getVolumeInMilliLiter() < 10)
                              break;
                     
                    System.out.println("\nfruits menu:\n"
                                    + "1. Apple\n"
                                    + "2. Banana\n"
                                    + "3. Mango\n"
                                    + "4. Peach\n"
                                    + "5. Strawberry\n"
                                    + "6. Exit\n");

                  System.out.println("add ingredients to the blender: ");
                  int IngredientNumber = read.nextInt();
                  switch(IngredientNumber)
                  {
                    case 1:
                        System.out.println("How many Apples would you like to add?");
                            int applesToAdd = read.nextInt();
                                try 
                                {
                                    for(i = 1; i <= applesToAdd; i++)
                                        blender.addIngredient(new Apple(), cupSize, numberOfCups);
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                        
                                        System.out.println(ex.getMessage() + " , we added " + (i  - 1) + " apples ");
                                        System.out.println("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                             
                                    break;
                                    
                    case 2:
                        System.out.println("How many Bananas would you like to add?");
                            int bananasToAdd = read.nextInt();
                                try 
                                {

                                    for(i = 1; i <= bananasToAdd; i++)
                                        blender.addIngredient(new Banana(), cupSize, numberOfCups);
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                         System.out.println(ex.getMessage() + " , we added " + (i  - 1) + " bananas ");
                                        System.out.println("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                                   
                            break;

                    case 3:
                        System.out.println("How many Mangos would you like to add?");
                       
                        
                            int MangosToAdd = read.nextInt();
                                try 
                                {
                                    
                                    for( i = 1; i <= MangosToAdd; i++)
                                        blender.addIngredient(new Mango(), cupSize, numberOfCups);
                                }
                                catch (BlenderOverflowException ex)
                                {
                                        System.out.println(ex.getMessage() + " , we added " + (i  - 1) + " mango ");
                                        System.out.println("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }

                            break;

                    case 4:
                        System.out.println("How many peachs would you like to add?");
                            int peachesToAdd = read.nextInt();
                                try 
                                {
                                    for(i = 1; i <= peachesToAdd; i++)
                                        blender.addIngredient(new Peach(), cupSize, numberOfCups);
                                } 
                                catch(BlenderOverflowException ex)
                                {
                                        System.out.println(ex.getMessage() + " , we added " + (i  - 1) + " peach ");
                                        System.out.println("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }

                            break;
                    case 5:
                        System.out.println("How many Strawberries would you like to add?");
                            int strawberriesToAdd = read.nextInt();
                                try 
                                {
                                    for( i = 1; i <= strawberriesToAdd; i++)
                                        blender.addIngredient(new Strawberry(), cupSize, numberOfCups);
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                         System.out.println(ex.getMessage() + " , we added " + (i  - 1) + " strawberries ");
                                        System.out.println("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                            break;
                            
                    case 6: 
                        break;
                            
                    default:
                        System.out.println("Invalid choicer, Please choose valid one");
                            break;
              }
                  if(IngredientNumber == 6)
                      break;
          }
    }
}
