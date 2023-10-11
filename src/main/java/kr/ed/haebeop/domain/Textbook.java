package kr.ed.haebeop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Textbook {
    private String tbcode;
    private String tbname;
    private String tbindex;
    private String tbpublisher;
    private String tbpubday;
    private String tbauthor;
    private String price;
    private String tbnote;
}
