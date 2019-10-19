module dao {
    uses at.segv.test.dao.interfaces.MyDao;

    exports at.segv.test.dao.interfaces;

    requires spring.context;

    opens at.segv.test.dao.impl;
    opens at.segv.test.dao.interfaces;

    provides at.segv.test.dao.interfaces.MyDao with at.segv.test.dao.impl.MyDaoImpl;


    /**
     * jlink --module-path /Users/mat/workspace/modules-test/service/target/classes --add-modules service  --output service/target/jdk
     */
}