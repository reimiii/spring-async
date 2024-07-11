package franxx.code.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
public class AsyncConf {

  @Bean
  public Executor taskExecutor() {
    return Executors.newVirtualThreadPerTaskExecutor();
  }

  @Bean
  public Executor singleTaskExecutor() {
    return Executors.newSingleThreadExecutor();
  }
}
