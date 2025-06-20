package com.devraphael.dscommerce.dto;

import com.devraphael.dscommerce.entities.Category;

public class CategoryDTO {

	private Long id;
	private String name;

	public CategoryDTO() {}
		/* 
		 * Criei o construtor vázio pois estava retornando a seguinte exception ao tentar inserir um produto novo:
		 * org.springframework.http.converter.HttpMessageConversionException: Type definition error: [simple type, class com.devraphael.dscommerce.dto.CategoryDTO] 
		*/

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CategoryDTO(Category entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
