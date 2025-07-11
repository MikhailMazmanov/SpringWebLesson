package org.example.springweblesson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class InfoController {


    @GetMapping("/info-java")
    public String javaInfo(@RequestParam(name = "style",required = false) String style ){
        if (style == null)  return "info-java";

       if(style.equals("black")){
           return "/info-java-black";
       }

        return "info-java";
    }

    @GetMapping("/info-java-collection")

    public String javaCollections(@RequestParam(name ="style", required = false) String style){
        if (style== null) return "info-java-collection";

        if(style.equals("black")) return "/info-java-collections-black";

        return "info-java-collection";
    }


     @GetMapping("/info-spring")
    public String springInfo(){
        return "info-spring";

    }
      @GetMapping("/")
    public String menuWeb(){
        return "menu";
      }

    @GetMapping("/java-var")
    public String javaVar(){return "java-var";}

    @GetMapping("/string-class-metods-java")
    public String strClassMetodsWeb(){return "string-class-metods-java";}

    @GetMapping("/if-java")
    public String ifJavaWeb(){return "if-java";}
}
