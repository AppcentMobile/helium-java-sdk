package mobi.appcent.helium.response.challenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.challenge.Challenge;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class ChallengesResponse {
    public List<Challenge> data;
    public String cursor;
}
