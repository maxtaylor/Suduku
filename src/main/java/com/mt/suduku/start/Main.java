package com.mt.suduku.start;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by root on 11/01/17.
 */
public class Main {


    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
        LOG.info("App started");


        final AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Context.class);
        configApplicationContext.registerShutdownHook();

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable throwable) {
                LOG.error(throwable.getMessage());
            }
        });

    }

}
