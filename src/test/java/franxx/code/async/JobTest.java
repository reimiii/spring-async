package franxx.code.async;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JobTest {

  @Autowired
  private Job job;

  @Test
  @SneakyThrows
  void getValue() {
    Thread.sleep(Duration.ofSeconds(5));
    assertEquals(3L, job.getAtomicLong());

  }
}