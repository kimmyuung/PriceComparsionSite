package com.example.pricecomparisonsite.model.APIRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class APIRequestDto {

    String key = "5000703152";     //		필수	발급받은 인증키
    String type = "json"; //	필수	검색결과 포맷
    String oilCompany;//		선택	정유사
    String routeCode;//	string	선택	노선코드
    String serviceAreaCode;//	string	선택	영업부대시설코드
    String numOfRows;//	string	선택	한 페이지당 출력건수
    String pageNo;//	string	선택	출력 페이지번호
    String routeName;//	string	선택	노선명
    String serviceAreaCode2; //	선택	휴게소/주유소코드
    String stringserviceAreaName;	//	선택	휴게소/주유소명
    String direction; // 방향
}
