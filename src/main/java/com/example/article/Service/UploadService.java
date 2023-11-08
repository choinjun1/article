package com.example.article.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;


@Service
@RequiredArgsConstructor
@Transactional
public class UploadService {
    @Value("${imgLocation}")
    private String imgLocation; //파일을 저장할 위치, c:/image/item

    private final FileService fileService; //파일 저장 및 삭제처리 클래스
    //파일저장
    //저장할 경로, 파일명, 파일의 바이트값을 fileService 전달해서 저장
    public void saveImg(MultipartFile imgFile) throws Exception{
        String originalFileName = imgFile.getOriginalFilename();
        String newFileName = ""; //파일 저장 후 uuid로 생성한 파일명을 저장할 변수

        if(!StringUtils.isEmpty(originalFileName)){ //파일이 존재하면
            //경로, 파일명, 데이터(바이트형)
           newFileName = fileService.uploadFile(imgLocation, originalFileName, imgFile.getBytes());

       }
    }
}
