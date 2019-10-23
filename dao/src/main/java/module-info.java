module dao {

    exports at.segv.test.dao.interfaces;

    opens at.segv.test.dao.impl;
    opens at.segv.test.dao.interfaces;

    requires spring.context;


    /**
     * jlink --module-path /Users/mat/workspace/modules-read/service/target/classes --add-modules service  --output service/target/jdk
     */
}