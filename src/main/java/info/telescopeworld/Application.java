package info.telescopeworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@SpringBootApplication
//@ImportResource(value="hsql_cfg.xml")
public class Application {

  @ControllerAdvice
  // adds support for "callback" parameter
  static class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdvice() {
      super( "callback" );
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
