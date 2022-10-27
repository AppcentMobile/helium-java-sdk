package mobi.appcent.helium.api;

import mobi.appcent.helium.model.ApiResponse;
import mobi.appcent.helium.model.Hotspot;
import mobi.appcent.helium.model.HotspotsResponse;

import java.io.IOException;
import java.util.List;

public interface IHotspotApi {
    public ApiResponse<HotspotsResponse> getHotspots() throws IOException;
}
