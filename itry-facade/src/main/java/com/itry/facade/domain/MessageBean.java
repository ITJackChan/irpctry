package com.itry.facade.domain;

import java.io.Serializable;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String title;

	private String message;

	/**
	 * @param id
	 * @param title
	 * @param message
	 */
	public MessageBean(String id, String title, String message) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
	}

	/**
	 * 
	 */
	public MessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MessageBean [id=" + id + ", title=" + title + ", message=" + message + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
