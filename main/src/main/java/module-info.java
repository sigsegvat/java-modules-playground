import at.segv.test.dao.interfaces.MyDao;
import at.segv.test.service.interfaces.MyDaoService;

open module at.segv.test.cli {
    requires java.logging;
    requires java.net.http;
    requires dao;
    requires service;

    uses MyDao;
    uses MyDaoService;

    // automatic module
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;


}