package org.liangfacan53.courses.sf.ssm.springmvc.service;

import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class FileDownloadService {

    public Map<String, ArrayList<String>> getFiles(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        ArrayList<String> filenames = new ArrayList<String>();
        if (files != null) {
            for (File file : files) {
                filenames.add(file.getName());
            }
        }
        HashMap<String, ArrayList<String>> ret = new HashMap<>();
        ret.put("filenames", filenames);
        return ret;
    }

    public void downloadFile(File file, ServletOutputStream out) throws IOException {
        FileInputStream in = new FileInputStream(file);
        int count = 0;
        byte[] b = new byte[1024];
        while ((count = in.read(b)) != -1) {
            out.write(b, 0, count);
        }
        out.flush();
        in.close();
    }
}

