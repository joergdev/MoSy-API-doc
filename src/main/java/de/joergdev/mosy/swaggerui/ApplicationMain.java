package de.joergdev.mosy.swaggerui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApplicationMain extends SpringBootServletInitializer
{
  public static void main(String[] args)
  {
    try
    {
      long timeStart = java.lang.System.currentTimeMillis();
      java.lang.System.out.println("Booting Application " + ApplicationMain.class);

      SpringApplication.run(ApplicationMain.class, args);

      java.lang.System.out.println("Booted application " + ApplicationMain.class + " in " + (java.lang.System.currentTimeMillis() - timeStart) + " ms");
    }
    catch (Exception ex)
    {
      java.lang.System.out.println(ex.getMessage());
      ex.printStackTrace();

      java.lang.System.exit(-1);
    }
  }
}
