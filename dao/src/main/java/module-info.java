module dao {

    exports at.segv.test.dao.interfaces;

    opens at.segv.test.dao.impl;
    opens at.segv.test.dao.interfaces;

    requires spring.context;


    /**
     * jlink --module-path /Users/mat/workspace/modules-read/service/target/classes --add-modules service  --output service/target/jdk
     */
}

// /Users/mat/.sdkman/candidates/java/11.0.2-open/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=59879 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=127.0.0.1 -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:/Users/mat/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/183.4886.37/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=59880:/Users/mat/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/183.4886.37/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -p /Users/mat/workspace/modules-read/main/target/classes:/Users/mat/workspace/modules-read/service/target/classes:/Users/mat/workspace/modules-read/dao/target/classes:/Users/mat/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.0.RELEASE/spring-boot-starter-2.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/boot/spring-boot/2.2.0.RELEASE/spring-boot-2.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/spring-context/5.2.0.RELEASE/spring-context-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/spring-aop/5.2.0.RELEASE/spring-aop-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/spring-beans/5.2.0.RELEASE/spring-beans-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/spring-expression/5.2.0.RELEASE/spring-expression-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.2.0.RELEASE/spring-boot-autoconfigure-2.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.2.0.RELEASE/spring-boot-starter-logging-2.2.0.RELEASE.jar:/Users/mat/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/mat/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/mat/.m2/repository/org/slf4j/slf4j-api/1.7.28/slf4j-api-1.7.28.jar:/Users/mat/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.12.1/log4j-to-slf4j-2.12.1.jar:/Users/mat/.m2/repository/org/apache/logging/log4j/log4j-api/2.12.1/log4j-api-2.12.1.jar:/Users/mat/.m2/repository/org/slf4j/jul-to-slf4j/1.7.28/jul-to-slf4j-1.7.28.jar:/Users/mat/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/mat/.m2/repository/org/springframework/spring-core/5.2.0.RELEASE/spring-core-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/springframework/spring-jcl/5.2.0.RELEASE/spring-jcl-5.2.0.RELEASE.jar:/Users/mat/.m2/repository/org/yaml/snakeyaml/1.25/snakeyaml-1.25.jar -m at.segv.read.cli/at.segv.read.Main
