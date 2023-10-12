package kr.ed.haebeop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class fileboard {
    private int articleno;
    private String id;
    private String title;
    private String content;
    private String regdate;
}
