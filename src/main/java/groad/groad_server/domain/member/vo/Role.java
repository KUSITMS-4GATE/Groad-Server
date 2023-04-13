package groad.groad_server.domain.member.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER"), // OAuth
    ADMIN("ROLE_ADMIN");

    private final String value;
}
