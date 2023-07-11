package com.sbs.java.ssg.Container;

import com.sbs.java.ssg.dao.ArticleDao;
import com.sbs.java.ssg.dao.MemberDao;

public class Container {
	public static ArticleDao articleDao;
	public static MemberDao memberDao;
	
	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
	}

}