package org.cloud.test;

import org.cloud.http.client.HttpUtil;
import org.cloud.http.client.ResponseContent;

public class Test502Client {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					ResponseContent rc = HttpUtil.get("http://127.0.0.1:83/test-web/test502");
					int code = rc.getStatusCode();
					if (code == 502) {
						System.out.println("error:502");
					} else {
						System.out.println(rc.getContent());
					}
				}
			}).start();
		}
	}
}
