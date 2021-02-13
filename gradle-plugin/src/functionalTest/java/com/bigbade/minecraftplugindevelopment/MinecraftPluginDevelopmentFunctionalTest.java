/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bigbade.minecraftplugindevelopment;

import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * A simple functional test for the 'MinecraftPluginDevelopment' plugin.
 */
public class MinecraftPluginDevelopmentFunctionalTest {
    @Test
    public void canRunTask() throws IOException {
        // Setup the test build
        /*File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('MinecraftPluginDevelopment')" +
                        "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        //runner.withArguments("greeting");
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();*/

        // TODO Actually write a functional test.
        //assertTrue(result.getOutput().contains("Hello from plugin 'MinecraftPluginDevelopmentFunctionalTest.greeting'"));
    }

    private static void writeString(File file, String string) throws IOException {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
            writer.write(string);
        }
    }
}