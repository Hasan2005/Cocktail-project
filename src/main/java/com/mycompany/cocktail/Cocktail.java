
package com.mycompany.cocktail;
import basaeclasses.Ingredient;
import colors.RGB;
import container.*;
import exceptions.blender.*;
import fruits.*;
import liquids.Milk;
import interfaces.*;
import java.util.ArrayList;
import java.util.Scanner;
import GUIcomponents.*;
import loggers.*;


public class Cocktail {
    
    public static void main(String[] args) {
        
        new WelcomeFrame().setVisible(true);
        Blender blender = new Blender();
        Scanner read = new Scanner(System.in);
        MyLogger consoleLogger = new ConsoleLogger();
        MyLogger fileLogger = new FileLogger("history.log");
           
        consoleLogger.log("welcome to our restaurant" );
            
          int start= 0;
          int numberOfCups = 0;
          int cupCapacity = 0;
          while(start != 5)
          {
              
              consoleLogger.log("1. Start your order" +
                                     "\n2. Blend the cocktail" +
                                     "\n3. Pour the cocktail" +
                                     "\n4. Get the blender information" +
                                     "\n5. Exit the program");  
              start = read.nextInt();
                    switch(start){
                              case 1:
                                  blender.clearIngredients();
                                  consoleLogger.log("starting new order: ");
                                       consoleLogger.log("choose the cups size:\n"
                                                               + "1. small (100 ml)\n"
                                                               + "2. medium (200 ml)\n"
                                                               + "3. large (300 ml)");
                                                int cupSize = read.nextInt();
                                                while(cupSize <= 0 || cupSize > 3 )
                                               {
                                                    consoleLogger.log("invalid choice , please choose a number in range 1 - 3 ");
                                                   cupSize = read.nextInt();
                                               }
                                       switch(cupSize)
                                       {
                                           case 1:
                                                Cup smallCup = new Cup(100);
                                                cupCapacity = smallCup.getCapacity();
                                                fileLogger.log("Cup Size: Small");
                                                consoleLogger.log("enter the number of cups, you can choose at maximmum 12 cups");
                                               numberOfCups = read.nextInt();
                                               while(numberOfCups <= 0 || numberOfCups > 12 )
                                               {
                                                    consoleLogger.log("please choose a number in range 1-12");
                                                   numberOfCups = read.nextInt();
                                               } 
                                               fileLogger.log(("Number Of Cups: " + numberOfCups));
                                               addToCocktail(smallCup.getCapacity(), numberOfCups, blender, consoleLogger, fileLogger);
                                               break;
                                           case 2:
                                                Cup medCup = new Cup(200);
                                                cupCapacity = medCup.getCapacity();
                                                fileLogger.log("Cup Size: Medium");
                                                consoleLogger.log("enter the number of cups, you can choose at maximmum 6 cups");
                                                numberOfCups = read.nextInt();
                                               while(numberOfCups <= 0 || numberOfCups > 6 )
                                               {
                                                   consoleLogger.log("please choose a number in range 1-6");
                                                   numberOfCups = read.nextInt();
                                               }
                                               fileLogger.log(("Number Of Cups: " + numberOfCups));
                                               addToCocktail(medCup.getCapacity(), numberOfCups, blender, consoleLogger, fileLogger);
                                               break;
                                           case 3:
                                                Cup largeCup = new Cup(400);
                                                cupCapacity = largeCup.getCapacity();
                                                fileLogger.log("Cup Size: Large");
                                                consoleLogger.log("enter the number of cups, you can choose at maximmum 3 cups");
                                               numberOfCups = read.nextInt();
                                               while(numberOfCups <= 0 || numberOfCups > 3 )
                                               {
                                                   consoleLogger.log("please choose a number in range 1-3");
                                                   numberOfCups = read.nextInt();
                                               } 
                                               fileLogger.log(("Number Of Cups: " + numberOfCups));
                                               addToCocktail(largeCup.getCapacity(), numberOfCups, blender, consoleLogger, fileLogger);
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
                                   consoleLogger.log(ex.getMessage());
                                   fileLogger.log(ex.getMessage() + "\n");
                              }
                                   break;
                              case 3:
                      
                          try
                          {
                              blender.pour(numberOfCups, cupCapacity);
                          }
                          catch (EmptyBlenderException ex) {
                              consoleLogger.log(ex.getMessage());
                              fileLogger.log(ex.getMessage());
                          }
                          catch (NotBlendedException ex) 
                          {
                               consoleLogger.log(ex.getMessage());
                               fileLogger.log(ex.getMessage());
                          }
                                    break;
                              case 4:
                                if(blender.getVolumeInMilliLiter() != 0)
                                {
                                        consoleLogger.log(blender.getInfo());
                                          fileLogger.log(blender.getInfo());
                                }
                                else
                                {
                                        EmptyBlenderException ex = new EmptyBlenderException();
                                        consoleLogger.log(ex.getMessage());
                                        fileLogger.log(blender.getInfo());
                                }
                              break;
                              case 5:
                                  System.exit(0);
                    }  
       
          }
    }
    public static void addToCocktail(int cupSize, int numberOfCups, Blender blender, MyLogger consoleLogger, MyLogger fileLogger){
          Scanner read = new Scanner(System.in);
       
          int i = 1;
          consoleLogger.log("Do you want to add Milk to the Cocktail? Milk will take 25% of the total Capacity of the Cup\n Enter 1 for Yes or 0 for no");
                                int MilkAdd = read.nextInt();
                                while(MilkAdd != 1 && MilkAdd != 0)
                                {
                                     consoleLogger.log("Please Enter a valid choice");
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
                                        consoleLogger.log(ex.getMessage());
                                        fileLogger.log(ex.getMessage());
                                    }
                                }
        
