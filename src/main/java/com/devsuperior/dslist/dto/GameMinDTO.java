package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
		
		//atributos
		private Long id;
		private String title;		
		private Integer year;
		private String imgUrl;
		private String shortDescription;
		
		//contrutores
		public GameMinDTO() {
		}
		public GameMinDTO(Game entity) {
			id = entity.getId();
			title = entity.getTitle();
			year = entity.getYear();
			imgUrl = entity.getImgUrl();
			shortDescription = entity.getShortDescription();
		}
		
		//getters
		public Long getId() {
			return id;
		}
		public String getTitle() {
			return title;
		}
		public Integer getYear() {
			return year;
		}
		public String getImgUrl() {
			return imgUrl;
		}
		public String getShortDescription() {
			return shortDescription;
		}
		
}