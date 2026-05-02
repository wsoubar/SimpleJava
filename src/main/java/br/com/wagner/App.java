package br.com.wagner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;
import java.util.Random;

@Slf4j
public class App {
    
    //private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();
        String[] nomes = {"Wagner", "João", "Maria", "Julio"};
        Random rand = new Random();
        int index = rand.nextInt(nomes.length);
        String randomName = nomes[index];
        app.sayHello(randomName);
    }

    private void sayHello(String name) {
        log.info("Hello, {} !!!!", name);
    }
}
