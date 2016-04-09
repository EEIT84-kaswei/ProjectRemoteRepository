package _05_newsArticle.model;

import java.io.Serializable;
/* 陳姵吟 Carley Chen, 01-04-2016 */

public class ArticleBean implements Serializable{
	private Integer ano;
	private Integer id;
	private String aname;
	private java.util.Date atime;
	private String atitle;
	private String acontext;		
	
	@Override
	public String toString() {
		return "ArticleBean [ano=" + ano + ", id=" + id + ", aname=" + aname
				+ ", atime=" + atime + ", atitle=" + atitle + ", acontext="
				+ acontext + "]";
	}
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public java.util.Date getAtime() {
		return atime;
	}
	public void setAtime(java.util.Date atime) {
		this.atime = atime;
	}
	public String getAtitle() {
		return atitle;
	}
	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}
	public String getAcontext() {
		return acontext;
	}
	public void setAcontext(String acontext) {
		this.acontext = acontext;
	}

}
