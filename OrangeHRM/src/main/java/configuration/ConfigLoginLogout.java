package configuration;

import java.io.FileNotFoundException;

public class ConfigLoginLogout {
	public static String getProVal(String proName){
		System.out.println(proName);
		 FileReader input=null;
		 try
		 {
			 input= new FileReader ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
		 }
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
	}

}
