package cs.matemaster.stdcs.functional;

import lombok.Data;

import java.util.List;

/**
 * @author matemaster
 */
@Data
public class AlbumDto {
    /**
     * 专辑名称
     */
    private String name;

    /**
     * 专辑曲目
     */
    private List<TrackDto> tracks;

    /**
     * 出专辑的作者/乐队
     */
    private List<ArtistDto> musicians;
}
