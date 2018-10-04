package club.hicode.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/4
 */
@Component
public class AutoRefershJob {

    @Autowired
    private ContextRefresher contextRefresher;

    @Scheduled(fixedRate = 5)
    public void fresh() {
        Set<String> refresh = contextRefresher.refresh();
        System.err.println(refresh);
    }
}
