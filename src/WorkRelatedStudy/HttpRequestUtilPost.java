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

	        // ��û �޼ҵ� ����
	        con.setRequestMethod(method);

	        // ��û ��� ����
	        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        con.setRequestProperty("Accept", "application/json");

	        // ��û �ٵ� ����
	        StringJoiner sj = new StringJoiner("&");
	        for (Map.Entry<String, String> entry : bodyMap.entrySet()) {
	            sj.add(URLEncoder.encode(entry.getKey(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
	        }
	        byte[] postData = sj.toString().getBytes(StandardCharsets.UTF_8);

	        // �Է°� ��� Ȱ��ȭ
	        con.setDoOutput(true);
	        con.setDoInput(true);

	        // ��û �ٵ� ���ῡ ����
//	        try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
//	            wr.write(postData);
//	        }
	        
	        try (OutputStream wr = new DataOutputStream(con.getOutputStream())) {
	            wr.write(postData);
	        }

	        // ���� �ڵ�� �Է� ��Ʈ�� ���
	        int responseCode = con.getResponseCode();
	        InputStream is;
	        if (responseCode >= 400) {
	            is = con.getErrorStream();
	        } else {
	            is = con.getInputStream();
	        }

	        // ���� �ٵ� �б�
	        reader = new BufferedReader(new InputStreamReader(is));
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
	        String response = sb.toString();

	        // ���� �ٵ� Map���� �Ľ�
//	        Gson gson = new Gson();
//	        Type type = new TypeToken<Map<String, String>>(){}.getType();
//	        resultMap = gson.fromJson(response, type);
//	        resultMap.put("status", String.valueOf(responseCode));
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        // reader�� ���� �ݱ�
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
	 * 	 -> key = value ������ ������ �Ϲ� ��û �Ӽ��� �����Ѵ�.
	 * 		Ű�� �ִ� �ۼ��� �̹� �ִ� ��� ���� ���� �������� �����Ѵ�.
	 * 		�̷��� �޼ҵ�� ������ �����ϱ� ���� ȣ���ؾ��Ѵ�. 
	 * 		�Ϻ� �޼ҵ�� ������ �̹� ������ ��� llegalStateException�� �߻���Ų��.
	 * 		���� ���� Ŭ���� HttpURLConnection�� HTTP���� ����� ����Ͽ� ������ �����ϱ� ���� ���� �޼ҵ带 �����Ѵ�.
	 * 
	 * StringJoiner
	 *   -> StringBuilder �Ǵ� StringBuffer�� ����ϴٺ��� �߰� ����(����)�� �־�� �� ���� �ִ�.
	 *   	�̷� ��� �ϵ��ڵ� �� ��� ������ �������� ��������. java8�� �߰��� StringJoinŬ����
	 *   	ad.~ �� �ϸ� ad ���̿� "&" ���ڿ��� ���� �� �ִٴ� ��.
	 *   
	 * URLEncoder.encode
	 *   -> �츮�� ���� �������� url�� �ѱ��� �Է��ϸ� �������� �ڵ����� �ѱ����� ���ڵ��� ���ֱ� ������ �ѱ��� �� ���δ�.
	 *   	������ ��Ʈ�ѷ����� url�� ���� ����� �ѱ��� �߰����� ��� �������� ���ڵ��� �� �� ���� ������ �ش� �޼ҵ带 ���
	 *   	��� : �ƽ�Ű���ڰ� �ƴѰ��� 16������ ��ȯ���ش�.
	 * 
	 * setDoOutput / setDoInput
	 *   -> ������ �����͸� �������� / �������� ���� �����ؼ� ���/������ Ȱ��ȭ �ؾ��Ѵ�. 
	 *   
	 * DataOutputStream
	 *   -> ���� FileInputStream ���� ���ڳ� ����Ʈ ���ĸ� �а� �� �� �־���.
	 *   	�ٵ� ���ڸ� �а�ʹ�? ���ڳ� ������ �������θ� ���� �� �ۿ� ������.
	 *   	�׷��� �ڵ�� �а� �������� �׻� ���� �����ͷ� ��ȯ�������.
	 *   	�̰� ��ȯ���� ���ְ� ������ �а���ִ� Ŭ������ DataOutputStream, DataInputStream��!!
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
