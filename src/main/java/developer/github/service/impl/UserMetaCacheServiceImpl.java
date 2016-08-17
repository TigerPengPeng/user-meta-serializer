package developer.github.service.impl;

import developer.github.model.UserMetaVO;
import developer.github.service.UserMetaCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @package: developer.github.service
 * @class:
 * @author: 黄鹏
 * @date: 2016年08月17日 下午12:02
 * @description:
 */
@Service("userMetaCacheService")
@Slf4j
public class UserMetaCacheServiceImpl implements UserMetaCacheService {
    /**
     * get user meta map caches by principalIds from redis
     *
     * @param principalIds
     * @return
     */
    @Override
    public Map<String, UserMetaVO> getKeyValuePair(Collection principalIds) {
        Map<String, UserMetaVO> keyValuePair = new HashMap<>();
        return keyValuePair;
    }
}
