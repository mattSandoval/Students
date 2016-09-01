//SOURCE CODE: BinarySearch.java
//AUTHOR NAME: Christian S. Visaya
//GITHUB URL:
//LAST UPDATE:

import java.util.Scanner;

class LinearSearch{

          static void Search(int ArraySize, int NumberToHunt){

                    int NumberLine[] = new int[ArraySize]; // Declaration ng number line mo.
                    boolean NotFound = false; // Ito ung pan check kung not foun ung number.

                    for(int a = 0; a < ArraySize; a++){
                              NumberLine[a] = a +1;
                              System.out.println(NumberLine[a]);
                    }
                     // ^ Ito ung mag gegenerate ng number line depende sa inimput ng user. ^

                    for(int b = 0; b < ArraySize; b++){
                              if(NumberLine[b] == NumberToHunt){ // kapag equal na si numberline[b] sa pinapahanap, pri print say na nahanap na, tapos break na ung loop.
                                        System.out.println("Number Found!");
                                        break;
                              }else{
                                        NotFound = true; // se set nya si boolean NotFound as true para pag chineck mamaya, i pri print ni program na hindi nahanap.
                              }
                    } // Dito nagaganap ang pag hahanap.

                    if(NotFound == true){
                              System.out.println("Number Not Found!"); // Ito ang mag priprint na hindi nahanap si number.
                    }

          }

          public static void main(String[] args){

                    Scanner Input = new Scanner(System.in);
                    int Capacity, NumberToSearch // Declaration ng maga itatapon na parameter sa Search() method.

                    System.out.println("How many numbers do you want to generate?");
                    Capacity = Input.nextInt();  // Pag store ng capacity ng array.

                    System.out.println("What number do you want to search?");
                    NumberToSearch = Input.nextInt(); // Kung ano ung hahanapin

                    Search(Capacity, NumberToSearch);  // Method na mag hahanap kung ano ung pinapahanap.
          }

}
