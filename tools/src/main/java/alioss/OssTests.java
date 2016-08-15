package alioss;

import java.io.File;

/**
 * Created by jeremy on 2016/8/15.
 */
public class OssTests
{
    public static void main(String [] args)
    {
        String filePath ="D:\\Study.zip";
        File file = new File(filePath);

        AliyunOssClient client = new AliyunOssClient();
        boolean x = client.uploadFile(filePath, "test/1.zip");

        System.out.println(x);

    }
}
