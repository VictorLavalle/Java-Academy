package com.java.academy.finalproject.rest.customLogger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Service
public class LoggerToFile {

    private String logFilePath = Path
        .of(System.getProperty("user.dir"), "application.log")
        .toString();

    public void info(String logText) {
        log("INFO", logText);
    }

    public void warn(String logText) {
        log("WARN", logText);
    }

    public void error(String logText) {
        log("ERROR", logText);
    }

    private void log(String logLevel, String logText) {
        try {
            FileWriter fileWriter = new FileWriter(logFilePath, true);

            fileWriter.append(System.getProperty("line.separator"))
                    .append(LocalDateTime.now().toString())
                    .append(" - ").append(logLevel)
                    .append(": ").append(logText);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(LocalDateTime.now().toString() + " - " + logLevel + ": " + logText);
    }
}
