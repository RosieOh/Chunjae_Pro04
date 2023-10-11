package kr.ed.haebeop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applylecture {
    private String alcode;
    private String allec_code;
    private String stuid;
    private String altime;
    private int per;
}
