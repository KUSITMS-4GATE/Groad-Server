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

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import groad.groad_server.domain.common.BaseTimeEntity;
import groad.groad_server.domain.portfolio.vo.Category;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "portfolio")
@Where(clause = "deleted_at IS NULL")
@SQLDelete(sql = "UPDATE portfolio SET deleted_at = NOW() where id = ?")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

	@Builder
	public Portfolio(Long memberId, Category category, String title, String contents, LocalDate startDate,
			LocalDate endDate) {
		this.memberId = memberId;
		this.category = category;
		this.title = title;
		this.contents = contents;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
