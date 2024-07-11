package franxx.code.async;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class HelloAsyncTest {

  @Autowired
  private HelloAsync helloAsync;

  @Test
  @SneakyThrows
  void helloAsync() {
    for (int i = 0; i < 10; i++) {
      helloAsync.hello();
    }

    log.info("after call helloAsync()");
    Thread.sleep(Duration.ofSeconds(5));
  }

  @Test
  @SneakyThrows
  void helloName() {
    Future<String> zeroTwo = helloAsync.hello("Zero Two");
    String response = zeroTwo.get();
    log.info(response);
  }
}