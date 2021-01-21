package com.mbouhda.mustache.examples;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Greeting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Handlebars handlebars = new Handlebars();
        Template template = handlebars.compile("templates/greeting");
        log.info(template.apply("Gandalf"));
    }
}
