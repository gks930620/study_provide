package com.study.common.util;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.study.attach.vo.AttachVO;

@Component
public class AttachFileUtil {
	private static final String UPLOAD_PATH="C:\\workspace\\upload";   //  /home/ssam/upload    C:\\workspace\\upload

	public List<AttachVO> getAttachListAndSaveAllFile(MultipartFile[] multipartFiles, String category, String path)
			throws IOException {
		List<AttachVO> atchList = new ArrayList<AttachVO>();
		for (MultipartFile multipartFile : multipartFiles) {
			AttachVO attach=fileSaveAndGetAttach(multipartFile,category,path);
			atchList.add(attach);
		}
		return atchList;
	}
	public AttachVO fileSaveAndGetAttach(MultipartFile multipart, String category, String path) throws IOException {
		if (!multipart.isEmpty()) {
			String fileName = UUID.randomUUID().toString();
			String filePath = uploadPath + File.separatorChar + path;  //window linux 알아서
			FileUtils.copyInputStreamToFile(multipart.getInputStream(), new File(filePath, fileName));
			//파일저장
			AttachVO attach = new AttachVO();
			attach.setAtchOriginalName(multipart.getOriginalFilename());
			attach.setAtchFileSize(multipart.getSize());
			attach.setAtchContentType(multipart.getContentType());
			attach.setAtchFileName(fileName);
			attach.setAtchCategory(category);
			attach.setAtchPath(path);
			attach.setAtchFancySize(fancySize(multipart.getSize()));
			return attach;
		}
	}




	private DecimalFormat df = new DecimalFormat("#,###.0");

	private String fancySize(long size) {
		if (size < 1024) { // 1k 미만
			return size + " Bytes";
		} else if (size < (1024 * 1024)) { // 1M 미만
			return df.format(size / 1024.0) + " KB";
		} else if (size < (1024 * 1024 * 1024)) { // 1G 미만
			return df.format(size / (1024.0 * 1024.0)) + " MB";
		} else {
			return df.format(size / (1024.0 * 1024.0 * 1024.0)) + " GB";
		}
	}

}