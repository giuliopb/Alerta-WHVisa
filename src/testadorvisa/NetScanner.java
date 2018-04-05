package testadorvisa;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NetScanner {
    
    public void rota() throws MalformedURLException, IOException, InterruptedException{
        
        URL url = new URL("https://www.immigration.govt.nz/new-zealand-visas/apply-for-a-visa/about-visa/brazil-working-holiday-visa");
        boolean fechado = true;
        int cont = 0;
        while(fechado){
            Scanner scan = new Scanner(url.openStream());
            while(scan.hasNext()){
                String linha = scan.next();
                System.out.println(linha);
                if(linha.contains("OPEN</h2>")){
                    while(true){
                        Toolkit.getDefaultToolkit().beep();
                        Thread.sleep(500);
                    }
                }
            }
        Thread.sleep(10000);
        }
    }
}
