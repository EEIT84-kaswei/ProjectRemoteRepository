package _05_newsArticle.model;
/* 陳姵吟 Carley Chen, 01-04-2016 */

import java.util.List;

import _05_newsArticle.model.NewsBean;

public interface NewsDAO {

	public abstract List<NewsBean> select();

	public abstract NewsBean select(int nno);

	public abstract List<NewsBean> selectByDate(java.util.Date ntime);

	public abstract NewsBean insert(NewsBean bean);

	public abstract NewsBean update(NewsBean bean);

	public abstract boolean delete(int nno);

}