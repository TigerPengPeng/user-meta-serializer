package developer.github;

import developer.github.core.CoreContext;
import developer.github.factory.jackson.BindModuleFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMetaSerializerTest {

	@Test
	public void testSendMessageAndReceive() throws Throwable {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:spring/*-applicationContext.xml");
		BindModuleFactory factory = CoreContext.getBean("bindModuleFactory", BindModuleFactory.class);
		System.out.println(context);
	}
}
