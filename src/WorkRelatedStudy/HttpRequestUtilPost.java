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

//import com.google.gson.Gson;

public class HttpRequestUtilPost {
	
	public Map<String, String> sendHttpPostRequest(String url, String method, Map<String, String> bodyMap) throws IOException {
		// TODO Auto-generated method stub
		HttpURLConnection con = null;
	    BufferedReader reader = null;
	    Map<String, String> resultMap = new HashMap<>();
	    try {
	        URL obj = new URL(url);
	        con = (HttpURLConnection) obj.openConnection();

	        // 요청 메소드 설정
	        con.setRequestMethod(method);

	        // 요청 헤더 설정
	        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        con.setRequestProperty("Accept", "application/json");

	        // 요청 바디 생성
	        StringJoiner sj = new StringJoiner("&");
	        for (Map.Entry<String, String> entry : bodyMap.entrySet()) {
	            sj.add(URLEncoder.encode(entry.getKey(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
	        }
	        byte[] postData = sj.toString().getBytes(StandardCharsets.UTF_8);

	        // 입력과 출력 활성화
	        con.setDoOutput(true);
	        con.setDoInput(true);

	        // 요청 바디를 연결에 쓰기
//	        try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
//	            wr.write(postData);
//	        }
	        
	        try (OutputStream wr = new DataOutputStream(con.getOutputStream())) {
	            wr.write(postData);
	        }

	        // 응답 코드와 입력 스트림 얻기
	        int responseCode = con.getResponseCode();
	        InputStream is;
	        if (responseCode >= 400) {
	            is = con.getErrorStream();
	        } else {
	            is = con.getInputStream();
	        }

	        // 응답 바디 읽기
	        reader = new BufferedReader(new InputStreamReader(is));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
	        String response = sb.toString();

	        // 응답 바디를 Map으로 파싱
//	        Gson gson = new Gson();
//	        Type type = new TypeToken<Map<String, String>>(){}.getType();
//	        resultMap = gson.fromJson(response, type);
//	        resultMap.put("status", String.valueOf(responseCode));
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        // reader와 연결 닫기
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        if (con != null) {
	            con.disconnect();
	        }
	    }
	    return resultMap;
    }

	/*
	 * setRequestProperty(String key, Strinv value) : 
	 * 	 -> key = value 쌍으로 지정된 일반 요청 속성을 설정한다.
	 * 		키가 있는 송성이 이미 있는 경우 이전 값을 새값으로 적용한다.
	 * 		이러한 메소드는 연결을 설정하기 전에 호출해야한다. 
	 * 		일부 메소드는 연결이 이미 설정된 경우 llegalStateException을 발생시킨다.
	 * 		또한 하위 클래스 HttpURLConnection은 HTTP관련 기능을 사용하여 연결을 구성하기 위한 다음 메소드를 제공한다.
	 * 
	 * StringJoiner
	 *   -> StringBuilder 또는 StringBuffer를 사용하다보면 중간 공백(문자)를 넣어야 할 때가 있다.
	 *   	이런 경우 하드코딩 할 경우 귀찮고 가독성도 떨어진다. java8에 추가된 StringJoin클래스
	 *   	ad.~ 을 하면 ad 사이에 "&" 문자열이 나올 수 있다는 것.
	 *   
	 * URLEncoder.encode
	 *   -> 우리가 직접 브라우저의 url에 한글을 입력하면 브라우저가 자동으로 한글으로 인코딩을 해주기 때문에 한글이 잘 보인다.
	 *   	하지만 컨트롤러에서 url을 직접 만들고 한글을 추가했을 경우 브라우저가 인코딩을 할 수 없기 때문에 해당 메소드를 사용
	 *   	결론 : 아스키문자가 아닌것을 16진수로 변환해준다.
	 * 
	 * setDoOutput / setDoInput
	 *   -> 서버에 데이터를 보내려면 / 받으려면 먼저 연결해서 출력/응답을 활성화 해야한다. 
	 *   
	 * DataOutputStream
	 *   -> 기존 FileInputStream 등은 문자나 바이트 형식만 읽고 쓸 수 있었음.
	 *   	근데 숫자를 읽고싶다? 문자나 데이터 형식으로만 읽을 수 밖에 없었음.
	 *   	그래서 코드상 읽고 쓸때마다 항상 숫자 데이터로 변환해줘야함.
	 *   	이걸 변환까지 해주고 파일을 읽고써주는 클래스가 DataOutputStream, DataInputStream임!!
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
