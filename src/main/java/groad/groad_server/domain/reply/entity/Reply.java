package groad.groad_server.domain.reply.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import groad.groad_server.domain.reply.vo.ExperienceType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reply")
@Where(clause = "deleted_at IS NULL")
@SQLDelete(sql = "UPDATE reply SET deleted_at = NOW() where id = ?")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "member_id")
	private Long memberId;

	@NotNull
	@Column(name = "experience_type")
	private ExperienceType experienceType;

	@NotNull
	@Column(name = "experience_id")
	private Long experienceId;

	@Column(name = "contents")
	private String contents;

	@Builder
	public Reply(Long memberId, ExperienceType experienceType, Long experienceId, String contents) {
		this.memberId = memberId;
		this.experienceType = experienceType;
		this.experienceId = experienceId;
		this.contents = contents;
	}
}
