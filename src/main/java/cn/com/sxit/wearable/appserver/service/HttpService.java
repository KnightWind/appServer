package cn.com.sxit.wearable.appserver.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.coyote.http11.filters.BufferedInputFilter;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.stereotype.Service;

@Service
public class HttpService {
		
	
	public String sendReq(String url){
		
		try{
			
			HttpClient client = null;
			client = new DefaultHttpClient();
			HttpGet request = new HttpGet();
			request.setURI(new URI(url));  
			HttpResponse response = client.execute(request);  
			String content = response.getEntity().getContent().toString();
			System.out.println("get content is :"+content);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "";
	}
	
	
	
	public  static void main(String [] args){
		try{
			HttpClient client = null;
			client = new DefaultHttpClient();
			HttpGet request = new HttpGet();
			request.setURI(new URI("http://127.0.0.1:8282/maven/index.jsp"));  
			HttpResponse response = client.execute(request);  
			
			InputStream in = response.getEntity().getContent();
//			String content = response.getEntity().getContent().toString();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String temp = null;
			System.out.println("the real context on blow:");
			while((temp=br.readLine())!=null){
				System.out.println(temp);
			}
			
			br.close();
//			System.out.println("get content is :"+content);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
