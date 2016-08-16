package developer.github;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMetaSerializerTest {

	@Test
	public void testSendMessageAndReceive() throws Throwable {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:spring/*-applicationContext.xml");
		System.out.println(context);
	}
}