           while(blender.getVolumeInMilliLiter() < cupSize*numberOfCups) 
           {
                     if(cupSize*numberOfCups - blender.getVolumeInMilliLiter() < 10)
                              break;
                     
                    consoleLogger.log("\nfruits menu:\n"
                                    + "1. Apple\n"
                                    + "2. Banana\n"
                                    + "3. Mango\n"
                                    + "4. Peach\n"
                                    + "5. Strawberry\n"
                                    + "6. Exit\n");

                  consoleLogger.log("add ingredients to the blender:");
                  fileLogger.log("add ingredients to the blender:");
                  int IngredientNumber = read.nextInt();
                  switch(IngredientNumber)
                  {
                    case 1:
                       consoleLogger.log("How many Apples would you like to add?");
                            int applesToAdd = read.nextInt();
                                try 
                                {
                                    for(i = 1; i <= applesToAdd; i++)
                                        blender.addIngredient(new Apple(), cupSize, numberOfCups);
                                    
                                    consoleLogger.log(applesToAdd +" apples added successfully ");
                                    fileLogger.log(applesToAdd + " apples added successfully");
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                        
                                       consoleLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " apples ");
                                        fileLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " apples ");
                                        consoleLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                         fileLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                             
                                    break;
                                    
                    case 2:
                        consoleLogger.log("How many Bananas would you like to add?");
                            int bananasToAdd = read.nextInt();
                                try 
                                {

                                    for(i = 1; i <= bananasToAdd; i++)
                                        blender.addIngredient(new Banana(), cupSize, numberOfCups);
                                    
                                    consoleLogger.log(bananasToAdd +" bananas added successfully ");
                                    fileLogger.log(bananasToAdd+ " bananas added successfully");
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                        consoleLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " bananas ");
                                        fileLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " bananas ");
                                        consoleLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                        fileLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                                   
                            break;

                    case 3:
                         consoleLogger.log("How many Mangos would you like to add?");
                       
                        
                            int MangosToAdd = read.nextInt();
                                try 
                                {
                                    
                                    for( i = 1; i <= MangosToAdd; i++)
                                        blender.addIngredient(new Mango(), cupSize, numberOfCups);
                                    
                                    consoleLogger.log(MangosToAdd +" mangos added successfully ");
                                    fileLogger.log(MangosToAdd + " mangos added successfully");
                                }
                                catch (BlenderOverflowException ex)
                                {
                                        consoleLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " Mangos ");
                                        fileLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " Mangos ");
                                        consoleLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                        fileLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }

                            break;

                    case 4:
                         consoleLogger.log("How many peachs would you like to add?");
                            int peachesToAdd = read.nextInt();
                                try 
                                {
                                    for(i = 1; i <= peachesToAdd; i++)
                                        blender.addIngredient(new Peach(), cupSize, numberOfCups);
                                    
                                       consoleLogger.log(peachesToAdd +" mangos added successfully ");
                                    fileLogger.log(peachesToAdd + " mangos added successfully");
                                } 
                                catch(BlenderOverflowException ex)
                                {
                                        consoleLogger.log(ex.getMessage() + " , we added " + (i  - 1) + "peaches ");
                                        fileLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " peaches ");
                                        consoleLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                        fileLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }

                            break;
                    case 5:
                         consoleLogger.log("How many Strawberries would you like to add?");
                            int strawberriesToAdd = read.nextInt();
                                try 
                                {
                                    for( i = 1; i <= strawberriesToAdd; i++)
                                        blender.addIngredient(new Strawberry(), cupSize, numberOfCups);
                                    
                                       consoleLogger.log(strawberriesToAdd +" strawberries added successfully ");
                                       fileLogger.log(strawberriesToAdd + " strawberries added successfully");
                                } 
                                catch (BlenderOverflowException ex)
                                {
                                        consoleLogger.log(ex.getMessage() + " , we added " + (i  - 1) + " strawberries");
                                        fileLogger.log(ex.getMessage() + " , we added " + (i  - 1) + "  strawberries");
                                        consoleLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                        fileLogger.log("remaining capacity: " + (cupSize*numberOfCups - blender.getVolumeInMilliLiter()));
                                }
                            break;
                            
                    case 6: 
                        break;
                            
                    default:
                         consoleLogger.log("Invalid choicer, Please choose valid one");
                            break;
              }
                  if(IngredientNumber == 6)
                      break;
          }
    }
}
