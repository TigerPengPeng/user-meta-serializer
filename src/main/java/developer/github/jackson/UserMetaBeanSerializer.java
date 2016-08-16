package developer.github.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @package: developer.github.jackson
 * @class:
 * @author: 黄鹏
 * @date: 2016年08月16日 下午7:16
 * @description:
 */
@Slf4j
public class UserMetaBeanSerializer extends BeanSerializer {

    /**
     * Alternate copy constructor that can be used to construct
     * standard {@link BeanSerializer} passing an instance of
     * "compatible enough" source serializer.
     */
    public UserMetaBeanSerializer(final BeanSerializer src) {
        super(src);
    }

    @Override
    protected void serializeFields(Object bean, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException {
        log.info("UserMetaBeanSerializer.serializeFields: {}", bean);
        super.serializeFields(bean, jgen, provider);
    }

    /**
     * Alternative serialization method that gets called when there is a
     * {@link PropertyFilter} that needs to be called to determine
     * which properties are to be serialized (and possibly how)
     */
    @Override
    protected void serializeFieldsFiltered(Object bean, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException {
        log.info("UserMetaBeanSerializer.serializeFieldsFiltered: {}", bean);
        super.serializeFields(bean, jgen, provider);
    }
}
