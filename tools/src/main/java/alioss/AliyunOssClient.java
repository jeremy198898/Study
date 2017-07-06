package alioss;

import com.aliyun.oss.OSSClient;

import java.io.File;

/**
 * Created by jeremy on 2016/8/15.
 */
public class AliyunOssClient
{
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
