package org.example;

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;
import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import static java.lang.System.in;
import static java.lang.System.out;

public class NativeInterface {

    private static final Reflections ref = new Reflections("org.example");
    @CEntryPoint(name = "list_annotated_class")
    protected static void listAnnotatedClass(@SuppressWarnings("unused") @CEntryPoint.IsolateThreadContext IsolateThread thread) {

        WriteToFile(VisitorAnnotation.class.getPackage().getName()+"\n");
        WriteToFile("Entry \n");

        for (Class<?> clz : ref.getTypesAnnotatedWith(VisitorAnnotation.class)) {
            WriteToFile(clz.toString());
        }
        WriteToFile("Exit \n");
    }

    public static void WriteToFile(String message){

        File file = new File("C:\\Test\\append.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(message);
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args)
    {

    }
}
