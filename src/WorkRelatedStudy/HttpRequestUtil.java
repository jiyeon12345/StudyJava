package WorkRelatedStudy;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import com.google.gson.Gson;

public class HttpRequestUtil {

	public String sendHttpGetRequest(String url, String method) throws Exception {
        URL urlData = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlData.openConnection();

        // 요청 방식 설정
        connection.setRequestMethod(method);

        // 응답 코드 확인
        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("HTTP 요청 에러: " + responseCode);
        }

        // 응답 본문 읽기
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
	
	/*
	 * 클라이언트 프로그램은 url을 통해 서버와 통신할 때 다음 단계를 따른다.
	 * url 객체 만들기
	 * url 연결 구성
	 * 헤더 필드 읽기 (선택)
	 * 입력 스트림 가져오기 및 데이터 읽기 (선택)
	 * 출력 스트림 가져오기 및 데이터 쓰기 (선택)
	 * 연결 닫기 (선택)
	 * 
		URL : URL 클래스, HTTP 핸들링 할 때 URL을 전송 시 사용하는 것
		
		HttpURLConnection : HTTP 고유 기능  + 자바 ~ URL에 대한 api를 제공한다. 
							URLConnection 인스턴스는 URL 객체의 openConnection() 메소드 호출에 의해 얻어진다.
							
		connection.setRequestMethod(method);
		 -> HTTP 메소드(GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE)중 하나인 URL요청에 대한 메소드를 설정한다. 기본값은 GET
		 
		connection.getResponseCode();
		 -> 서버에서 보낸 HTTP 상태 코드를 반환한다. 헤더필드를 읽을때 connect()를 호출하지 않고 암시적으로 연결이 설정된다.
		 
		new BufferedReader(new InputStreamReader(connection.getInputStream()));
		 -> 입력 스트림 가져오기 및 데이터 읽기
		 	실제 내용을 읽으려면 read()메소드를 사용해야한다.
		 	문자 데이터를 읽기 위해서는 inputStream을 inputStreamReader에서 보다 편하게 조작하기 위해 래핑을 한다.
		 	
		while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        -> 데이터를 문자열로 읽기 위해서 inputStream을 BufferedReader로 래핑한다.
        
        in.close();
         -> 연결을 닫으려면 inputStream 객체에서 close() 메소드를 호출한다.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
