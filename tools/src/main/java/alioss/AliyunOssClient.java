package alioss;

import com.aliyun.oss.OSSClient;

import java.io.File;

/**
 * Created by jeremy on 2016/8/15.
 */
public class AliyunOssClient
{
    private static final String accessKeyId = "fRjZgRrA0L745UVh";
    private static final String accessKeySecret = "JxgOW52RnXvgnNmGvE9W3Gus5gbvqm";
    private static final String endPoint = "oss-cn-hangzhou.aliyuncs.com";

    private static final String buket = "gomro-resources";
    private static final String static_url = "http://static.gomro.cn/";

    private OSSClient ossClient;

    public AliyunOssClient()
    {
        OSSClient ossClient = new OSSClient(endPoint, accessKeyId, accessKeySecret);
        this.ossClient = ossClient;
    }

    /*
    object 为oss的存储路径和传入新文件的命名 例如：test/test.zip
     */
    public boolean uploadFile(String filePath, String object)
    {
        File file = new File(filePath);
        ossClient.putObject(buket,  object, file);
        return true;
    }

}
