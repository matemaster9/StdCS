package cs.matemaster.stdcs.functional;

import lombok.Data;

import java.util.List;

/**
 * @author matemaster
 */
@Data
public class ArtistDto {
    /**
     * 艺术家名称
     */
    private String name;

    /**
     * 艺术家成员
     */
    private List<ArtistDto> members;

    /**
     * 国籍
     */
    private String nationality;
}
