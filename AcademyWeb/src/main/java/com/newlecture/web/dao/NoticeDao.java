package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeDao {
	List<NoticeView> getViewList();
	List<Notice> getList();
	List<NoticeView> getViewList(int page);
	List<NoticeView> getViewList(int page, String query);
	List<NoticeView> getViewList(int page, String query, String field);
	
	NoticeView getNoticeView(int id);
	Notice getNotice(int id);
	int insert(Notice notice);
	int update(Notice notice);
	int delete(int id);
	
}
