package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Shopping")
public class ShoppingEntity {
	// �Ǹ��� ��ǰ : �׼�����
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id; // ��ǰ id
	private String userId; // ����� ���̵�
	private String title; // ��ǰ �̸�
	private String category; // ��ǰ ����
	private String maker; // ��ǰ �귣��
}
