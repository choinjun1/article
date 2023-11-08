package com.example.article.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequiredArgsConstructor
public class UploadController {
    @GetMapping("/upload/upload") //입력폼 이동
    public String uploadForm(Model model)throws Exception{
        return "upload/upload";
    }

    @PostMapping("/upload/upload")
    public void uploadProc(String title, MultipartFile file,
                             Model model) throws Exception{
        System.out.println(file.getOriginalFilename());
    }
}
