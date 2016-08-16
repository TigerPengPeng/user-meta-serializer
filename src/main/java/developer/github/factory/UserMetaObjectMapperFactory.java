package developer.github.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import developer.github.jackson.UserMetaObjectMapper;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PreDestroy;

/**
 * @package: developer.github.factory
 * @class:
 * @author: 黄鹏
 * @date: 2016年08月16日 下午6:12
 * @description:
 */
@Slf4j
public class UserMetaObjectMapperFactory {

    private ObjectMapper objectMapper;

    public UserMetaObjectMapperFactory(ObjectMapper _objectMapper) {
        objectMapper = new UserMetaObjectMapper(_objectMapper);
    }

    public ObjectMapper get() {
        return objectMapper;
    }

    @PreDestroy
    public void destroy() {
        objectMapper = null;
    }
}
