package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.liangfacan53.courses.sf.ssm.springmvc.service.FileDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@RequestMapping("/file/download")
@Controller
public class FileDownloadController {

    public static final String FILE_LOC = "/file/download";

    @Autowired
    private FileDownloadService service;

    @GetMapping("")
    public ModelAndView listFiles(HttpServletRequest request) {
        String directory = request.getSession().getServletContext().getRealPath(FILE_LOC);
        return new ModelAndView("file/download/index", service.getFiles(directory));
    }

    @GetMapping("/download")
    public void download(@RequestParam String filename,
                         HttpServletRequest request, HttpServletResponse response) {
        File file = new File(request.getSession().getServletContext().getRealPath(FILE_LOC), filename);
        try {
            // region http-header
            // get the file content-type and set it as the response's content-type
            response.setHeader("Content-Type", Files.probeContentType(file.toPath()));
            response.setHeader("Content-Disposition", "attachment; filename="
                    + new String(filename.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1));
            // endregion http-header
            ServletOutputStream out = response.getOutputStream();
            service.downloadFile(file, out);
            out.flush();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

