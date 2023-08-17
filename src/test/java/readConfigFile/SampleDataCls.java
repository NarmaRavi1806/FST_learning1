package readConfigFile;

import org.junit.Test;

public class SampleDataCls {
	
	@Test

    public void verifyLogin() throws Exception {

        ReadConfig conf = new ReadConfig();

        System.out.println("launching app: " + conf.getApp());

        System.out.println("userName: " + conf.getUserName());

        System.out.println("password: " + conf.getPassword());

    }

}
