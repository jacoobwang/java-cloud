package Walker;

import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import Walker.client.LingCutoutGroupClient;
import Walker.model.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{

    private static String accessKeyId = "";
    private static String secretKey = "";
    private static CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretKey);
    private static LingCutoutGroupClient client = LingCutoutGroupClient.builder()
            .credentialsProvider(credentialsProvider)
            .httpRequestConfig(new HttpRequestConfig.Builder().connectionTimeout(10000).protocol(Protocol.HTTPS).build())
            .environment(new Environment.Builder().endpoint("wko7luloi5tj.cn-north-1.jdcloud-api.net").build()) // 线上环境地址
            .build();


    public static void main( String[] args ) {
//        RestTemplate restTemplate = new RestTemplate();
//        //header示例参数
//        HttpHeaders httpHeaders = new HttpHeaders();
//        byte[] bytes = dataBinary("test.jpg");
//        HttpEntity<Object> requestEntity = new HttpEntity<>(bytes, httpHeaders);
//        //以下参数仅为示例值
//        String requestUrl = "http://ling-console.jdcloud.com/api/cutout";
//        ResponseEntity<String> responseEntity = null;
//        try {
//            responseEntity = restTemplate.postForEntity(requestUrl, requestEntity, String.class);
//        } catch (Exception e) {
//            //调用API失败，错误处理
//            throw new RuntimeException(e);
//        }

        // test
        getHealth();
    }

    private static void getHealth()
    {
        final String uri = "http://127.0.0.1:3300/api/health";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }


    public static byte[] dataBinary(String addr) {
        byte[] data = null;
        FileImageInputStream input = null;
        try {
            input = new FileImageInputStream(new File(addr));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int numBytesRead = 0;
            while ((numBytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, numBytesRead);
            }
            data = output.toByteArray();
            output.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return data;
    }

}
