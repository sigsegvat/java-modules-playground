open module service {

    exports at.segv.test.service.interfaces;

    requires dao;
    // automatic module
    requires spring.context;
}