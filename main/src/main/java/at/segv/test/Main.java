package at.segv.test;


import at.segv.test.service.interfaces.MyDaoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class Main {


    public static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String... args) {

        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        MyDaoService service = run.getBean(MyDaoService.class);
        LOG.info(service.read());



    }
}
