package org.liangfacan53.courses.sf.ssm.springmvc.service;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class FileUploadService {

    public static String generateFileName(String filename) {
        String formatDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int random = new Random().nextInt(10000);
        return formatDate + "_" + random + "_" + filename;
    }

    public void saveFile(MultipartFile multipartFile, String targetDirectory) throws IOException {
        String originalFilename = multipartFile.getOriginalFilename();
        assert originalFilename != null;
        String targetFileName = generateFileName(originalFilename);

        //region save the file to the target directory
        File target = new File(targetDirectory, targetFileName);
        FileUtils.copyInputStreamToFile(multipartFile.getInputStream(), target);
        //endregion save the file to the target directory

        //region insert the file infos into database

        //endregion insert the file infos into database
    }
}
