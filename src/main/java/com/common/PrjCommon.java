package com.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrjCommon {

    private static String uploadpath;

    private static int pageSize;

    public static String getUploadpath() {
        return uploadpath;
    }

    @Value("${uploadpath}")
    public void setUploadpath(String uploadpath) {
        PrjCommon.uploadpath = uploadpath;
    }

    public static int getPageSize() {
        return pageSize;
    }

    @Value("${pageSize}")
    public void setPageSize(int pageSize) {
        PrjCommon.pageSize = pageSize;
    }
}
