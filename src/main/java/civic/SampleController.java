package civic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.civic.sip.CivicSip;
import com.civic.sip.config.CivicConfig;
import com.civic.sip.model.UserData;


@RestController
public class SampleController {

    public static final String PUBLIC_KEY
            = "049a45998638cfb3c4b211d72030d9ae8329a242db63bfb0076a54e7647370a8ac5708b57af6065805d5a6be72332620932dbb35e8d318fce18e7c980a0eb26aa1";

    private CivicSip civicSip = new CivicSip(
            new CivicConfig(
                    "[Your APP-ID]",
                    "[Your APP Secret]",
                    "[Your APP Private Signing Key]",
                    PUBLIC_KEY,
                    "prod"));

    public static final String APP_ID = "HJAjXfL-f";

    @GetMapping("/appId")
    public String getApplicationId() {
        return APP_ID;
    }

    @PostMapping("/token")
    public UserData token(@RequestBody String token) throws Exception {
        return civicSip.exchangeToken(token);
    }
}
