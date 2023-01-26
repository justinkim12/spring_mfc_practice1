package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // 리턴한 스트링을 http 바디에 바로 넣어버림 //Rest API 만드는데 핵심적인 api
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name ="Spring";
        System.out.println("name = " + name);

        log.trace("trace log = {}", name);
        log.debug("debug log={}", name); //디버그 status
        log.info("info log={}", name); //중요 정보 status
        log.warn("warn log={}", name); //경고 status
        log.error("error log={}", name); // 에러 status
        return "ok";
    }
}
