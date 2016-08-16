package developer.github.factory;

import com.fasterxml.jackson.databind.Module;
import developer.github.utils.ExceptionUtils;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PreDestroy;
import java.util.HashSet;
import java.util.Set;

/**
 * @package: developer.github.factory
 * @class:
 * @author: 黄鹏
 * @date: 2016年08月16日 下午6:34
 * @description:
 */
@Slf4j
public class BindModuleFactory {

    private Set<Module> modules = new HashSet<>();

    public BindModuleFactory(String moduleString) {
        String[] array = moduleString.split(",");
        if (array.length == 0) {
            return;
        }

        try {
            for (String module : array) {
                Class clazz = Class.forName(module);
                Object object = clazz.newInstance();
                if (object instanceof Module) {
                    modules.add((Module) object);
                }
            }
        } catch (Throwable t) {
            log.error("{}", t);
            throw new IllegalArgumentException(ExceptionUtils.getThrowableString(t));
        }
    }

    public Set<Module> get() {
        return modules;
    }

    @PreDestroy
    public void destroy() {
        modules = null;
    }
}
