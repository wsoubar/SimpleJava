package br.com.wagner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    
    //private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();
        app.sayHello("Wagner");
    }

    private void sayHello(String name) {
        log.info("Hello, {} !!!!", name);
    }
}
