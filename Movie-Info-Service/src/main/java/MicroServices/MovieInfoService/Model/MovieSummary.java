package MicroServices.MovieInfoService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSummary {
    private String id;
    private String title;
    private String overview;

}
