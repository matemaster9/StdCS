package cs.matemaster.stdcs.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author matemaster
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackDto {

    /**
     * 曲目名称
     */
    private String name;

    /**
     * 曲目时间长度
     */
    private Integer length;
}
