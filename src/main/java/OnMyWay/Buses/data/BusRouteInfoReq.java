package OnMyWay.Buses.data;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class BusRouteInfoReq {

    @Value("${bus.serviceKey}")
    private String serviceKey;  // serviceKey	string (필수)	발급받은 키 값
    private String busRouteId;  // busRouteId	string (필수)	노선 시스템 ID

    public String makeURI() {
        StringBuilder uri = new StringBuilder("http://ws.bus.go.kr/api/rest/busRouteInfo");
        uri.append("/getRouteInfo?ServiceKey=");
        uri.append(this.getServiceKey());
        uri.append("&busRouteId=");
        uri.append(this.getBusRouteId());
        return uri.toString();
    }
}