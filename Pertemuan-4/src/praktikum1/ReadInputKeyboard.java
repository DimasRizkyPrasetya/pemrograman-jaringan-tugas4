
package praktikum1;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadInputKeyboard {
    
    public static void main(String[] args) {
        
    
     Scanner br = new Scanner(new InputStreamReader(System.in));
         System.out.println("Masukan karakter apapun, [tekan keluar tekan `q`]: ");
         String input = "";
//         char input = 0;
         do {
             try {
                 input = br.nextLine();
//                 input = (char) br.read();
                 System.out.print("" + input);
             } catch (Exception ex) {
                 Logger.getLogger(ReadInputKeyboard.class.getName()).log(Level.SEVERE, null, ex);
             }
//         } while (input != 'q');
         }while (!input.equals("q"));
    }
}
