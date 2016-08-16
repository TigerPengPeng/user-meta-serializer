package developer.github;

import developer.github.factory.UserMetaObjectMapperFactory;
import developer.github.jackson.UserMetaObjectMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMetaSerializerTest {

	@Test
	public void testSendMessageAndReceive() throws Throwable {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:spring/*-applicationContext.xml");
		UserMetaObjectMapperFactory userMetaObjectMapperFactory =
				context.getBean("userMetaObjectMapperFactory", UserMetaObjectMapperFactory.class);
		UserMetaObjectMapper userMetaObjectMapper = context.getBean("userMetaObjectMapper", UserMetaObjectMapper.class);
		System.out.println(context);
	}
}
