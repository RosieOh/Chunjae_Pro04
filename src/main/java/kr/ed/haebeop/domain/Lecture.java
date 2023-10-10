package kr.ed.haebeop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
    private String lcode;
    private String lname;
    private String lfile;
    private String lscode;
    private String bcode;
    private String pcode;
    private String stup;
}
