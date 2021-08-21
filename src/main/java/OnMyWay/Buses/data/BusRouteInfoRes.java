package OnMyWay.Buses.data;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BusRouteInfoRes {

    private String busRoueteId;     // busRouteId	string	노선 ID
    private String busRouteNm;      // busRouteNm	string	노선명
    private String length;          // length	    string	노선 길이 (Km)
    private String routeType;       // routeType	string	노선 유형 (1:공항, 2:마을, 3:간선, 4:지선, 5:순환, 6:광역, 7:인천, 8:경기, 9:폐지, 0:공용)
    private String stStationNm;     // stStationNm	string	기점
    private String edStationNm;     // edStationNm	string	종점
    private String term;            // term	        string	배차간격 (분)
    private String lastBusYn;       // lastBusYn	string	막차운행여부
    private String firstBusTm;      // firstBusTm	string	금일첫차시간
    private String lastBusTm;       // lastBusTm	string	금일막차시간
    private String firstLowTm;      // firstLowTm	string	금일저상첫차시간
    private String lastLowTm;       // lastLowTm	string	금일저상막차시간
    private String corpNm;          // corpNm	    string	운수사명
    private String allCtintnAll;    // allCtintnAll	string	배차간격
    private String tmAll;           // tmAll	    string	첫차~막차
}
