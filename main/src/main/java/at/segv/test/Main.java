package at.segv.test;

import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.service.interfaces.MyDaoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ServiceLoader;
import java.util.logging.Logger;

@SpringBootApplication
public class Main {

    public static void main(String... args) throws IOException, InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        Logger LOG = Logger.getLogger("main");

        LOG.info("start");



        HttpResponse<String> send = HttpClient.newHttpClient().send(HttpRequest.newBuilder().GET().uri(URI.create("http://google.com")).build(), HttpResponse.BodyHandlers.ofString());
        LOG.info(send.body());

        MyDaoService myDao = ServiceLoader.load(MyDaoService.class).findFirst().get();

        MyDao dao = run.getBean(MyDao.class);
        Module module = MyDao.class.getModule();
        LOG.info(module.toString());
        LOG.info(dao.read());




    }
}
