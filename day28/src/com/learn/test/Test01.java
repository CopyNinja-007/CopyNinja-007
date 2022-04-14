package com.learn.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) throws MalformedURLException {
        Map<URL,String> hashMap = new HashMap<>();
        hashMap.put(new URL("https://tse1-mm.cn.bing.net/th/id/R-C.8ac47ee834ae63c7b84f36af76ddee18?rik=pykcdiKf74oyEw&riu=http%3a%2f%2fp1.music.126.net%2f5adBjukhuxdkRZTzzEDkFw%3d%3d%2f109951166099580448.jpg&ehk=aivX5HZS1NIny2lU0YRivhIABmpChJxt1%2fV17H1nkxw%3d&risl=&pid=ImgRaw&r=0"),"F:\\Java\\workspace\\day28\\src\\com\\learn\\test\\a.jpg");
        hashMap.put(new URL("https://tse4-mm.cn.bing.net/th/id/OIP-C.0fNHvq-gpgvU8sLxOyuqAgHaHO?pid=ImgDet&rs=1"),"F:\\Java\\workspace\\day28\\src\\com\\learn\\test\\b.jpg");
        hashMap.put(new URL("https://tse1-mm.cn.bing.net/th/id/R-C.f3d78ca1aab284b627119e746ca091a4?rik=TYXOSdEuk0iolw&riu=http%3a%2f%2fp1.music.126.net%2fbY55ZAk9Er22GUChx5EKUw%3d%3d%2f109951165895427870.jpg&ehk=5e8yxMXjWi0IKzux7OL59RX3Kmev4ShyheVg69j8QwM%3d&risl=&pid=ImgRaw&r=0"),"F:\\Java\\workspace\\day28\\src\\com\\learn\\test\\c.jpg");
        for (Map.Entry<URL,String>  element: hashMap.entrySet()) {
            new Thread(new DownloadThread(element.getKey(),element.getValue())).start();
        }
    }
}

class DownloadThread implements Runnable {
    private URL url;
    private String targetPath;

    public DownloadThread(URL url,String targetPath) {
        this.url = url;
        this.targetPath = targetPath;
    }

    @Override
    public void run() {
        InputStream in = null;
        FileOutputStream out = null;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            in = httpURLConnection.getInputStream();
            out = new FileOutputStream(targetPath);
            byte[] bytes = new byte[1024];
            int len;
            while((len = in.read(bytes)) != -1) {
                out.write(bytes,0,len);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

