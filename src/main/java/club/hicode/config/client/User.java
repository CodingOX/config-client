package club.hicode.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/4
 */
@ConfigurationProperties(prefix = "user")
public class User {

    private String name;

    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
