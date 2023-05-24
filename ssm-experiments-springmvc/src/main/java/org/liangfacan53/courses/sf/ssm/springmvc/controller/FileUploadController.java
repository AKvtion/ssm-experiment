package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.liangfacan53.courses.sf.ssm.springmvc.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequestMapping("/file/upload")
@Controller
public class FileUploadController {

    public static final String FILE_LOC = "/file/upload";

    @Autowired
    private FileUploadService service;

    @RequestMapping("")
    public String fileUpload() {
        return "/file/upload/index";
    }

    @PostMapping("/upload")
    public ModelAndView upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/file/upload/result");
        if (multipartFile == null || multipartFile.isEmpty()) {
            modelAndView.addObject("message", "未选择文件");
        } else {
            try {
                service.saveFile(multipartFile, request.getSession().getServletContext().getRealPath(FILE_LOC));
                modelAndView.addObject("message", "上传成功");
            } catch (IOException e) {
                e.printStackTrace();
                modelAndView.addObject("message", "上传失败" + e.getMessage());
            }
        }
        return modelAndView;
    }
}
