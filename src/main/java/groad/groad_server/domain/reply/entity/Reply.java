package groad.groad_server.domain.reply.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import groad.groad_server.domain.reply.vo.ExperienceType;

@Entity
@Table(name = "reply")
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
}
