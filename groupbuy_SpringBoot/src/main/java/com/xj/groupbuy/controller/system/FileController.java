package com.xj.groupbuy.controller.system;

import com.xj.groupbuy.common.properties.FileProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author : 220512309dyx
 * Date : 2025/6/9
 */
@Controller
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileProperties fileProperties;
    
    @ResponseBody
    @RequestMapping(value = "image",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@RequestParam String filePath) throws IOException {
        
        FileInputStream is = null;
        byte[] bytes;
        try {
            File file = new File(fileProperties.getPath() + filePath);
            is = new FileInputStream(file);
            bytes = new byte[is.available()];
            is.read(bytes, 0, is.available());
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                is.close();
            }
        }
        return null;
    }
}

