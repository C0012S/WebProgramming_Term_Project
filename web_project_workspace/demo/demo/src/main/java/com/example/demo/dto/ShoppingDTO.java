package com.example.demo.dto;

import com.example.demo.model.ShoppingEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingDTO {
	// �Ǹ��� ��ǰ : �׼�����
	private String id; // ��ǰ id
	private String userId; // ����� ���̵�
	private String title; // ��ǰ �̸�
	private String category; // ��ǰ ����
	private String maker; // ��ǰ �귣��
	
	public ShoppingDTO(final ShoppingEntity entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.title = entity.getTitle();
		this.category = entity.getCategory();
		this.maker = entity.getMaker();
	}
	
	public static ShoppingEntity toEntity(final ShoppingDTO dto) {
		return ShoppingEntity.builder()
				.id(dto.getId())
				.userId(dto.getUserId())
				.title(dto.getTitle())
				.category(dto.getCategory())
				.maker(dto.getMaker())
				.build();
	}
}
