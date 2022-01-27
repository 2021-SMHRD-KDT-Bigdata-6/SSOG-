package kr.ssog.web;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;



@RestController
public class RecommandController {
	
	
	//실시간 업데이트
	
	@Autowired
	
	@PostMapping("/extraFactor")
	public String extraFactor(String id) {
		String inputLine=null;
		StringBuffer stringBuffer=new StringBuffer();
		System.out.println("들어오니?");
		//사용자 정보 보내주기 ->python -> 다시 ajax에서 받아오는구조
		// openstream? cross? 
		//받아오기
		
		
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		obj.addProperty("id", id);
		String send = gson.toJson(obj);
		
		//JsonObject jObject=new JsonObject();
        //jObject.addProperty("Test", "123");//JSON에 값 입력

		
		
		
		String result = null;
		HttpURLConnection connection = null;
		try {
			//HttpURLConnection 연결
			String targetURL = "http://222.102.43.230:9001/recommand/extrafactor";
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "utf-8");
			connection.setDoOutput(true);
			
			//Send 보내기!
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			
			wr.writeBytes(send);
			System.out.println("전송된 값 : " + send);
			wr.close();
			
			//BufferedWriter bWriter=new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(),"UTF-8"));
	        //bWriter.write(jObject.toString());
	        //System.out.println(jObject.toString());
	        
	        
	        
	        //전송된 결과를 읽어옴
	        BufferedReader bReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
	        while((inputLine=bReader.readLine())!=null){
	            stringBuffer.append(inputLine);
	        }
	        result = stringBuffer.toString();
	        System.out.println("들어온 값 : "+ result);
	        //bWriter.close();
	        bReader.close();
	        connection.disconnect();
	        
	        
	        
	        
	        
			//getResponse!받기
//			InputStream is = connection.getInputStream();
//			InputStream er = connection.getErrorStream();
//			BufferedReader rd = null;
//			
//			if(connection.getResponseCode()==200) {
//				rd = new BufferedReader(new InputStreamReader(is));
//			}else {
//				rd = new BufferedReader(new InputStreamReader(er));
//			}
//			StringBuilder response =new StringBuilder();
//			String line;
//			System.out.println("들어오니0505?");
//			while((line = rd.readLine()) != null) {
//				response.append(line);
//				response.append("\r");
//			}
//			rd.close();
//			result = response.toString();
					
			
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		} finally {
			if(connection != null) {
				connection.disconnect();
			}
		}
		
		
		
		
		return result;

	
		//crawlingUpdate.createViewTop200();

				//결과값
	}
	
	
	@GetMapping("/logHistroy")
	public List<String> logHistroy(String id) {
		String inputLine=null;
		StringBuffer stringBuffer=new StringBuffer();
		System.out.println("들어오니?");

		
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		id ="0125";
		obj.addProperty("id", id);
		String send = gson.toJson(obj);
		

		String result = null;
		HttpURLConnection connection = null;
		try {
			//HttpURLConnection 연결
			String targetURL = "http://222.102.43.230:9001/recommand/logHistroy";
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "utf-8");
			connection.setDoOutput(true);
			
			//Send 보내기!
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			
			wr.writeBytes(send);
			System.out.println("전송된 값 : " + send);
			wr.close();
	        
	        
	        
	        //전송된 결과를 읽어옴
	        BufferedReader bReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
	        System.out.println("ㅠㅠㅠㅠㅠㅠㅠㅠ");
	        inputLine=bReader.readLine();
	        while(inputLine!=null){
	            stringBuffer.append(inputLine);
	        }
	        System.out.println("44444");
	        System.out.println("야받아지냐");
	        result = stringBuffer.toString();
	        System.out.println("들어온 값 : "+ result);
	        //bWriter.close();
	        bReader.close();
	        connection.disconnect();
	        		
			
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		} finally {
			if(connection != null) {
				connection.disconnect();
			}
		}
		// 스트링 타입의 음식이름
		// 음식이름에대한 ingredient객체를 
		
		System.out.println(result);
		List<String> rist =  new ArrayList<String>();
		String[] temp = result.split(" ");
		for(int i = 0; i<temp.length; i++) {
			rist.add(temp[i]);
		}

		return rist;
	}
	
	
	
	@GetMapping("/purchaseHistroy")
	public String purchaseHistroy(String id) {
		String inputLine=null;
		StringBuffer stringBuffer=new StringBuffer();
		System.out.println("들어오니?");

		//받아오기

		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		obj.addProperty("id", id);
		String send = gson.toJson(obj);
		

		String result = null;
		HttpURLConnection connection = null;
		try {
			//HttpURLConnection 연결
			String targetURL = "http://222.102.43.230:9001/recommand/purchaseHistroy";
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "utf-8");
			connection.setDoOutput(true);
			
			//Send 보내기!
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			
			wr.writeBytes(send);
			System.out.println("전송된 값 : " + send);
			wr.close();
			
	                
	        //전송된 결과를 읽어옴
	        BufferedReader bReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
	        while((inputLine=bReader.readLine())!=null){
	            stringBuffer.append(inputLine);
	        }
	        result = stringBuffer.toString();
	        System.out.println("들어온 값 : "+ result);
	        //bWriter.close();
	        bReader.close();
	        connection.disconnect();
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		} finally {
			if(connection != null) {
				connection.disconnect();
			}
		}
		
		return result;


	}
	
	
	
	@GetMapping("/contents")
	public String contents(String id) {
		String inputLine=null;
		StringBuffer stringBuffer=new StringBuffer();
		System.out.println("들어오니?");

		//받아오기

		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		obj.addProperty("id", id);
		String send = gson.toJson(obj);
		

		String result = null;
		HttpURLConnection connection = null;
		try {
			//HttpURLConnection 연결
			String targetURL = "http://222.102.43.230:9001/recommand/contents";
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "utf-8");
			connection.setDoOutput(true);
			
			//Send 보내기!
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			
			wr.writeBytes(send);
			System.out.println("전송된 값 : " + send);
			wr.close();
			
	                
	        //전송된 결과를 읽어옴
	        BufferedReader bReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
	        while((inputLine=bReader.readLine())!=null){
	            stringBuffer.append(inputLine);
	        }
	        result = stringBuffer.toString();
	        System.out.println("들어온 값 : "+ result);
	        //bWriter.close();
	        bReader.close();
	        connection.disconnect();
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		} finally {
			if(connection != null) {
				connection.disconnect();
			}
		}
		
		return result;


	}

}
