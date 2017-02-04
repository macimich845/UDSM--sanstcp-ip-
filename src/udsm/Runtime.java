  package udsm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

        public class Runtime {
        public static void Runtime()throws IOException { 
        System.out.println("1.COMPSCI, 2.GEOGRAPHY or 3.LITERATURE"); 
              BufferedReader nul1 = new BufferedReader (new InputStreamReader (System.in));
             String FileIO1 = nul1.readLine ();
             if(FileIO1.equals("COMPSCI")||FileIO1.equals("1")){
            FileIO1="CompSciQA.txt";
            }else if (FileIO1.equals("GEOGRAPHY")||FileIO1.equals("2")){
            FileIO1="GeoQA.txt";
            }else if (FileIO1.equals("LITERATURE")||FileIO1.equals("3")){
            FileIO1="LitQA.txt";
        }
            BufferedReader a = new BufferedReader (new FileReader (FileIO1));
            String Q;
            String A = null;
            String Answ = null ;
            BufferedReader nul = new BufferedReader (new InputStreamReader (System.in));
        
                    boolean x = false;
             for (int i = 0 ; i < 5 ; i++){if (x = false){System.out.println("loop entry"); x  = true;}// test ambigous loop error by testing entry
            //BufferedReader ANSW = new BufferedReader (new InputStreamReader (System.in));
            Q = a.readLine ();
            System.out.println(Q); 
            A = nul.readLine ();
            Answ = a.readLine();
            if (A.equals (Answ)||A.equals (Answ.toLowerCase()))
            {
                System.out.println ("you're correct!");
            }
            else
            {
                System.out.println ("you're not correct!");
            }
                }
            }
        }   // System.out.println (A);
        
//Rectify this syntacic load of shit
