package cn.itcase.uuid;

import java.util.UUID;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

public class UUIDTest {
@Test
public void Test1(){
	UUID uuid=UUID.randomUUID();
	String u=uuid.toString();
	u=u.replace("-", "");
	u=u.toUpperCase();
	System.out.println(uuid);
	System.out.println(u);
	
	System.out.println(CommonUtils.uuid());
}
}
