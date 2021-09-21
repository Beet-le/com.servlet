package com.bt.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    要获取下载文件的路径
//        String realPath = this.getServletContext().getRealPath("/1.png");
        String realPath = "E:\\IDEAProjects\\javaweb\\com.servlet\\response\\src\\main\\resources\\1.png";
        System.out.println("获取下载文件的路径:"+realPath);
//    下载的文件名是啥？
        String fileName = realPath.substring(realPath.lastIndexOf("\\" + 1));
//    设置想办法让浏览器能够支持下载(Content-Disposition)我们需要的东西
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"utf-8"));
//     获取下载文件的输入流
        FileInputStream in=new FileInputStream(realPath);
//     创建缓冲区
        int len=0;
        byte[] buffer =new byte[1024];
//    获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
//    将FileOutputStream流写入到bufer缓冲区
        while ((len=in.read(buffer))>0){
                out.write(buffer,0,len );
        }
        in.close();
        out.close();
//    使用OutputStream将缓冲区中的数据输出到客户端！

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
