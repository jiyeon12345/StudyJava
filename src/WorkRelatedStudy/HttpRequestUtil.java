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

        // ��û ��� ����
        connection.setRequestMethod(method);

        // ���� �ڵ� Ȯ��
        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("HTTP ��û ����: " + responseCode);
        }

        // ���� ���� �б�
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
	 * Ŭ���̾�Ʈ ���α׷��� url�� ���� ������ ����� �� ���� �ܰ踦 ������.
	 * url ��ü �����
	 * url ���� ����
	 * ��� �ʵ� �б� (����)
	 * �Է� ��Ʈ�� �������� �� ������ �б� (����)
	 * ��� ��Ʈ�� �������� �� ������ ���� (����)
	 * ���� �ݱ� (����)
	 * 
		URL : URL Ŭ����, HTTP �ڵ鸵 �� �� URL�� ���� �� ����ϴ� ��
		
		HttpURLConnection : HTTP ���� ���  + �ڹ� ~ URL�� ���� api�� �����Ѵ�. 
							URLConnection �ν��Ͻ��� URL ��ü�� openConnection() �޼ҵ� ȣ�⿡ ���� �������.
							
		connection.setRequestMethod(method);
		 -> HTTP �޼ҵ�(GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE)�� �ϳ��� URL��û�� ���� �޼ҵ带 �����Ѵ�. �⺻���� GET
		 
		connection.getResponseCode();
		 -> �������� ���� HTTP ���� �ڵ带 ��ȯ�Ѵ�. ����ʵ带 ������ connect()�� ȣ������ �ʰ� �Ͻ������� ������ �����ȴ�.
		 
		new BufferedReader(new InputStreamReader(connection.getInputStream()));
		 -> �Է� ��Ʈ�� �������� �� ������ �б�
		 	���� ������ �������� read()�޼ҵ带 ����ؾ��Ѵ�.
		 	���� �����͸� �б� ���ؼ��� inputStream�� inputStreamReader���� ���� ���ϰ� �����ϱ� ���� ������ �Ѵ�.
		 	
		while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        -> �����͸� ���ڿ��� �б� ���ؼ� inputStream�� BufferedReader�� �����Ѵ�.
        
        in.close();
         -> ������ �������� inputStream ��ü���� close() �޼ҵ带 ȣ���Ѵ�.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
