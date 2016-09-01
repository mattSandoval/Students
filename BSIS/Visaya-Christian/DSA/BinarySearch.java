//SOURCE CODE: BinarySearch.java
//AUTHOR NAME: Christian S. Visaya
//GITHUB URL: 
//LAST UPDATE:

import java.util.Scanner;

class BinarySearch{

          static void Search(int ArraySize, int NumberToHunt){

                     int NumberLine[] = new int[ArraySize];
                     int Lowest, Middle, Highest;
                     // ^ Declaration ng mga kakailanganin sa paghahanap ^

                     for(int a = 0; a < ArraySize; a++){
                               NumberLine[a] = a + 1;
                               System.out.println(NumberLine[a]);
                     }
                     // ^ Ito ung mag gegenerate ng number line depende sa inimput ng user. ^

                     Lowest = 0;
                     Highest = ArraySize - 1;
                     Middle = (Lowest + Highest) / 2;
                     // ^ Ito ung formula sa pag hati hati ng number line ^

                    while(Lowest <= Highest){ // Hanggat mas malaki si highest na index, tuloy ang loop.

                              if(NumberLine[Middle] < NumberToHunt){ // Kapag mas malaki ung pinapahanp kaysa sa gitna ng number line, i se set nya si lowst as middle.
                                        Lowest = Middle + 1;
                              }else if(NumberLine[Middle] == NumberToHunt){ // Kapag ung pinapahanap ay parehas ng gitna ng number line, tatapusin nya na ung loop tapos mag prprint ng "Found!".
                                        System.out.println("Number Found!");
                                        break;
                              }else{ // Kapag mas malaki naman ung gitna ng number line, i seset nya si highest  sa middle.
                                        Highest = Middle - 1;
                              }
                              Middle = (Lowest + Highest) / 2; // Ito ay kung di nahanap ung number, tapos ma hatiang naganap,  i rere center nya lang ung number line mo.
                    } // Dito nagaganap ang pag hahanap.

                    if( Lowest > Highest){
                              System.out.println("Number Not Found!");
                    }
                    // ^ Ito ung last na condition, sya ung mag dedeclare na hindi nahapa ung pinapahanap ^

          }

          public static void main (String[] args){

                    Scanner Input = new Scanner(System.in);
                    int Capacity, NumberToSearch; // Declaration ng maga itatapon na parameter sa Search() method.

                    System.out.println("How many numbers do you want to generate?");
                    Capacity = Input.nextInt(); // Pag store ng capacity ng array.

                    System.out.println("What number do you want to search?");
                    NumberToSearch = Input.nextInt(); // Kung ano ung hahanapin

                    Search(Capacity, NumberToSearch); // Method na mag hahanap kung ano ung pinapahanap.

          }

}
