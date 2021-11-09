package study.service;

import org.springframework.stereotype.Service;
import study.exception.CustomizedErrorException;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@Service
public class LogService {
    /**
     * 下载指定位置的文件  中文暂时不能下载
     * @param name
     * @param response
     * @throws Exception
     */
    public void logDownload(String name, HttpServletResponse response) throws Exception {
        File file = new File("D:/"  + name);

        if (!file.exists()) {
            throw new CustomizedErrorException("文件不存在");
        }
        response.setContentType("application/force-download");
        response.addHeader("Content-Disposition", "attachment;fileName=" + name);

        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        }
    }


}
