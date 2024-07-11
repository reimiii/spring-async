package franxx.code.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Component
public class Job {

  private AtomicLong atomicLong = new AtomicLong(0);

  @Scheduled(timeUnit = TimeUnit.SECONDS, initialDelay = 2, fixedDelay = 2)
  public void runJob() {

    long incremented = atomicLong.incrementAndGet();

    log.info("{} run job {}", incremented, Thread.currentThread());

  }

  public long getAtomicLong() {
    return atomicLong.get();
  }
}