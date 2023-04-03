package groad.groad_server.domain.portfolio.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import groad.groad_server.domain.common.BaseTimeEntity;
import groad.groad_server.domain.portfolio.vo.Category;

@Entity
@Table(name = "portfolio")
public class Portfolio extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "member_id")
	private Long memberId;

	@NotNull
	@Column(name = "category")
	private Category category;

	@NotNull
	@Column(name = "title")
	private String title;

	@NotNull
	@Lob
	@Column(name = "contents")
	private String contents;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;
}
