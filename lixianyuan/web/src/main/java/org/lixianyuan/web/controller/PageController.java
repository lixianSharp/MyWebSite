package org.lixianyuan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Aauthor xianyuan_li@qq.com
 * @Date: Create in 10:36 2019/4/26
 * @Description:
 */
@Controller
public class PageController {
    //页面跳转 关于
    @RequestMapping(value="/about")
    public String about(){
        return "about/about";
    }

    //页面跳转  首页
    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }

    //页面跳转  闲言碎语
    @RequestMapping(value="/xysy")
    public String xysy(){
        return "frontPage/xysy";
    }

    //页面跳转  博客笔记分享
    @RequestMapping(value="/noteShare")
    public String noteShare(){
        return "frontPage/blogNoteShare";
    }

    //页面跳转  相册
    @RequestMapping(value="/photo")
    public String photo(){
        return "frontPage/photo";
    }

    //页面跳转  相册2
    @RequestMapping(value="/photoTwo")
    public String photoTwo(){
        return "frontPage/photo2.html";
    }

}
