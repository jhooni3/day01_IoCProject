package polymorphism2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		// 1. Spring IoC 컨테이너 구동(생성)
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("business-layer.xml");
		
		// 2. 컨테이너로 부터 테스트할 객체를 검색(Lookup)한다
		TV tv = (TV)container.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. 컨테이너를 종료한다
		container.close();
		
	}
}
