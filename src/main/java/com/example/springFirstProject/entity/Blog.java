package com.example.springFirstProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Blog {
	
		@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String blogTitle;
		
		public Long getBlogId() {
			return id;
		}
		public void setBlogId(Long blogId) {
			this.id = blogId;
		}
		public String getBlogTitle() {
			return blogTitle;
		}
		public void setBlogTitle(String blogTitle) {
			this.blogTitle = blogTitle;
		}

}



