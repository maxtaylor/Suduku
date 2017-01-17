package com.mt.suduku.start;

import com.mt.suduku.exception.SudukuBug;
import com.mt.suduku.swing.custom.view.View;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by root on 12/01/17.
 */
@Configuration
public class Context {

    @Bean
    public SudukuProperties getSudukuProperties() {
        try {
            return new SudukuProperties();
        } catch (IOException ioex) {
            throw new SudukuBug(ioex.getMessage());
        }
    }

    @Bean
    public View getView() {
        return new View(getSudukuProperties());
    }
}
