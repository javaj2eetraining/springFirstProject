package com.example.springFirstProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Blog {
	
		@Id
    	@GeneratedValue(strategy = GenerationType.AUTO)
		private Long blogId;
		
		private String blogTitle;
		
		public Long getBlogId() {
			return blogId;
		}
		public void setBlogId(Long blogId) {
			this.blogId = blogId;
		}
		public String getBlogTitle() {
			return blogTitle;
		}
		public void setBlogTitle(String blogTitle) {
			this.blogTitle = blogTitle;
		}

}



