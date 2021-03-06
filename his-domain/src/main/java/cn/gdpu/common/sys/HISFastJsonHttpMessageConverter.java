package cn.gdpu.common.sys;

import cn.gdpu.common.utils.RtnCodeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Created by 郭旭辉 on 2016/3/17.
 */
public class HISFastJsonHttpMessageConverter<T> extends AbstractHttpMessageConverter<T> {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    private Charset charset;
    private SerializerFeature[] features;

    public HISFastJsonHttpMessageConverter() {
        super(new MediaType[]{new MediaType("application", "json", UTF8), new MediaType("application", "*+json", UTF8)});
        this.charset = UTF8;
        this.features = new SerializerFeature[0];
        this.features = new SerializerFeature[1];
        this.features[0] = SerializerFeature.DisableCircularReferenceDetect;
    }

    protected boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    protected T readInternal(Class<? extends T> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        InputStream in = inputMessage.getBody();

        byte[] buf = new byte[1024];
        for (;;) {
            int len = in.read(buf);
            if (len == -1) {
                break;
            }

            if (len > 0) {
                baos.write(buf, 0, len);
            }
        }

        byte[] bytes = baos.toByteArray();
        return JSON.parseObject(bytes, 0, bytes.length, charset.newDecoder(), clazz);
    }

    public Charset getCharset() {
        return this.charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public SerializerFeature[] getFeatures() {
        return this.features;
    }

    public void setFeatures(SerializerFeature... features) {
        this.features = features;
    }

    protected void writeInternal(T t, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        ResponseT response = new ResponseT(RtnCodeEnum.SUCCESS);
        response.setBizData(t);
        OutputStream out = outputMessage.getBody();
        String text = JSON.toJSONString(response, this.features);
        byte[] bytes = text.getBytes(this.charset);
        out.write(bytes);
    }
}
