package OnMyWay.Buses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import OnMyWay.Buses.data.BusRouteInfoReq;

@RestController
public class ApiTestController {

    @Autowired
    BusRouteInfoReq busRouteInfoReq;

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/api/bus")
    public String requestBusRouteInfo() throws UnsupportedEncodingException {
        String url = busRouteInfoReq.makeURI();
        System.out.println("url : " + busRouteInfoReq.getServiceKey());

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpheaders = new HttpHeaders();
        httpheaders.setContentType(MediaType.APPLICATION_JSON);

//        HttpEntity<String> entity = new HttpEntity<>(httpheaders);
//        //BusRouteInfoRes busRouteInfoRes = restTemplate.exchange(url, HttpMethod.GET, entity, BusRouteInfoRes.class).getBody();
//        //System.out.println(busRouteInfoRes.toString());
//        String str = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
//        System.out.println(str);
//        return str;
        return "hello";
    }
}
